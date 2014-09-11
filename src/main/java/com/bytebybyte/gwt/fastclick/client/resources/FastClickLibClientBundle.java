package com.bytebybyte.gwt.fastclick.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface FastClickLibClientBundle extends ClientBundle {

	public final static FastClickLibClientBundle INSTANCE = GWT.create(FastClickLibClientBundle.class);

	@Source("fastclick/fastclick.min.js")
	TextResource fastclick();

}
