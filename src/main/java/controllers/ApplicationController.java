package controllers;

import com.google.inject.Singleton;

import mangoo.io.routing.Response;

@Singleton
public class ApplicationController {
    
    public Response index() {
        String hello = "Hello World!";
        return Response.withOk().andContent("hello", hello);
    }
}