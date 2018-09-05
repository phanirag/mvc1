package com.app.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{ConfigClass.class,placeholderClass.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{ConfigClass.class,placeholderClass.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/mvc/*","/rest/*"};
	}

	
}
