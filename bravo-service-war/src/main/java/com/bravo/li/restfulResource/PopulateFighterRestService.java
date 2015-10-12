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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bravo.li.ejb.api.PopulateFighter;
import com.bravo.li.pojo.fighter.Fighter;

@Path("/fighter")
public class PopulateFighterRestService {

	@Inject
	PopulateFighter populate;

	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces("application/json;charset=utf-8")
	public Response populate_WuXue(Fighter fighter) {
		populate.populate(fighter);
		return Response.status(200).entity(fighter).build();
	}
}
