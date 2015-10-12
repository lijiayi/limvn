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

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class BravoApplication extends Application{
	private Set<Object> singletons = new HashSet<Object>();

	public BravoApplication() {
		singletons.add(new BravoRestService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
