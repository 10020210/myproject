package com.core.model;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

public class QueryBean {

	 @QueryParam("active")
	 private boolean active = true;

	 @QueryParam("limit")
	 private int limit;
	 
	 @QueryParam("fromIndex")
	 private int fromIndex;
	 
	 @QueryParam("toIndex")
	 private int toIndex;
	 
	 @HeaderParam("Content-Type")
	 private String contentType;
	 
	 
	 @Context 
	 private UriInfo uriInfo;
	 
}
