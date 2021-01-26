package co.serinem.modelo;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;
import org.compiere.model.MInvoice;
import org.compiere.model.X_I_Invoice;

public class MIB_ModelFactoryDN implements IModelFactory {

	@Override
	public Class<?> getClass(String tableName) {
		if (MInvoice.Table_Name.equals(tableName))
			return MInvoice.class;
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		if (X_I_Invoice.Table_Name.equals(tableName))
			return new X_I_Invoice(Env.getCtx(), Record_ID, trxName);
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		if (X_I_Invoice.Table_Name.equals(tableName))
			return new X_I_Invoice(Env.getCtx(), rs, trxName);
		return null;
	}

}
