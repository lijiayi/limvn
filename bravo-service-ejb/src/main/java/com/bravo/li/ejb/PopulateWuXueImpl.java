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
package com.bravo.li.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.bravo.li.ejb.api.PopulateWuXue;
import com.bravo.li.pojo.wugong.WuXue;

@Stateless
public class PopulateWuXueImpl implements PopulateWuXue {

	@Inject
	EntityManager em;
	
	@Override
	public void populate(WuXue wuxue) {
		em.persist(wuxue);
	}

}
