package com.ebookstore.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/faq")
public class FAQController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/faq");
    }
}
