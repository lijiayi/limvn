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

import com.bravo.li.ejb.api.PopulateWuXue;
import com.bravo.li.pojo.wugong.*;

@Path("/wuxue")
public class PopulateWuXueRestService {
	
	@Inject
	PopulateWuXue populate;

	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces("application/json;charset=utf-8")
	public Response populate_WuXue(WuXue wuxue) {
		populate.populate(wuxue);
		return Response.status(200).entity(wuxue).build();
	}
	
	@GET
	@Produces("application/json;charset=utf-8")
	public Response gimme_WuXUe(){
		WuXue wuxue = new WuXue();
		wuxue.setName("逍遥拳法");
		WuXueAdjustment wuxueAdjustment = new WuXueAdjustment();
		wuxue.setWuxueAdjustment(wuxueAdjustment);
		
		ZhaoShi diyizhao = new ZhaoShi("扶摇直上");
		ZhaoShi dierzhao = new ZhaoShi("鹏飞千里");
		
		wuxue.add_ZhaoShi(diyizhao);
		wuxue.add_ZhaoShi(dierzhao);
		
		return Response.status(200).entity(wuxue).build();
	}
	
}
