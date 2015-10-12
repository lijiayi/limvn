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
package com.bravo.li.ejb.api;

import javax.ejb.Local;

import com.bravo.li.pojo.fighter.Fighter;

@Local
public interface FightCalculation {
	
	public double chu_zhao(Fighter fighter);
	
	public double jie_zhao(Fighter fighter);
	
}
