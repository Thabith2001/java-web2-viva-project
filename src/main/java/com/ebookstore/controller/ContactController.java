package com.ebookstore.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/contactUs")
public class ContactController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/contactUs");
    }
}
