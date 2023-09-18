package com.ebookstore.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/termsConditions")
public class TermsConditionsController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/termsConditions");
    }
}
