package com.ebookstore.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/error")
public class ErrorController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/404");
    }
}
