package co.serinem.jco.einvoice;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.xml.namespace.QName;

import org.jco.jaxws.client.ArrayOfDestinatario;
import org.jco.jaxws.client.ArrayOfFacturaDetalle;
import org.jco.jaxws.client.ArrayOfFacturaImpuestos;
import org.jco.jaxws.client.ArrayOfImpuestosTotales;
import org.jco.jaxws.client.ArrayOfMediosDePago;
import org.jco.jaxws.client.ArrayOfObligaciones;
import org.jco.jaxws.client.ArrayOfTributos;
import org.jco.jaxws.client.ArrayOfstring;
import org.jco.jaxws.client.Cliente;
import org.jco.jaxws.client.Destinatario;
import org.jco.jaxws.client.Direccion;
import org.jco.jaxws.client.DocumentResponse;
import org.jco.jaxws.client.FacturaDetalle;
import org.jco.jaxws.client.FacturaGeneral;
import org.jco.jaxws.client.FacturaImpuestos;
import org.jco.jaxws.client.IService;
import org.jco.jaxws.client.ImpuestosTotales;
import org.jco.jaxws.client.MediosDePago;
import org.jco.jaxws.client.Obligaciones;
import org.jco.jaxws.client.Service;
import org.jco.jaxws.client.Tributos;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MInvoiceTax;
import org.compiere.model.MProduct;
import org.compiere.model.MSysConfig;
import org.compiere.util.AdempiereUserError;
import org.compiere.util.CLogger;
import org.compiere.util.Env;

public class Conexion {

	private final static CLogger log = CLogger.getCLogger(Conexion.class);

	private static FacturaGeneral factura;

	public static void getWebServiceHKA(MInvoice invoice, StringBuilder respuesta) {

		log.warning("entra a la tarea de consumir ff warning");

		Service service = new Service();
		System.out.println("Retrieving the port fromthe following service: " + service);
		QName qName = new QName("http://tempuri.org/", "BasicHttpBinding_IService");

		IService port = service.getPort(qName, IService.class);
		String adjuntos = "0";

		String tokenEmpresa = MSysConfig.getValue("TOKEN_EMPRESA", "", invoice.getAD_Client_ID(),
				invoice.getAD_Org_ID());
		if (tokenEmpresa.isEmpty())
			throw new AdempiereUserError(
					"Suministrar el Token Empresa para la autorizacion de facturacion electronica  @No@  AD_Org_ID="
							+ invoice.getAD_Org_ID());

		String tokenPassword = MSysConfig.getValue("TOKEN_PASSWORD", "", invoice.getAD_Client_ID(),
				invoice.getAD_Org_ID());

		if (tokenPassword.isEmpty())
			throw new AdempiereUserError(
					"Suministrar el Token Password para la autorizacion de facturacion electronica  @No@ AD_Org_ID="
							+ invoice.getAD_Org_ID());

		System.out.println("Token Empresa  : " + tokenEmpresa);
		System.out.println("Token Password  : " + tokenPassword);

		buildDocument("FVPM-1", invoice, respuesta);

		DocumentResponse response = port.enviar(tokenEmpresa, tokenPassword, factura, adjuntos);
		respuesta.append("\n");
		respuesta.append(response.getCodigo().toString() + "|" + "No Doc: " + invoice.getDocumentNo() + "|"
				+ response.getMensaje());
//		System.out.println(response.getCodigo().toString() + "|" + "No Doc: " + invoice.getDocumentNo() + "|"
//				+ response.getMensaje());
//
//		System.out.println("Tarea realizada en " + new Date());

	}

	private static void buildDocument(String rangNumeration, MInvoice invoice, StringBuilder respuesta) {
		// TODO Auto-generated method stub

		System.out.println("Factura  id : " + invoice.getC_Invoice_ID());
		System.out.println("Factura  documentno : " + invoice.getDocumentNo());

		System.out.println("fecha facturacion : " + invoice.getDateInvoiced());
		respuesta.append(invoice.get_Value(invoice.COLUMNNAME_DocumentNo)).append("|");
		respuesta.append(invoice.getDocumentNo()).append("|");

		respuesta.append(invoice.getCreated()).append("|");
		respuesta.append(invoice.getGrandTotal()).append("|");

		System.out.println("Factura  object : " + invoice);

		factura = new FacturaGeneral();
		Direccion direccionGene = new Direccion(); //

		List<FacturaDetalle> detalle = new ArrayList<FacturaDetalle>();
		List<FacturaImpuestos> impuestosGeneralesxLinea = new ArrayList<FacturaImpuestos>();
		List<ArrayOfFacturaImpuestos> arrayOfFacturaImpuestosxLinea = new ArrayList<ArrayOfFacturaImpuestos>();
		FacturaImpuestos impuestosGenerales = new FacturaImpuestos(); // fel_impuestos
		List<ArrayOfImpuestosTotales> arrayOfImpuestosTotalesxLinea = new ArrayList<ArrayOfImpuestosTotales>();
		List<ImpuestosTotales> impTotalesxLinea = new ArrayList<ImpuestosTotales>();
		ArrayOfFacturaDetalle arrayOfFacturaDetalle = new ArrayOfFacturaDetalle();

		// Datos de la Factura
		factura.setConsecutivoDocumento(invoice.getDocumentNo()); // fel_factura
		factura.setCantidadDecimales("2"); // nuevo
//		fecha facturacion : 2020-01-29 00:00:00.0
//		 System.out.println("Timestamp : "+invoice.getDateInvoiced());  
		// returns a string object in JDBC timestamp escape format .
		String strDateInvoiced = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(invoice.getDateInvoiced());
		String strDateInvoiced1 = new SimpleDateFormat("yyyy-MM-dd").format(invoice.getDateInvoiced());
		System.out.println("String Timestamp : " + strDateInvoiced);
//	        2020-11-28 00:00:00.0
//		factura.setFechaEmision("2020-01-18 00:14:11"); // fel_factura
		factura.setFechaEmision(strDateInvoiced); // fel_factura
		factura.setFechaFinPeriodoFacturacion("2020-12-30 00:00:00"); // fel_factura
		factura.setFechaInicioPeriodoFacturacion("2020-08-30 00:00:00"); // fel_factura
		factura.setFechaPagoImpuestos(strDateInvoiced1); // nuevo
		factura.setFechaVencimiento(strDateInvoiced1); // fel_factura

		ArrayOfstring infAdicional = new ArrayOfstring();
		infAdicional.getString().add("Nota de la Factura");
		infAdicional.getString().add("algo mas");

		factura.setInformacionAdicional(infAdicional); // fel_factura
		factura.setMoneda("COP"); // fel_factura
		factura.setPropina(""); // fel_factura
		factura.setRangoNumeracion(rangNumeration); // fel_factura //FV-1 o NC-1 o ND-1 Dependiendo el tipo de documento
		factura.setRedondeoAplicado("0.00"); // fel_factura
		factura.setTipoDocumento("01"); // valores de la Tabla 1 fel_factura // Del 01 al 09
//		factura.setTipoOperacion("05"); // valores de la Tabla 2

		direccionGene.setMunicipio("11001"); // fel_direcciones

		direccionGene.setCiudad("BOGOTA, D.C."); // fel_direcciones
		direccionGene.setZonaPostal("050001"); // fel_direcciones
		direccionGene.setDepartamento("Cundinamarca"); // fel_direcciones
		direccionGene.setCodigoDepartamento("11"); // fel_direcciones
		direccionGene.setDireccion("CL 168 22 - 35  PI3"); // fel_direcciones
		direccionGene.setPais("CO"); // fel_direcciones
		direccionGene.setLenguaje("ES"); // fel_direcciones

		MBPartner bp = new MBPartner(invoice.getCtx(), invoice.getC_BPartner_ID(), invoice.get_TrxName());

//		System.out.println("Comprador : " + tercero);
		MBPartnerLocation[] ubicacionTercero = MBPartnerLocation.getForBPartner(bp.getCtx(), bp.getC_BPartner_ID(),
				null);

		// Cliente de la factura - fel_cliente
		System.out.println("Comprador : " + bp);
		System.out.println("Comprador : " + bp.getValue());
		System.out.println("Comprador : " + bp.getName());
		System.out.println("Comprador : " + bp.get_ValueAsInt("taxiddigit"));
		System.out.println(ubicacionTercero.length + " primer registro :" + ubicacionTercero[0]);

		Cliente cliente = new Cliente(); //
		cliente.setNombreRazonSocial(bp.getName()); //
		cliente.setTipoPersona("1"); // fel_cliente //Tabla 5 // Juridica - Natural
		cliente.setSegundoNombre(""); // fel_cliente cliente.setApellido(""); //
		cliente.setTipoIdentificacion("31"); // fel_cliente //Tabla 3 NIT

//		cliente.setNumeroDocumento("830112247"); // fel_cliente
//		cliente.setNumeroIdentificacionDV("4");// nuevo

		cliente.setNumeroDocumento(bp.getValue()); // fel_cliente
		cliente.setNumeroIdentificacionDV(String.valueOf(bp.get_ValueAsInt("taxiddigit")));// nuevo

		cliente.setTelefono("5713004271"); // fel_cliente
		cliente.setEmail("test@thefactoryhka.com"); // fel_cliente
		cliente.setNotificar("SI"); // fel_cliente
//		cliente.setNombreComercial("JET IMPRESORES LTDA"); // fel_cliente
		cliente.setNombreComercial(bp.getName()); // fel_cliente
		cliente.setActividadEconomicaCIIU("0010");
		cliente.setNombreContacto("Luis Salazar");
		cliente.setTelefax("5713004271");
		cliente.setNota("Se debe llamar antes de facturar"); // nuevo

		Obligaciones obligaciones = new Obligaciones(); // pagina 71
		obligaciones.setObligaciones("O-23"); // Tabla 17
		obligaciones.setRegimen("48");

		ArrayOfObligaciones arrayOfObligaciones = new ArrayOfObligaciones();
		arrayOfObligaciones.getObligaciones().add(obligaciones);
		cliente.setResponsabilidadesRut(arrayOfObligaciones); // pagina 40

		Tributos tributos = new Tributos();
		tributos.setCodigoImpuesto("01"); // Tabla 11

		ArrayOfTributos arrayOfTributos = new ArrayOfTributos();
		arrayOfTributos.getTributos().add(tributos);
		cliente.setDetallesTributarios(arrayOfTributos); // Detalles tributarios del adquirente

		Destinatario destinatario = new Destinatario();
		destinatario.setCanalDeEntrega("0");
		ArrayOfstring email = new ArrayOfstring();
		email.getString().add("email@thefactoryhka.com");
		destinatario.setEmail(email);
		// destinatario.setEmail(new String[]{"email@thefactoryhka.com"});
		ArrayOfDestinatario arrayOfDestinatario = new ArrayOfDestinatario();
		arrayOfDestinatario.getDestinatario().add(destinatario);
		cliente.setDestinatario(arrayOfDestinatario);
//		  cliente.setDestinatario(  destinatario);

		factura.setCliente(cliente);

		// Medios de Pago - fel_mediosdepago
		MediosDePago mediosDePago = new MediosDePago(); // fel_mediosdepago
		mediosDePago.setFechaDeVencimiento("2019-12-01"); // fel_mediosdepago
		mediosDePago.setMedioPago("10"); // fel_mediosdepago
		mediosDePago.setMetodoDePago("1"); // fel_mediosdepago
		mediosDePago.setNumeroDeReferencia("Referencia de pago 1"); // fel_mediosdepago

		mediosDePago.setCodigoReferencia("123QBCV");
		mediosDePago.setNumeroDias("22"); // mediosDePago.setCodigoBanco("3356");
		mediosDePago.setNombreBanco("Bancolombia");
		mediosDePago.setNumeroTransferencia("982467");
		mediosDePago.setCodigoCanalPago("0312");

		ArrayOfMediosDePago arrayOfMediosDePago = new ArrayOfMediosDePago();
		arrayOfMediosDePago.getMediosDePago().add(mediosDePago);
		factura.setMediosDePago(arrayOfMediosDePago); // fel_mediosdepago

		factura.setTipoOperacion("10"); // valores de la Tabla 2
		factura.setTotalAnticipos("0.00"); // fel_factura
		String totalBaseImponible = String.valueOf(invoice.getTotalLines());

		factura.setTotalBaseImponible(totalBaseImponible); // fel_factura
		System.out.println("Tiene que 28000 := " + totalBaseImponible); // fel_factura
//		factura.setTotalBaseImponible("565950.00"); // fel_factura
		String totalBrutoConImpuesto = String.valueOf(invoice.getGrandTotal());

		factura.setTotalBrutoConImpuesto(totalBrutoConImpuesto); // fel_factura
//		factura.setTotalBrutoConImpuesto("673481.00"); // fel_factura
		System.out.println("Tiene que 33320 := " + totalBrutoConImpuesto);

		factura.setTotalCargosAplicados("0.00"); // fel_factura
		factura.setTotalDescuentos("0.00"); // fel_factura
		String totalMonto = String.valueOf(invoice.getGrandTotal());

		factura.setTotalMonto(totalMonto); // fel_factura
//		factura.setTotalMonto("673481.00"); // fel_factura
		System.out.println("Tiene que 33320 := " + totalMonto);

		String totalSinImpuestos = String.valueOf(invoice.getTotalLines());

		factura.setTotalSinImpuestos(totalSinImpuestos); // fel_factura
//		factura.setTotalSinImpuestos("565950.00"); // fel_factura
		System.out.println("totalSinImpuestos Tiene que 28000 := " + totalSinImpuestos);

//		impuestosGenerales.setBaseImponibleTOTALImp("565950.00"); // fel_impuestos
		impuestosGenerales.setBaseImponibleTOTALImp(totalSinImpuestos); // fel_impuestos
		impuestosGenerales.setCodigoTOTALImp("01"); // fel_impuestos
		impuestosGenerales.setPorcentajeTOTALImp("19.00"); // fel_impuestos

		MInvoiceTax[] taxes1 = invoice.getTaxes(true);
		System.out.println("contar impuestos 1:" + taxes1.length);
		BigDecimal a = new BigDecimal("5");
		BigDecimal b = new BigDecimal("7");

		// Equivalent to result = a + b
//		BigDecimal result = a.add(b);
//		result.add(result);
//		System.out.println(result);

		BigDecimal acum = new BigDecimal("0");
		for (int i = 0; i < taxes1.length; i++) {
			MInvoiceTax tax = taxes1[i];
			acum=acum.add(tax.getTaxAmt());
			System.out.println("acumulado " + acum);
			System.out.println("MInvoiceTax1 tax:" + tax);
			System.out.println("MInvoice1 TaxAmt tax:" + tax.getTaxAmt());
			System.out.println("MInvoice1 TaxBaseAmt tax:" + tax.getTaxBaseAmt());
		}
		String impuestostotales = String.valueOf(acum);

//		impuestosGenerales.setValorTOTALImp("107530.50"); // fel_impuestos
		impuestosGenerales.setValorTOTALImp(impuestostotales); // fel_impuestos
		System.out.println("impuestostotales tiene 5320=:" + impuestostotales);
		impuestosGenerales.setControlInterno(""); // fel_impuestos
		impuestosGenerales.setUnidadMedida("94"); // fel_impuestos
		impuestosGenerales.setUnidadMedidaTributo("0.00"); // fel_impuestos
		impuestosGenerales.setValorTributoUnidad("0.00"); // fel_impuestos

		ArrayOfFacturaImpuestos arrayOfFacturaImpuestos = new ArrayOfFacturaImpuestos();
		arrayOfFacturaImpuestos.getFacturaImpuestos().add(impuestosGenerales);
//		
		factura.setImpuestosGenerales(arrayOfFacturaImpuestos);

		ImpuestosTotales impTotales = new ImpuestosTotales(); // fel_impuestostotales

		impTotales.setCodigoTOTALImp("01"); // fel_impuestostotales Tabla 11 :01 IVA
		impTotales.setMontoTotal(impuestostotales); // fel_impuestostotales
//		impTotales.setMontoTotal("107530.50"); // fel_impuestostotales
		ArrayOfImpuestosTotales arrayOfImpuestosTotales = new ArrayOfImpuestosTotales();
		arrayOfImpuestosTotales.getImpuestosTotales().add(impTotales);
		factura.setImpuestosTotales(arrayOfImpuestosTotales); // fel_impuestostotales

		// Detalles de la factura //Producto 1

		MInvoiceLine[] lines = invoice.getLines(true);
//		MInvoiceLine[] lines = invoice.getLines();
		factura.setTotalProductos(lines.length + ""); // fel_factura
		respuesta.append(" ").append("\n");
		respuesta.append("detalle Factura").append("\n");

		// 1. Detalle Factura
		int secuencia = 0;
		for (int linea = 0; linea < lines.length; linea++) {

			secuencia++;
			MInvoiceLine iLine = lines[linea];
			MProduct p = MProduct.get(Env.getCtx(), iLine.getM_Product_ID());
			System.out.println("il.c_tax_id:" + iLine.getC_Tax_ID());

//			iLine.g
			respuesta.append(lines[linea]).append("|");
			System.out.println(iLine);
			System.out.println("codigo " + p.getValue() + "codigo" + p.getName() + "desc " + p.getDescription() + "cnt "
					+ iLine.getQtyInvoiced());
			System.out.println("Vlr Unitario " + iLine.getPriceActual() + "LineNetAmt " + iLine.getLineNetAmt()
					+ "LineTotalAmt " + iLine.getLineTotalAmt() + "LineTaxAmt " + iLine.getTaxAmt()

			);
//			i.totallines,
//			i.grandtotal,
			detalle.add(new FacturaDetalle());
//			FacturaDetalle detalle = new FacturaDetalle(); //

			detalle.get(linea).setSecuencia(secuencia + ""); // fel_productos
			detalle.get(linea).setCodigoProducto(p.getValue());
			detalle.get(linea).setDescripcion(p.getDescription());
			String cantidadUnidades = String.valueOf(iLine.getQtyInvoiced().doubleValue());
			detalle.get(linea).setCantidadUnidades(cantidadUnidades);
			detalle.get(linea).setUnidadMedida("94"); // fel_productos
			String precioVentaUnitario = String.valueOf(iLine.getPriceActual().doubleValue());
			detalle.get(linea).setPrecioVentaUnitario(precioVentaUnitario); // fel_productos

			String precioTotalSinImpuestos = String.valueOf(iLine.getLineNetAmt().doubleValue());

//			detalle.get(0).setPrecioTotalSinImpuestos("238700");

			detalle.get(linea).setPrecioTotalSinImpuestos(precioTotalSinImpuestos);
			String precioTotal = String.valueOf(iLine.getLineTotalAmt().doubleValue());
			detalle.get(linea).setPrecioTotal(precioTotal);
//			detalle.get(0).setPrecioTotal("284053.00"); // fel_productos
			// detalle.setSeriales("ABC123,ABC456"); // fel_productos
			detalle.get(linea).setMuestraGratis("0"); // fel_productos
			// detalle.setNota("Producto nuevo de alta generacion"); // fel_productos
			detalle.get(linea).setPrecioReferencia("0.00"); // fel_productos
			detalle.get(linea).setCodigoTipoPrecio("01"); // fel_productos
			detalle.get(linea).setCantidadPorEmpaque("1"); // fel_productos
			// detalle.setCantidadIndividual("1.00"); // fel_productos
			detalle.get(linea).setDescripcionTecnica(
					"Impresora termica de punto de venta,ideal para puntos de venta con alto rendimiento"); // fel_productos
			// detalle.setMarca("HKA"); // fel_productos
			detalle.get(linea).setModelo("HKA80"); // fel_productos
			// detalle.setSubCodigoProducto("SUB-P000001"); // fel_productos
			detalle.get(linea).setCodigoFabricante("HKA800001"); // fel_productos
			// detalle.setSubCodigoFabricante("SUB-HKA800001"); // fel_productos
			detalle.get(linea).setNombreFabricante("SIM");
			detalle.get(linea).setEstandarCodigoProducto("GTIN");
			detalle.get(linea).setEstandarCodigo("HKA80");
			// detalle.setEstandarCodigoID("801236");
			// detalle.setEstandarCodigoNombre("GTIN");
			// detalle.setEstandarCodigoIdentificador("010");
			// detalle.setEstandarSubCodigoProducto("");
			// detalle.setEstandarOrganizacion("");
			detalle.get(linea).setCodigoIdentificadorPais("CO"); // fel_productos
			// detalle.setMandatorioNumeroIdentificacion("900390126");
			// detalle.setMandatorioNumeroIdentificacionDV("6");
			// detalle.setMandatorioTipoIdentificacion("31");
			detalle.get(linea).setCantidadReal("1.00");
			detalle.get(linea).setCantidadRealUnidadMedida("94");
			// detalle.setTipoAIU("Servicio");

			// Impuestos de la factura - fel_impuestos
			impuestosGeneralesxLinea.add(new FacturaImpuestos());
//			FacturaImpuestos impuesto1 = new FacturaImpuestos(); // fel_impuestos
			impuestosGeneralesxLinea.get(linea).setCodigoTOTALImp("01"); // fel_impuestos //Tabla 11 : 01 IVA
			impuestosGeneralesxLinea.get(linea).setBaseImponibleTOTALImp(precioTotalSinImpuestos); // fel_impuestos
//			impuestosGeneralesxLinea.get(0).setBaseImponibleTOTALImp("238700.00"); // fel_impuestos
			String valorTOTALImp = String.valueOf(iLine.getTaxAmt().doubleValue());

//			impuestosGeneralesxLinea.get(0).setValorTOTALImp("45353.00"); // fel_impuestos
			impuestosGeneralesxLinea.get(linea).setValorTOTALImp(valorTOTALImp); // fel_impuestos
			impuestosGeneralesxLinea.get(linea).setPorcentajeTOTALImp("19.00"); // fel_impuestos
			impuestosGeneralesxLinea.get(linea).setControlInterno(""); // fel_impuestos
			impuestosGeneralesxLinea.get(linea).setUnidadMedida("94"); // fel_impuestos
			impuestosGeneralesxLinea.get(linea).setUnidadMedidaTributo("0.00"); // fel_impuestos
			impuestosGeneralesxLinea.get(linea).setValorTributoUnidad("0.00"); // fel_impuestos

			arrayOfFacturaImpuestosxLinea.add(new ArrayOfFacturaImpuestos());

//			ArrayOfFacturaImpuestos arrayOfFacturaImpuestos1 = new ArrayOfFacturaImpuestos();
			arrayOfFacturaImpuestosxLinea.get(linea).getFacturaImpuestos().add(impuestosGeneralesxLinea.get(linea));

			detalle.get(linea).setImpuestosDetalles(arrayOfFacturaImpuestosxLinea.get(linea)); // fel_impuestos

			impTotalesxLinea.add(new ImpuestosTotales());
//			ImpuestosTotales impTotalesdet = new ImpuestosTotales();
			impTotalesxLinea.get(linea).setCodigoTOTALImp("01");
//			impTotalesxLinea.get(0).setMontoTotal("45353.00");
			impTotalesxLinea.get(linea).setMontoTotal(valorTOTALImp);

			arrayOfImpuestosTotalesxLinea.add(new ArrayOfImpuestosTotales());
//			ArrayOfImpuestosTotales arrayOfImpuestosTotales1 = new ArrayOfImpuestosTotales();
//			arrayOfFacturaImpuestosxLinea.add(new ArrayOfFacturaImpuestos());
			arrayOfImpuestosTotalesxLinea.get(linea).getImpuestosTotales().add(impTotalesxLinea.get(linea));
			detalle.get(linea).setImpuestosTotales(arrayOfImpuestosTotalesxLinea.get(linea));

			arrayOfFacturaDetalle.getFacturaDetalle().add(detalle.get(linea));
		} // fin for detalle factura
		System.out.println("i.totallines:" + invoice.getTotalLines());
		System.out.println("i.grandtotal:" + invoice.getGrandTotal());
		System.out.println("i.id:" + invoice.getC_Invoice_ID());
		System.out.println("i.documentno:" + invoice.getDocumentNo());

//		MInvoiceTax[] taxesEsteNo = invoice.getTaxes(true);
//		System.out.println("contar impuestos " + taxesEsteNo.length);
//		for (int i = 0; i < taxesEsteNo.length; i++) {
//
//			MInvoiceTax tax = taxesEsteNo[i];
//			System.out.println("MInvoiceTax tax:" + taxesEsteNo);
//			System.out.println("MInvoice TaxAmt tax:" + tax.getTaxAmt());
//			System.out.println("MInvoiceTaxBaseAmt tax:" + tax.getTaxBaseAmt());
//		}

		
		factura.setDetalleDeFactura(arrayOfFacturaDetalle); // fel_impuestos

	}

}
