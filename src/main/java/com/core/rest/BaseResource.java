package com.core.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;



@Component
@Path("/")
public class BaseResource {
	@GET
	@Path("/version")
	public Response version(){
		return Response.ok().entity("1.0").build();
	}
	
}
