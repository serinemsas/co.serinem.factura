package org.serinem.event;

import java.math.BigDecimal;

import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.osgi.service.event.Event;
import org.serinem.model.MInvoice_mib;

public class MIBEventHandler extends AbstractEventHandler {

	/** Logger */
	private static CLogger log = CLogger.getCLogger(MIBEventHandler.class);

	/**
	 * Initialize Validation
	 */
	@Override
	protected void initialize() {
		log.warning("");

		registerTableEvent(IEventTopics.PO_BEFORE_NEW, MInvoice_mib.Table_Name);
		registerTableEvent(IEventTopics.PO_BEFORE_CHANGE, MInvoice_mib.Table_Name);
//		registerTableEvent(IEventTopics.PO_BEFORE_NEW, X_I_Invoice.Table_Name);
//		registerTableEvent(IEventTopics.PO_BEFORE_CHANGE, X_I_Invoice.Table_Name);

		// Eventos a Usar
//		registerTableEvent(IEventTopics.DOC_BEFORE_COMPLETE, MInvoice.Table_Name);
//		registerTableEvent(IEventTopics.DOC_AFTER_COMPLETE, MInvoice.Table_Name);

		// registerEvent(IEventTopics.AFTER_LOGIN);
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
		// private static CLogger log = CLogger.getCLogger(MIB_ValidatorFAC.class);

		String type = event.getTopic();
		PO po = getPO(event);
		log.info(po + " Type: " + type);
		String msg;

		if (po instanceof MInvoice_mib
				&& (type.equals(IEventTopics.PO_BEFORE_NEW) || type.equals(IEventTopics.PO_BEFORE_CHANGE))) {
			MInvoice_mib minvoice = (MInvoice_mib) po;
			msg = muestraFactura(minvoice);
			if (msg != null) {
				log.warning("Factura número " + msg);
				minvoice.sendEInvoice(" ");
			}
		}
	} // doHandleEvent

	/**
	 * Muestra Factura y cantidad de productos
	 */
	private String muestraFactura(MInvoice_mib minvoice) {
		String Document_No = (String) minvoice.get_Value("DocumentNo");
		BigDecimal totallineas = (BigDecimal) minvoice.get_Value("TotalLines");
		BigDecimal grandtotal = (BigDecimal) minvoice.get_Value("GrandTotal");

		if (Document_No == null) {
			return null;
		}
//		minvoice.sendEInvoice(" ");
		log.warning(" Número factura: " + Document_No + "Total lineas :" + totallineas.toString() + " Gran Total : "
				+ grandtotal.toString());
		System.out.println(" Número factura: " + Document_No + "  Total lineas :" + totallineas.toString()
				+ "  Gran Total : " + grandtotal.toString());
		return Document_No;

	}

}
