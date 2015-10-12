/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.bravo.li.restfulResource;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.bravo.li.ejb.api.HelloWorldLocal;
import com.bravo.li.pojo.fighter.Fighter;

@Path("/bravo")
public class BravoRestService {
	
	@Inject 
	private HelloWorldLocal helloWorld;
	
	@GET
	@Path("/{param}")
	@Produces("application/json;charset=utf-8")
	public Response printMessage(@PathParam("param") String msg) {

		Fighter obj = helloWorld.returnFighter();

		return Response.status(200).entity(obj).build();
	}
}
