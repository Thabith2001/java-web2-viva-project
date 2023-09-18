package com.ebookstore.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class AppConfig extends ResourceConfig {

    public AppConfig(){
        packages("com.ebookstore.controller");
        packages("com.ebookstore.middleware");

        register(JspMvcFeature.class);
        property(JspMvcFeature.TEMPLATE_BASE_PATH,"/WEB-INF/views");
    }

}
