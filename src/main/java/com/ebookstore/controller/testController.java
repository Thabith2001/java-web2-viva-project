package com.ebookstore.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.glassfish.jersey.server.mvc.Viewable;

@Path("/test")
public class testController {
    @GET
    public Viewable index(){
//        return new Viewable("/frontend/myAccountNavigation");
        return new Viewable("/frontend/test");
    }
}
