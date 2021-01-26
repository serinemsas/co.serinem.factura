package co.serinem.jco.einvoice;


//package org.sonatype.mavenbook;


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



public class Emitir {

	static FacturaGeneral factura;
	
	public static void main(String[] args) {
//		IService service = new Service().getBasicHttpBindingIService();
		Service service = new Service();
		System.out.println("Retrieving the port fromthe following service: " + service);
		IService port = service.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IService"), IService.class);
		
//		 factura = new FacturaGeneral();
//		ObjectFactory objectFactory = new ObjectFactory();
//       JAXBElement<String> fecha = objectFactory.createEnviarTokenEmpresa("");
//   	factura.setFechaEmision("2020-01-10 07:28:00");
		
		
		String nroDocument = "1";
		String prefijo="FVPM";
		buildDocument(prefijo+nroDocument, prefijo+"-1");
		
//		String nroDocument = "16";
//		buildDocument(nroDocument, "F2SS-1");


		String adjuntos = "0";
//		String tokenEmpresa = "3d17da9c835c416cada584f34f588edab1a10d1d";
//		String tokenPassword = "8303025d79fb4585a7e4d287ecb1ee4036259bf3";

				
		String tokenEmpresa = "411f7562e1dc8a957e9b48a9a65e7c1531cd80de";
		String tokenPassword = "1a64e3c2bcae59e1dede394dae733d307edde7e0";

		DocumentResponse response = port.enviar(tokenEmpresa, tokenPassword, factura, adjuntos);
		System.out.println(response.getCodigo().toString() + "|" + "No Doc: " +nroDocument+ "|" + response.getMensaje());
		
//		DocumentResponse response = service.enviar(tokenEmpresa, tokenPassword, factura, adjuntos);
//		System.out.println(response.getCodigo().toString() + "|" + "No Doc: " +nroDocument+ "|" + response.getMensaje());
	}
	
	private static void buildDocument(String nroDocument, String rangNumeration) {
		// TODO Auto-generated method stub

		factura = new FacturaGeneral(); // 1-2

		// Datos de la Factura
		factura.setConsecutivoDocumento(nroDocument); // fel_factura
		factura.setCantidadDecimales("6"); // nuevo
		factura.setFechaEmision("2020-11-05 00:14:11"); // fel_factura
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
		cliente.setNombreRazonSocial("JET IMPRESORES LTDA"); //
		cliente.setTipoPersona("1"); // fel_cliente
		cliente.setSegundoNombre(""); // fel_cliente cliente.setApellido(""); //
		cliente.setTipoIdentificacion("31"); // fel_cliente
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

		ArrayOfFacturaDetalle arrayOfFacturaDetalle = new ArrayOfFacturaDetalle();
		arrayOfFacturaDetalle.getFacturaDetalle().add(detalle);
		arrayOfFacturaDetalle.getFacturaDetalle().add(detalle2);

		factura.setDetalleDeFactura(arrayOfFacturaDetalle); // fel_impuestos

	}

//	private static void buildDocument(String nroDocument, String rangNumeration) {
//		// TODO Auto-generated method stub
//		
////		factura = new FacturaGeneral(); // 1-2019
////		ObjectFactory objectFactory = new ObjectFactory();
//		factura = new ObjectFactory().createFacturaGeneral();
////		factura = objectFactory.createFacturaGeneral();
////		JAXBElement<String> value =new JAXBElement<String>();
//		JAXBElement<String> value =new JAXBElement<String> (new QName("http://www.example.org/schema", "foo"), String.class, "6");;
//		// Datos de la Factura
//		factura.setConsecutivoDocumento(nroDocument); // fel_factura
////		factura.setConsecutivoDocumento(value);
//		System.out.println("colocar pre-noDoc");
////		factura.setConsecutivoDocumento(value);
//		System.out.println("colocar post-noDoc");
//		
////		factura.setCantidadDecimales("6"); // nuevo
//		factura.getConsecutivoDocumento().setValue(nroDocument);;
//		factura.getCantidadDecimales().setValue("6");
////		factura.setFechaEmision("2020-01-18 00:14:11"); // fel_factura
//		factura.getFechaEmision().setValue("2020-01-18 00:14:11"); // fel_factura
//	
////		factura.setFechaFinPeriodoFacturacion("2019-08-30 00:00:00"); // fel_factura
//		factura.getFechaFinPeriodoFacturacion().setValue("2019-08-30 00:00:00"); // fel_factura
////		factura.setFechaInicioPeriodoFacturacion("2019-08-30 00:00:00"); // fel_factura
//		factura.getFechaInicioPeriodoFacturacion().setValue("2019-08-30 00:00:00"); // fel_factura
////		factura.setFechaPagoImpuestos("2019-11-24"); // nuevo
//		factura.getFechaPagoImpuestos().setValue("2019-11-24"); // nuevo
////		factura.setFechaVencimiento("2019-10-26"); // fel_factura
//		factura.getFechaVencimiento().setValue("2019-10-26"); // fel_factura
//
//		ArrayOfstring infAdicional = new ArrayOfstring();
//		infAdicional.getString().add("Nota de la Factura");
//		infAdicional.getString().add("algo mas");
//
////		factura.setInformacionAdicional(infAdicional); // fel_factura
//		factura.getInformacionAdicional().setValue(infAdicional); // fel_factura
//
////		factura.setMoneda("COP"); // fel_factura
//		factura.getMoneda().setValue("COP"); // fel_factura
////		factura.setPropina(""); // fel_factura
//		factura.getPropina().setValue(""); // fel_factura
////		factura.setRangoNumeracion(rangNumeration); // fel_factura //FV-1 o NC-1 o ND-1 Dependiendo el tipo de documento
//		factura.getRangoNumeracion().setValue(rangNumeration); // fel_factura //FV-1 o NC-1 o ND-1 Dependiendo el tipo de documento
////		factura.setRedondeoAplicado("0.00"); // fel_factura
//		factura.getRedondeoAplicado().setValue("0.00"); // fel_factura
////		factura.setTipoDocumento("01"); // fel_factura // Del 01 al 09
//		factura.getTipoDocumento().setValue("01"); // fel_factura // Del 01 al 09
////		factura.setTipoOperacion("05"); // nuevo
//		factura.getTipoOperacion().setValue("05"); // nuevo
////		factura.setTotalAnticipos("0.00"); // fel_factura
//		factura.getTotalAnticipos().setValue("0.00"); // fel_factura
////		factura.setTotalBaseImponible("565950.00"); // fel_factura
//		factura.getTotalBaseImponible().setValue("565950.00"); // fel_factura
////		factura.setTotalBrutoConImpuesto("673481.00"); // fel_factura
//		factura.getTotalBrutoConImpuesto().setValue("673481.00"); // fel_factura
////		factura.setTotalCargosAplicados("0.00"); // fel_factura
//		factura.getTotalCargosAplicados().setValue("0.00"); // fel_factura
////		factura.setTotalDescuentos("0.00"); // fel_factura
//		factura.getTotalDescuentos().setValue("0.00"); // fel_factura
////		factura.setTotalMonto("673481.00"); // fel_factura
//		factura.getTotalMonto().setValue("673481.00"); // fel_factura
////		factura.setTotalProductos("2"); // fel_factura
//		factura.getTotalProductos().setValue("2"); // fel_factura
////		factura.setTotalSinImpuestos("565950.00"); // fel_factura
//		factura.getTotalSinImpuestos().setValue("565950.00"); // fel_factura
//
//		Direccion direccionGene = new Direccion(); //
//
////		direccionGene.setMunicipio("11001"); // fel_direcciones
//		direccionGene.getMunicipio().setValue("11001"); // fel_direcciones
//
////		direccionGene.setCiudad("BOGOTA, D.C."); // fel_direcciones
//		direccionGene.getCiudad().setValue("BOGOTA, D.C."); // fel_direcciones
////		direccionGene.setZonaPostal("050001"); // fel_direcciones
//		direccionGene.getZonaPostal().setValue("050001"); // fel_direcciones
////		direccionGene.setDepartamento("Cundinamarca"); // fel_direcciones
//		direccionGene.getDepartamento().setValue("Cundinamarc"); // fel_direcciones
////		direccionGene.setCodigoDepartamento("11"); // fel_direcciones
//		direccionGene.getCodigoDepartamento().setValue("11"); // fel_direcciones
////		direccionGene.setDireccion("CL 168 22 - 35  PI3"); // fel_direcciones
//		direccionGene.getDireccion().setValue("CL 168 22 - 35  PI3"); // fel_direcciones
////		direccionGene.setPais("CO"); // fel_direcciones
//		direccionGene.getPais().setValue("CO"); // fel_direcciones
////		direccionGene.setLenguaje("ES"); // fel_direcciones
//		direccionGene.getLenguaje().setValue("ES"); // fel_direcciones
//
//		ArrayOfFacturaImpuestos arrayOfFacturaImpuestos = new ArrayOfFacturaImpuestos();
//		FacturaImpuestos impuestosGenerales = new FacturaImpuestos(); // fel_impuestos
////		impuestosGenerales.setBaseImponibleTOTALImp("565950.00"); // fel_impuestos
//		impuestosGenerales.getBaseImponibleTOTALImp().setValue("565950.00"); // fel_impuestos
////		impuestosGenerales.setCodigoTOTALImp("01"); // fel_impuestos
//		impuestosGenerales.getCodigoTOTALImp().setValue("01"); // fel_impuestos
////		impuestosGenerales.setPorcentajeTOTALImp("19.00"); // fel_impuestos
//		impuestosGenerales.getPorcentajeTOTALImp().setValue("19.00"); // fel_impuestos
////		impuestosGenerales.setValorTOTALImp("107530.50"); // fel_impuestos
//		impuestosGenerales.getValorTOTALImp().setValue("107530.50"); // fel_impuestos
////		impuestosGenerales.setControlInterno(""); // fel_impuestos
//		impuestosGenerales.getControlInterno().setValue(""); // fel_impuestos
////		impuestosGenerales.setUnidadMedida("KGM"); // fel_impuestos
//		impuestosGenerales.getUnidadMedida().setValue("KGM"); // fel_impuestos
////		impuestosGenerales.setUnidadMedidaTributo("0.00"); // fel_impuestos
//		impuestosGenerales.getUnidadMedidaTributo().setValue("0.00"); // fel_impuestos
////		impuestosGenerales.setValorTributoUnidad("0.00"); // fel_impuestos
//		impuestosGenerales.getValorTributoUnidad().setValue("0.00"); // fel_impuestos
//
//		arrayOfFacturaImpuestos.getFacturaImpuestos().add(impuestosGenerales);
////		
//		factura.getImpuestosGenerales().setValue(arrayOfFacturaImpuestos);
//
//		ImpuestosTotales impTotales = new ImpuestosTotales(); // fel_impuestostotales
//
//		impTotales.getCodigoTOTALImp().setValue("01"); // fel_impuestostotales
//		impTotales.getMontoTotal().setValue("107530.50"); // fel_impuestostotales
//		ArrayOfImpuestosTotales arrayOfImpuestosTotales = new ArrayOfImpuestosTotales();
//		arrayOfImpuestosTotales.getImpuestosTotales().add(impTotales);
//		factura.getImpuestosTotales().setValue(arrayOfImpuestosTotales); // fel_impuestostotales
//
//		Obligaciones obligaciones = new Obligaciones();
//		obligaciones.getObligaciones().setValue("O-06");
//		obligaciones.getRegimen().setValue("04");
//
//		// Cliente de la factura - fel_cliente
//		Cliente cliente = new Cliente(); //
//		cliente.getNombreRazonSocial().setValue("JET IMPRESORES LTDA"); //
//		cliente.getTipoPersona().setValue("1"); // fel_cliente
//		cliente.getSegundoNombre().setValue(""); // fel_cliente cliente.setApellido(""); //
//		cliente.getTipoIdentificacion().setValue("31"); // fel_cliente
//		cliente.getNumeroDocumento().setValue("830112247"); // fel_cliente
//		cliente.getNumeroIdentificacionDV().setValue("4");// nuevo
//		cliente.getTelefono().setValue("5713004271"); // fel_cliente
//		cliente.getEmail().setValue("test@thefactoryhka.com"); // fel_cliente
//		cliente.getNotificar().setValue("SI"); // fel_cliente
//		cliente.getNombreComercial().setValue("JET IMPRESORES LTDA"); // fel_cliente
//		cliente.getActividadEconomicaCIIU().setValue("0010"); // nuevo
//		cliente.getNombreContacto().setValue("Luis Salazar"); // nuevo
//		cliente.getTelefax().setValue("5713004271"); // nuevo
//		cliente.getNota().setValue("Se debe llamar antes de facturar"); // nuevo
//
//		ArrayOfObligaciones arrayOfObligaciones = new ArrayOfObligaciones();
//		arrayOfObligaciones.getObligaciones().add(obligaciones);
//		cliente.getResponsabilidadesRut().setValue(arrayOfObligaciones);
//
//		Tributos tributos = new Tributos();
//		tributos.getCodigoImpuesto().setValue("01");
//
//		ArrayOfTributos arrayOfTributos = new ArrayOfTributos();
//		arrayOfTributos.getTributos().add(tributos);
//		cliente.getDetallesTributarios().setValue(arrayOfTributos);
//
//		Destinatario destinatario = new Destinatario();
//		destinatario.getCanalDeEntrega().setValue("0");
//		ArrayOfstring email = new ArrayOfstring();
//		email.getString().add("email@thefactoryhka.com");
//		destinatario.getEmail().setValue(email);
//		// destinatario.setEmail(new String[]{"email@thefactoryhka.com"});
//		ArrayOfDestinatario arrayOfDestinatario = new ArrayOfDestinatario();
//		arrayOfDestinatario.getDestinatario().add(destinatario);
//		cliente.getDestinatario().setValue(arrayOfDestinatario);
////		  cliente.setDestinatario(  destinatario);
//
//		factura.getCliente().setValue(cliente);
//
//		// Medios de Pago - fel_mediosdepago
//		MediosDePago mediosDePago = new MediosDePago(); // fel_mediosdepago
//		mediosDePago.getFechaDeVencimiento().setValue("2019-12-01"); // fel_mediosdepago
//		mediosDePago.getMedioPago().setValue("10"); // fel_mediosdepago
//		mediosDePago.getMetodoDePago().setValue("1"); // fel_mediosdepago
//		mediosDePago.getNumeroDeReferencia().setValue("Referencia de pago 1"); // fel_mediosdepago
//
//		mediosDePago.getCodigoReferencia().setValue("123QBCV");
//		mediosDePago.getNumeroDias().setValue("22"); // mediosDePago.setCodigoBanco("3356");
//		mediosDePago.getNombreBanco().setValue("Bancolombia");
//		mediosDePago.getNumeroTransferencia().setValue("982467");
//		mediosDePago.getCodigoCanalPago().setValue("0312");
//
//		ArrayOfMediosDePago arrayOfMediosDePago = new ArrayOfMediosDePago();
//		arrayOfMediosDePago.getMediosDePago().add(mediosDePago);
//		factura.getMediosDePago().setValue(arrayOfMediosDePago); // fel_mediosdepago
//
//		// Detalles de la factura //Producto 1
//
//		FacturaDetalle detalle = new FacturaDetalle(); //
//
//		detalle.getSecuencia().setValue("1"); // fel_productos
//		detalle.getCodigoProducto().setValue("LOF-1035N");
//		detalle.getDescripcion().setValue("Impresora HKA80");
//		detalle.getCantidadUnidades().setValue("62.00");
//		detalle.getUnidadMedida().setValue("KGM"); // fel_productos
//		detalle.getPrecioVentaUnitario().setValue("3850.00"); // fel_productos
//		detalle.getPrecioTotalSinImpuestos().setValue("238700.00");
//		detalle.getPrecioTotal().setValue("284053.00"); // fel_productos
//		// detalle.setSeriales("ABC123,ABC456"); // fel_productos
//		detalle.getMuestraGratis().setValue("0"); // fel_productos
//		// detalle.setNota("Producto nuevo de alta generacion"); // fel_productos
//		detalle.getPrecioReferencia().setValue("0.00"); // fel_productos
//		detalle.getCodigoTipoPrecio().setValue("01"); // fel_productos
//		detalle.getCantidadPorEmpaque().setValue("1"); // fel_productos
//		// detalle.setCantidadIndividual("1.00"); // fel_productos
//		detalle.getDescripcionTecnica().setValue(
//				"Impresora termica de punto de venta, ideal para puntos de venta con alto rendimiento"); // fel_productos
//																											// detalle.setMarca("HKA");
//																											// //
//																											// fel_productos
//		detalle.getModelo().setValue("HKA80"); // fel_productos
//		// detalle.setSubCodigoProducto("SUB-P000001"); // fel_productos
//		detalle.getCodigoFabricante().setValue("HKA800001"); // fel_productos
//		// detalle.setSubCodigoFabricante("SUB-HKA800001"); // fel_productos
//		detalle.getNombreFabricante().setValue("SIM");
//		detalle.getEstandarCodigoProducto().setValue("GTIN");
//		detalle.getEstandarCodigo().setValue("HKA80");
//		// detalle.setEstandarCodigoID("801236");
//		// detalle.setEstandarCodigoNombre("GTIN");
//		// detalle.setEstandarCodigoIdentificador("010");
//		// detalle.setEstandarSubCodigoProducto("");
//		// detalle.setEstandarOrganizacion("");
//		detalle.getCodigoIdentificadorPais().setValue("CO"); // fel_productos
//		// detalle.setMandatorioNumeroIdentificacion("900390126");
//		// detalle.setMandatorioNumeroIdentificacionDV("6");
//		// detalle.setMandatorioTipoIdentificacion("31");
//		detalle.getCantidadReal().setValue("1.00");
//		detalle.getCantidadRealUnidadMedida().setValue("KGM");
//		// detalle.setTipoAIU("Servicio");
//
//		// Impuestos de la factura - fel_impuestos
//		FacturaImpuestos impuesto1 = new FacturaImpuestos(); // fel_impuestos
//		impuesto1.getCodigoTOTALImp().setValue("01"); // fel_impuestos
//		impuesto1.getBaseImponibleTOTALImp().setValue("238700.00"); // fel_impuestos
//		impuesto1.getValorTOTALImp().setValue("45353.00"); // fel_impuestos
//		impuesto1.getPorcentajeTOTALImp().setValue("19.00"); // fel_impuestos
//		impuesto1.getControlInterno().setValue(""); // fel_impuestos
//		impuesto1.getUnidadMedida().setValue("UN"); // fel_impuestos
//		impuesto1.getUnidadMedidaTributo().setValue("0.00"); // fel_impuestos
//		impuesto1.getValorTributoUnidad().setValue("0.00"); // fel_impuestos
//
//		ArrayOfFacturaImpuestos arrayOfFacturaImpuestos1 = new ArrayOfFacturaImpuestos();
//		arrayOfFacturaImpuestos1.getFacturaImpuestos().add(impuesto1);
//		
//		detalle.getImpuestosDetalles().setValue(arrayOfFacturaImpuestos1); // fel_impuestos
//
//		ImpuestosTotales impTotalesdet = new ImpuestosTotales();
//		impTotalesdet.getCodigoTOTALImp().setValue("01");
//		impTotalesdet.getMontoTotal().setValue("45353.00");
//
//		
//		ArrayOfImpuestosTotales arrayOfImpuestosTotales1 = new ArrayOfImpuestosTotales();
//		arrayOfImpuestosTotales1.getImpuestosTotales().add(impTotalesdet);
//		detalle.getImpuestosTotales().setValue(arrayOfImpuestosTotales1);
//
//		// Producto 2
//		FacturaDetalle detalle2 = new FacturaDetalle(); //
//		detalle2.getSecuencia().setValue("1"); // fel_productos
//		detalle2.getCodigoProducto().setValue("LOF-1035N");
//		detalle2.getDescripcion().setValue("Impresora HKA80");
//		detalle2.getCantidadUnidades().setValue("85.00");
//		detalle2.getUnidadMedida().setValue("KGM"); // fel_productos
//		detalle2.getPrecioVentaUnitario().setValue("3850.00"); // fel_productos
//		detalle2.getPrecioTotalSinImpuestos().setValue("327250.00");
//		detalle2.getPrecioTotal().setValue("389427.50"); // fel_productos
//		// detalle2.setSeriales("ABC123,ABC456"); // fel_productos
//		detalle2.getMuestraGratis().setValue("0"); // fel_productos
//		// detalle2.setNota("Producto nuevo de alta generacion"); // fel_productos
//		detalle2.getPrecioReferencia().setValue("0.00"); // fel_productos
//		detalle2.getCodigoTipoPrecio().setValue("01"); // fel_productos
//		detalle2.getCantidadPorEmpaque().setValue("1"); // fel_productos
//		// detalle2.setCantidadIndividual("1.00"); // fel_productos
//		detalle2.getDescripcionTecnica().setValue(
//				"Impresora t�rmica de punto de venta, ideal para puntos de venta con alto rendimiento"); // fel_productos
//		detalle2.getMarca().setValue("HKA"); // fel_productos
//		detalle2.getModelo().setValue("HKA80"); // fel_productos
//		// detalle2.setSubCodigoProducto("SUB-P000001"); // fel_productos
//		detalle2.getCodigoFabricante().setValue("HKA800001"); // fel_productos
//		// detalle2.setSubCodigoFabricante("SUB-HKA800001"); // fel_productos
//		detalle2.getNombreFabricante().setValue("SIM");
//		detalle2.getEstandarCodigoProducto().setValue("GTIN");
//		detalle2.getEstandarCodigo().setValue("HKA80");
//		detalle2.getCodigoIdentificadorPais().setValue("CO"); // fel_productos
//		detalle2.getCantidadReal().setValue("1.00");
//		detalle2.getCantidadRealUnidadMedida().setValue("KGM");
//
//		// Impuestos de la factura - fel_impuestos
//		FacturaImpuestos impuesto2 = new FacturaImpuestos(); // fel_impuestos
//		impuesto2.getCodigoTOTALImp().setValue("01"); // fel_impuestos
//		impuesto2.getBaseImponibleTOTALImp().setValue("327250.00"); // fel_impuestos
//		impuesto2.getValorTOTALImp().setValue("62177.50"); // fel_impuestos
//		impuesto2.getPorcentajeTOTALImp().setValue("19.00"); // fel_impuestos
//		impuesto2.getControlInterno().setValue(""); // fel_impuestos
//		impuesto2.getUnidadMedida().setValue("UN"); // fel_impuestos
//		impuesto2.getUnidadMedidaTributo().setValue("0.00"); // fel_impuestos
//		impuesto2.getValorTributoUnidad().setValue("0.00"); // fel_impuestos
//
//		ArrayOfFacturaImpuestos arrayOfFacturaImpuestos2 = new ArrayOfFacturaImpuestos();
//		arrayOfFacturaImpuestos2.getFacturaImpuestos().add(impuesto2);
//		detalle2.getImpuestosDetalles().setValue(arrayOfFacturaImpuestos2); // fel_impuestos
//		ImpuestosTotales impTotalesdet2 = new ImpuestosTotales();
//		impTotalesdet2.getCodigoTOTALImp().setValue("01");
//		impTotalesdet2.getMontoTotal().setValue("62177.50");
//
//		ArrayOfImpuestosTotales arrayOfImpuestosTotales2 = new ArrayOfImpuestosTotales();
//		arrayOfImpuestosTotales2.getImpuestosTotales().add(impTotalesdet2);
//		detalle2.getImpuestosTotales().setValue(arrayOfImpuestosTotales2);
//
//		ArrayOfFacturaDetalle arrayOfFacturaDetalle= new ArrayOfFacturaDetalle();
//		arrayOfFacturaDetalle.getFacturaDetalle().add(detalle);
//		arrayOfFacturaDetalle.getFacturaDetalle().add(detalle2);
//		
//		factura.getDetalleDeFactura().setValue(arrayOfFacturaDetalle); // fel_impuestos
//
//		
//	}
}
