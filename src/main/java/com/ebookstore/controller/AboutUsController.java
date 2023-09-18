package com.ebookstore.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/aboutUs")
public class AboutUsController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/aboutUs");
    }
}
