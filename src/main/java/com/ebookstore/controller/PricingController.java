package com.ebookstore.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/pricing")
public class PricingController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/pricingTable");
    }
}
