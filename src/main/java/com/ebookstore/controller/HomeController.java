package com.ebookstore.controller;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/home")
public class HomeController {
    @GET
    public Viewable index(){
        return new Viewable("/frontend/home");
    }
}
