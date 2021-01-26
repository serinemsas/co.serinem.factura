package co.serinem.factura;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.adempiere.exceptions.FillMandatoryException;
import org.compiere.model.MInvoice;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.AdempiereUserError;
import org.compiere.util.Env;

import co.serinem.jco.einvoice.Conexion;

public class EnviaFactura extends SvrProcess {

	public static final String PARAM_C_Invoice_ID = "C_Invoice_ID";
	private int p_C_Invoice_ID = 0;

	@Override
	protected void prepare() {

		//////////////

		for (ProcessInfoParameter para : getParameter()) {
			String name = para.getParameterName();
			if (para.getParameter() == null) {
				;
			} else if (name.equals(PARAM_C_Invoice_ID)) {
				p_C_Invoice_ID = para.getParameterAsInt();
			}
		}

//		if (p_C_Invoice_ID <= 0)
//		{
//			throw new FillMandatoryException(PARAM_C_Invoice_ID);
//		}

	}

	@SuppressWarnings("static-access")
	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub

		p_C_Invoice_ID = getRecord_ID();

		if (p_C_Invoice_ID <= 0) {
			throw new FillMandatoryException(PARAM_C_Invoice_ID);
		}

		log.warning("Proceso preparado con AD_Client_ID " + Env.getAD_Client_ID(Env.getCtx()));

		StringBuilder respuesta = new StringBuilder();

		MInvoice invoice = new MInvoice(getCtx(), p_C_Invoice_ID, get_TrxName());

		if (invoice.getC_Invoice_ID() == 0)
			throw new AdempiereUserError("  @No@ @Invoice@");

		Conexion.getWebServiceHKA(invoice, respuesta);

		respuesta.append(invoice.get_Value(invoice.COLUMNNAME_DocumentNo)).append("|");
//
		respuesta.append(invoice.getCreated()).append("|");
		respuesta.append(invoice.getGrandTotal()).append("|");
		respuesta.append("Todo Bien").append("|");
//

//		int AD_Process_ID = MProcess.getProcess_ID("KeyValueOfProcess", null);
//		getProcessInfo().getProcessUI();
//		System.out.println("AD_Process_ID >>>>>" + AD_Process_ID);
//		System.out.println("getProcessInfo().getProcessUI() >>>>>" + getProcessInfo().getProcessUI());
		addLog(getProcessInfo().getAD_Process_ID(), new Timestamp(System.currentTimeMillis()),
				new BigDecimal(getProcessInfo().getAD_PInstance_ID()), "La Factura examinada : " + respuesta);
//		return "@ProcessOK@";
		return null;

	}

}
