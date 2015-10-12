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

import com.bravo.li.ejb.api.FightCalculation;
import com.bravo.li.pojo.fighter.Fighter;

@Stateless
public class FightCalculationImpl implements FightCalculation {

	@Override
	public double chu_zhao(Fighter fighter) {
		return fighter.getAttack() * fighter.getAccuracy();
	}

	@Override
	public double jie_zhao(Fighter fighter) {
		return fighter.getDefence() * fighter.getDodge();
	}

}
