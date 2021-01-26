package co.serinem.factura;

import java.math.BigDecimal;

import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;
import org.compiere.model.MInvoice;
import org.compiere.model.PO;
import org.compiere.model.X_I_Invoice;
import org.compiere.util.CLogger;
import org.osgi.service.event.Event;

public class MIB_ValidatorFAC extends AbstractEventHandler {
	/** Logger */
	private static CLogger log = CLogger.getCLogger(MIB_ValidatorFAC.class);

	/**
	 * Initialize Validation
	 */
	@Override
	protected void initialize() {
		log.warning("");

		registerTableEvent(IEventTopics.PO_BEFORE_NEW, MInvoice.Table_Name);
		registerTableEvent(IEventTopics.PO_BEFORE_CHANGE, MInvoice.Table_Name);
		registerTableEvent(IEventTopics.PO_BEFORE_NEW, X_I_Invoice.Table_Name);
//		registerTableEvent(IEventTopics.PO_BEFORE_CHANGE, X_I_Invoice.Table_Name);

//		registerEvent(IEventTopics.AFTER_LOGIN);
	} // initialize

	/**
	 * Model Change of a monitored Table. Called after PO.beforeSave/PO.beforeDelete
	 * when you called addModelChange for the table
	 * 
	 * @param event
	 * @exception Exception if the recipient wishes the change to be not accept.
	 */
	@Override
	protected void doHandleEvent(Event event) {
		String type = event.getTopic();
		PO po = getPO(event);
		log.info(po + " Type: " + type);
		System.out.println(po + " Type: " + type);
		String msg;

		if (po instanceof MInvoice
				&& (type.equals(IEventTopics.PO_BEFORE_NEW) || type.equals(IEventTopics.PO_BEFORE_CHANGE))) {
			MInvoice minvoice = (MInvoice) po;
			msg = muestraFactura(minvoice);
			if (msg != null) {
				log.info("Factura número " + msg);
				System.out.println("Factura número " + msg);
			}
		}
	} // doHandleEvent

	/**
	 * Muestra Factura y cantidad de productos
	 */

	private String muestraFactura(MInvoice minvoice) {
		String Document_No = (String) minvoice.get_Value("DocumentNo");
		BigDecimal totallineas = (BigDecimal) minvoice.get_Value("TotalLines");
		BigDecimal grandtotal = (BigDecimal) minvoice.get_Value("GrandTotal");

		if (Document_No == null) {
			return null;
		}
		log.info(" Número factura: " + Document_No + "Total lineas :" + totallineas.toString() + " Gran Total : "
				+ grandtotal.toString());
		System.out.println(" Número factura: " + Document_No + "  Total lineas :" + totallineas.toString()
				+ "  Gran Total : " + grandtotal.toString());
		return Document_No;

	}

}

//package co.serinem.factura;
//
//import java.math.BigDecimal;
//
//import org.adempiere.base.event.AbstractEventHandler;
//import org.adempiere.base.event.IEventTopics;
//import org.compiere.model.MInvoice;
//import org.compiere.model.PO;
//import org.compiere.model.X_I_Invoice;
//import org.compiere.util.CLogger;
//import org.osgi.service.event.Event;
//
///**
// *  
// */
//public class MIB_ValidatorFAC extends AbstractEventHandler {
//	/** Logger */
//	private static CLogger log = CLogger.getCLogger(MIB_ValidatorFAC.class);
//
//	/**
//	 * Initialize Validation
//	 */
//	@Override
//	protected void initialize() {
//		log.warning("");
//
//		registerTableEvent(IEventTopics.PO_BEFORE_NEW, MInvoice.Table_Name);
//		registerTableEvent(IEventTopics.PO_BEFORE_CHANGE, MInvoice.Table_Name);
//		registerTableEvent(IEventTopics.PO_BEFORE_NEW, X_I_Invoice.Table_Name);
//		registerTableEvent(IEventTopics.PO_BEFORE_CHANGE, X_I_Invoice.Table_Name);
//
//		registerEvent(IEventTopics.AFTER_LOGIN);
//	} // initialize
//
//	/**
//	 * Model Change of a monitored Table. Called after PO.beforeSave/PO.beforeDelete
//	 * when you called addModelChange for the table
//	 * 
//	 * @param event
//	 * @exception Exception if the recipient wishes the change to be not accept.
//	 */
//	@Override
//	protected void doHandleEvent(Event event) {
//		// private static CLogger log = CLogger.getCLogger(MIB_ValidatorFAC.class);
//
//		String type = event.getTopic();
//		PO po = getPO(event);
//		log.info(po + " Type: " + type);
//		System.out.println(po + " Type: " + type);
//		String msg;
//
//		if (po instanceof MInvoice
//				&& (type.equals(IEventTopics.PO_BEFORE_NEW) || type.equals(IEventTopics.PO_BEFORE_CHANGE))) {
//			MInvoice minvoice = (MInvoice) po;
//			msg = muestraFactura(minvoice);
//			if (msg != null)
//				log.info("Factura número " + msg);
//			System.out.println("Factura número " + msg);
//
//		}
//	} // doHandleEvent
//
//	/**
//	 * Muestra Factura y cantidad de productos
//	 */
//	private String muestraFactura(MInvoice minvoice) {
//		String Document_No = (String) minvoice.get_Value("DocumentNo");
//		BigDecimal totallineas = (BigDecimal) minvoice.get_Value("TotalLines");
//		BigDecimal grandtotal = (BigDecimal) minvoice.get_Value("GrandTotal");
//
//		if (Document_No == null) {
//			return null;
//		}
//		log.info(" Número factura: " + Document_No + "Total lineas :" + totallineas.toString() + " Gran Total : "
//				+ grandtotal.toString());
//		System.out.println(" Número factura: " + Document_No + "  Total lineas :" + totallineas.toString()
//				+ "  Gran Total : " + grandtotal.toString());
//		return Document_No;
//
//	}
//
//}
