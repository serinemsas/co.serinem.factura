package org.serinem.model;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MLocation;
import org.compiere.model.MOrgInfo;
import org.compiere.model.MSysConfig;
import org.compiere.util.AdempiereUserError;
import org.compiere.util.Env;
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
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0.DocumentResponse;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.ArrayOfDestinatario;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.ArrayOfFacturaDetalle;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.ArrayOfFacturaImpuestos;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.ArrayOfImpuestosTotales;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.ArrayOfMediosDePago;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.ArrayOfObligaciones;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.ArrayOfTributos;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.Cliente;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.Destinatario;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.Direccion;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.FacturaDetalle;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.FacturaGeneral;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.FacturaImpuestos;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.ImpuestosTotales;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.MediosDePago;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.Obligaciones;
//import org.datacontract.schemas._2004._07.servicesoap_ubl2__0_models.Tributos;
//import org.tempuri.IService;
//import org.tempuri.Service;
import org.jco.jaxws.client.FacturaGeneral;
import org.jco.jaxws.client.FacturaImpuestos;
import org.jco.jaxws.client.IService;
import org.jco.jaxws.client.ImpuestosTotales;
import org.jco.jaxws.client.MediosDePago;
import org.jco.jaxws.client.Obligaciones;
import org.jco.jaxws.client.Service;
import org.jco.jaxws.client.Tributos;

//import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

public class MInvoice_mib extends X_C_Invoice {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1742095861857260577L;
	private FacturaGeneral factura;

	public MInvoice_mib(Properties ctx, int C_Invoice_ID, String trxName) {
		super(ctx, C_Invoice_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MInvoice_mib(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}



	public void sendEInvoice(String address) {

		System.out.println("entra a enviar factura");
		IService servicio = new Service().getBasicHttpBindingIService();
		System.out.println("crea servicio");
		
		String nroDocument = "6";
		buildDocument(nroDocument, "F2SS-1");
		
		String adjuntos = "0";
		String tokenEmpresa = "3d17da9c835c416cada584f34f588edab1a10d1d";
		String tokenPassword = "8303025d79fb4585a7e4d287ecb1ee4036259bf3";
		
//		String tokenEmpresaSis = MSysConfig.getValue("MIB_TOKEN_EMPRESA", "", getAD_Client_ID());
//		if (tokenEmpresa.isEmpty())
//			throw new AdempiereUserError(
//					"Suministrar el Token Empresa para la autorizacion de facturacion electronica  @No@ ");
//		String tokenPasswordSis = MSysConfig.getValue("MIB_TOKEN_PASSWORD", "", Env.getAD_Client_ID(getCtx()));
//
//		if (tokenPassword.isEmpty())
//			throw new AdempiereUserError("Suministrar Password para la autorizacion de facturacion electronica @No@ ");
//		// address= "http://demoemision.thefactoryhka.com.co/ws/obj/v1.1/Service.svc";
//		String addressAdj = "http://demoemision.thefactoryhka.com.co/wsEmision/Service.svc";



		System.out.println(" servicio invocado");
		
		DocumentResponse response = servicio.enviar(tokenEmpresa, tokenPassword, factura, adjuntos);
		System.out.println(response.getCodigo().toString() + "|" + "No Doc: " +nroDocument+ "|" + response.getMensaje());
		
//		DocumentResponse res1;
		}
	
	private void buildDocument(String nroDocument, String rangNumeration) {
		// TODO Auto-generated method stub
		
		factura = new FacturaGeneral(); // 1-2

		/////////////////////////////////////
		
		// fg.setExtras(extras);
		// getDateInvoiced();
		System.out.println("Fecha Facturacion YYYY-MM-DD HH:MM:SS " + getDateInvoiced());
		System.out.println("Fecha Facturacion YYYY-MM-DD HH:MM:SS " + getCreated());
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(getCreated());
	
			
//////////////////////////////////////		
		
		// Datos de la Factura
		
		factura.setConsecutivoDocumento(nroDocument); // fel_factura
		factura.setCantidadDecimales("6"); // nuevo
		factura.setFechaEmision("2020-01-18 00:14:11"); // fel_factura
//		factura.setFechaEmision(timeStamp);
		factura.setFechaFinPeriodoFacturacion("2019-08-30 00:00:00"); // fel_factura
		factura.setFechaInicioPeriodoFacturacion("2019-08-30 00:00:00"); // fel_factura
		factura.setFechaPagoImpuestos("2019-11-24"); // nuevo
		factura.setFechaVencimiento("2019-10-26"); // fel_factura

		ArrayOfstring infAdicional = new ArrayOfstring();
		infAdicional.getString().add("Nota de la Factura");
		infAdicional.getString().add("algo mas");

		factura.setInformacionAdicional(infAdicional); // fel_factura
		factura.setMoneda("COP"); // fel_factura
		factura.setPropina(""); // fel_factura
		factura.setRangoNumeracion(rangNumeration); // fel_factura //FV-1 o NC-1 o ND-1 Dependiendo el tipo de documento
		factura.setRedondeoAplicado("0.00"); // fel_factura
		factura.setTipoDocumento("01"); // fel_factura // Del 01 al 09
		factura.setTipoOperacion("05"); // nuevo
		factura.setTotalAnticipos("0.00"); // fel_factura
		factura.setTotalBaseImponible("565950.00"); // fel_factura
		factura.setTotalBrutoConImpuesto("673481.00"); // fel_factura
		factura.setTotalCargosAplicados("0.00"); // fel_factura
		factura.setTotalDescuentos("0.00"); // fel_factura
		factura.setTotalMonto("673481.00"); // fel_factura
		factura.setTotalProductos("2"); // fel_factura
		factura.setTotalSinImpuestos("565950.00"); // fel_factura
		
		Direccion direccionGene = new Direccion(); //

		direccionGene.setMunicipio("11001"); // fel_direcciones

		direccionGene.setCiudad("BOGOTA, D.C."); // fel_direcciones
		direccionGene.setZonaPostal("050001"); // fel_direcciones
		direccionGene.setDepartamento("Cundinamarca"); // fel_direcciones
		direccionGene.setCodigoDepartamento("11"); // fel_direcciones
		direccionGene.setDireccion("CL 168 22 - 35  PI3"); // fel_direcciones
		direccionGene.setPais("CO"); // fel_direcciones
		direccionGene.setLenguaje("ES"); // fel_direcciones

		ArrayOfFacturaImpuestos arrayOfFacturaImpuestos = new ArrayOfFacturaImpuestos();
		FacturaImpuestos impuestosGenerales = new FacturaImpuestos(); // fel_impuestos
		impuestosGenerales.setBaseImponibleTOTALImp("565950.00"); // fel_impuestos
		impuestosGenerales.setCodigoTOTALImp("01"); // fel_impuestos
		impuestosGenerales.setPorcentajeTOTALImp("19.00"); // fel_impuestos
		impuestosGenerales.setValorTOTALImp("107530.50"); // fel_impuestos
		impuestosGenerales.setControlInterno(""); // fel_impuestos
		impuestosGenerales.setUnidadMedida("KGM"); // fel_impuestos
		impuestosGenerales.setUnidadMedidaTributo("0.00"); // fel_impuestos
		impuestosGenerales.setValorTributoUnidad("0.00"); // fel_impuestos

		arrayOfFacturaImpuestos.getFacturaImpuestos().add(impuestosGenerales);
//		
		factura.setImpuestosGenerales(arrayOfFacturaImpuestos);

		ImpuestosTotales impTotales = new ImpuestosTotales(); // fel_impuestostotales

		impTotales.setCodigoTOTALImp("01"); // fel_impuestostotales
		impTotales.setMontoTotal("107530.50"); // fel_impuestostotales
		ArrayOfImpuestosTotales arrayOfImpuestosTotales = new ArrayOfImpuestosTotales();
		arrayOfImpuestosTotales.getImpuestosTotales().add(impTotales);
		factura.setImpuestosTotales(arrayOfImpuestosTotales); // fel_impuestostotales

		Obligaciones obligaciones = new Obligaciones();
		obligaciones.setObligaciones("O-06");
		obligaciones.setRegimen("04");

		// Cliente de la factura - fel_cliente
		Cliente cliente = new Cliente(); //
		// ;
		MBPartner tercero = new MBPartner(getCtx(), getC_BPartner_ID(), get_TrxName());
		// MBPartner bp = new MBPartner(getCtx(), getC_BPartner_ID(), get_TrxName());

		int bp_isic_id = tercero.get_ValueAsInt("LCO_ISIC_ID");
		int bp_taxpayertype_id = tercero.get_ValueAsInt("LCO_TaxPayerType_ID");
		MBPartnerLocation mbpl = new MBPartnerLocation(getCtx(), getC_BPartner_Location_ID(), get_TrxName());
		MLocation bpl = MLocation.get(getCtx(), mbpl.getC_Location_ID(), get_TrxName());
		int bp_city_id = bpl.getC_City_ID();
		// OrgInfo variables
		MOrgInfo oi = MOrgInfo.get(getCtx(), getAD_Org_ID(), get_TrxName());
		int org_isic_id = oi.get_ValueAsInt("LCO_ISIC_ID");
		int org_taxpayertype_id = oi.get_ValueAsInt("LCO_TaxPayerType_ID");
		MLocation ol = MLocation.get(getCtx(), oi.getC_Location_ID(), get_TrxName());
		int org_city_id = ol.getC_City_ID();

		String apellido = tercero.get_ValueAsString("lastname1");
		cliente.setApellido(tercero.get_ID() + " " + tercero.getName());
		// cliente.setApellido(tercero.get_ID() + " " + apellido);
		// cli.setCiudad(ciudad);
		// cli.setDepartamento(departamento);
		// cli.setDireccion(direccion);

		cliente.setEmail(tercero.getURL());
		cliente.setNombreRazonSocial("ConsorcioGDS");
//		cliente.setNombreRazonSocial("JET IMPRESORES LTDA"); //
		
		System.out.println("enviar correo:  " + tercero.get_ValueAsBoolean("SendEmail"));
		if (tercero.get_ValueAsBoolean("SendEmail")) {
			cliente.setNotificar("SI");
		} else
			cliente.setNotificar("NO");
		// select value, taxid from c_bpartner where firstname1 is not null
		System.out.println(" numero doc " + tercero.get_ValueAsString("taxid") + "longitud campo"
				+ (tercero.get_ValueAsString("taxid").length() > 0));
		if (tercero.get_ValueAsString("taxid").length() > 0)
			cliente.setNumeroDocumento(tercero.get_ValueAsString("taxid"));
		else
			cliente.setNumeroDocumento("12345678");

		// cli.setPais("Colombia");
//		cliente.setRegimen("0");
		/// LCO_TaxIdType
		cliente.setTipoIdentificacion("13");
		cliente.setTipoPersona("2");
		
		cliente.setTipoIdentificacion("31"); // fel_cliente
		cliente.setTipoPersona("1"); // fel_cliente
		
		// cli.setTelefono(telefono);

		


		
		cliente.setSegundoNombre(""); // fel_cliente cliente.setApellido(""); //
		
		cliente.setNumeroDocumento("830112247"); // fel_cliente
		cliente.setNumeroIdentificacionDV("4");// nuevo
		cliente.setTelefono("5713004271"); // fel_cliente
		cliente.setEmail("test@thefactoryhka.com"); // fel_cliente
		cliente.setNotificar("SI"); // fel_cliente
		cliente.setNombreComercial("JET IMPRESORES LTDA"); // fel_cliente
		cliente.setActividadEconomicaCIIU("0010"); // nuevo
		cliente.setNombreContacto("Luis Salazar"); // nuevo
		cliente.setTelefax("5713004271"); // nuevo
		cliente.setNota("Se debe llamar antes de facturar"); // nuevo

		ArrayOfObligaciones arrayOfObligaciones = new ArrayOfObligaciones();
		arrayOfObligaciones.getObligaciones().add(obligaciones);
		cliente.setResponsabilidadesRut(arrayOfObligaciones);

		Tributos tributos = new Tributos();
		tributos.setCodigoImpuesto("01");

		ArrayOfTributos arrayOfTributos = new ArrayOfTributos();
		arrayOfTributos.getTributos().add(tributos);
		cliente.setDetallesTributarios(arrayOfTributos);

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

		// Detalles de la factura //Producto 1

		FacturaDetalle detalle = new FacturaDetalle(); //

		detalle.setSecuencia("1"); // fel_productos
		detalle.setCodigoProducto("LOF-1035N");
		detalle.setDescripcion("Impresora HKA80");
		detalle.setCantidadUnidades("62.00");
		detalle.setUnidadMedida("KGM"); // fel_productos
		detalle.setPrecioVentaUnitario("3850.00"); // fel_productos
		detalle.setPrecioTotalSinImpuestos("238700.00");
		detalle.setPrecioTotal("284053.00"); // fel_productos
		// detalle.setSeriales("ABC123,ABC456"); // fel_productos
		detalle.setMuestraGratis("0"); // fel_productos
		// detalle.setNota("Producto nuevo de alta generacion"); // fel_productos
		detalle.setPrecioReferencia("0.00"); // fel_productos
		detalle.setCodigoTipoPrecio("01"); // fel_productos
		detalle.setCantidadPorEmpaque("1"); // fel_productos
		// detalle.setCantidadIndividual("1.00"); // fel_productos
		detalle.setDescripcionTecnica(
				"Impresora termica de punto de venta, ideal para puntos de venta con alto rendimiento"); // fel_productos
																											// detalle.setMarca("HKA");
																											// //
																											// fel_productos
		detalle.setModelo("HKA80"); // fel_productos
		// detalle.setSubCodigoProducto("SUB-P000001"); // fel_productos
		detalle.setCodigoFabricante("HKA800001"); // fel_productos
		// detalle.setSubCodigoFabricante("SUB-HKA800001"); // fel_productos
		detalle.setNombreFabricante("SIM");
		detalle.setEstandarCodigoProducto("GTIN");
		detalle.setEstandarCodigo("HKA80");
		// detalle.setEstandarCodigoID("801236");
		// detalle.setEstandarCodigoNombre("GTIN");
		// detalle.setEstandarCodigoIdentificador("010");
		// detalle.setEstandarSubCodigoProducto("");
		// detalle.setEstandarOrganizacion("");
		detalle.setCodigoIdentificadorPais("CO"); // fel_productos
		// detalle.setMandatorioNumeroIdentificacion("900390126");
		// detalle.setMandatorioNumeroIdentificacionDV("6");
		// detalle.setMandatorioTipoIdentificacion("31");
		detalle.setCantidadReal("1.00");
		detalle.setCantidadRealUnidadMedida("KGM");
		// detalle.setTipoAIU("Servicio");

		// Impuestos de la factura - fel_impuestos
		FacturaImpuestos impuesto1 = new FacturaImpuestos(); // fel_impuestos
		impuesto1.setCodigoTOTALImp("01"); // fel_impuestos
		impuesto1.setBaseImponibleTOTALImp("238700.00"); // fel_impuestos
		impuesto1.setValorTOTALImp("45353.00"); // fel_impuestos
		impuesto1.setPorcentajeTOTALImp("19.00"); // fel_impuestos
		impuesto1.setControlInterno(""); // fel_impuestos
		impuesto1.setUnidadMedida("UN"); // fel_impuestos
		impuesto1.setUnidadMedidaTributo("0.00"); // fel_impuestos
		impuesto1.setValorTributoUnidad("0.00"); // fel_impuestos

		ArrayOfFacturaImpuestos arrayOfFacturaImpuestos1 = new ArrayOfFacturaImpuestos();
		arrayOfFacturaImpuestos1.getFacturaImpuestos().add(impuesto1);
		
		detalle.setImpuestosDetalles(arrayOfFacturaImpuestos1); // fel_impuestos

		ImpuestosTotales impTotalesdet = new ImpuestosTotales();
		impTotalesdet.setCodigoTOTALImp("01");
		impTotalesdet.setMontoTotal("45353.00");

		
		ArrayOfImpuestosTotales arrayOfImpuestosTotales1 = new ArrayOfImpuestosTotales();
		arrayOfImpuestosTotales1.getImpuestosTotales().add(impTotalesdet);
		detalle.setImpuestosTotales(arrayOfImpuestosTotales1);

		// Producto 2
		FacturaDetalle detalle2 = new FacturaDetalle(); //
		detalle2.setSecuencia("1"); // fel_productos
		detalle2.setCodigoProducto("LOF-1035N");
		detalle2.setDescripcion("Impresora HKA80");
		detalle2.setCantidadUnidades("85.00");
		detalle2.setUnidadMedida("KGM"); // fel_productos
		detalle2.setPrecioVentaUnitario("3850.00"); // fel_productos
		detalle2.setPrecioTotalSinImpuestos("327250.00");
		detalle2.setPrecioTotal("389427.50"); // fel_productos
		// detalle2.setSeriales("ABC123,ABC456"); // fel_productos
		detalle2.setMuestraGratis("0"); // fel_productos
		// detalle2.setNota("Producto nuevo de alta generacion"); // fel_productos
		detalle2.setPrecioReferencia("0.00"); // fel_productos
		detalle2.setCodigoTipoPrecio("01"); // fel_productos
		detalle2.setCantidadPorEmpaque("1"); // fel_productos
		// detalle2.setCantidadIndividual("1.00"); // fel_productos
		detalle2.setDescripcionTecnica(
				"Impresora t�rmica de punto de venta, ideal para puntos de venta con alto rendimiento"); // fel_productos
		detalle2.setMarca("HKA"); // fel_productos
		detalle2.setModelo("HKA80"); // fel_productos
		// detalle2.setSubCodigoProducto("SUB-P000001"); // fel_productos
		detalle2.setCodigoFabricante("HKA800001"); // fel_productos
		// detalle2.setSubCodigoFabricante("SUB-HKA800001"); // fel_productos
		detalle2.setNombreFabricante("SIM");
		detalle2.setEstandarCodigoProducto("GTIN");
		detalle2.setEstandarCodigo("HKA80");
		detalle2.setCodigoIdentificadorPais("CO"); // fel_productos
		detalle2.setCantidadReal("1.00");
		detalle2.setCantidadRealUnidadMedida("KGM");

		// Impuestos de la factura - fel_impuestos
		FacturaImpuestos impuesto2 = new FacturaImpuestos(); // fel_impuestos
		impuesto2.setCodigoTOTALImp("01"); // fel_impuestos
		impuesto2.setBaseImponibleTOTALImp("327250.00"); // fel_impuestos
		impuesto2.setValorTOTALImp("62177.50"); // fel_impuestos
		impuesto2.setPorcentajeTOTALImp("19.00"); // fel_impuestos
		impuesto2.setControlInterno(""); // fel_impuestos
		impuesto2.setUnidadMedida("UN"); // fel_impuestos
		impuesto2.setUnidadMedidaTributo("0.00"); // fel_impuestos
		impuesto2.setValorTributoUnidad("0.00"); // fel_impuestos

		ArrayOfFacturaImpuestos arrayOfFacturaImpuestos2 = new ArrayOfFacturaImpuestos();
		arrayOfFacturaImpuestos2.getFacturaImpuestos().add(impuesto2);
		detalle2.setImpuestosDetalles(arrayOfFacturaImpuestos2); // fel_impuestos

		ImpuestosTotales impTotalesdet2 = new ImpuestosTotales();
		impTotalesdet2.setCodigoTOTALImp("01");
		impTotalesdet2.setMontoTotal("62177.50");

		ArrayOfImpuestosTotales arrayOfImpuestosTotales2 = new ArrayOfImpuestosTotales();
		arrayOfImpuestosTotales2.getImpuestosTotales().add(impTotalesdet2);
		detalle2.setImpuestosTotales(arrayOfImpuestosTotales2);

		ArrayOfFacturaDetalle arrayOfFacturaDetalle= new ArrayOfFacturaDetalle();
		arrayOfFacturaDetalle.getFacturaDetalle().add(detalle);
		arrayOfFacturaDetalle.getFacturaDetalle().add(detalle2);
		
		factura.setDetalleDeFactura(arrayOfFacturaDetalle); // fel_impuestos

		
	}
}
