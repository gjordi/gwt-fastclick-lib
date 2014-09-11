package com.bytebybyte.gwt.fastclick.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.bytebybyte.gwt.fastclick.client.resources.FastClickLibClientBundle;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

public class FastClickLibConfigurerEntryPoint implements EntryPoint {

	protected Logger logger = Logger.getLogger(FastClickLibConfigurerEntryPoint.class.getName());

	@Override
	public void onModuleLoad() {

		FastClickLibClientBundle bundle = FastClickLibClientBundle.INSTANCE;

		logger.log(Level.INFO, "Injecting fastclick javascript script element.");

		ScriptInjector.fromString(bundle.fastclick().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
