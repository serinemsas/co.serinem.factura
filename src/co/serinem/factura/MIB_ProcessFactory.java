package co.serinem.factura;

import org.adempiere.base.IProcessFactory;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.process.ProcessCall;
import org.compiere.util.CLogger;
//import org.compiere.util.CLogger;
//import org.osgi.service.component.annotations.Component;

public class MIB_ProcessFactory implements IProcessFactory {

	private final static CLogger log = CLogger.getCLogger(MIB_ProcessFactory.class);

	@Override
	public ProcessCall newProcessInstance(String className) {
		ProcessCall process = null;

		if (className.equals("co.serinem.factura.EnviaFactura")) {

			try {
				process = EnviaFactura.class.getConstructor().newInstance();
//				CustomProcess customProcess = cacheProcess.get(i).getConstructor().newInstance();
				log.warning(String.format("Process created -> %s", className));
//				return customProcess;
			} catch (Exception e) {
				log.warning(String.format("Class %s can not be instantiated, Exception: %s", className, e));
				throw new AdempiereException(e);
			}

		}

//		if ("co.serinem.factura.EnviaFactura".equals(className)) {
//			try {
//				process =  EnviaFactura.class.getConstructor().newInstance();
//			} catch (Exception e) {}
//		}

		return process;
	}

}
