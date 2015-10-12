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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bravo.li.ejb.api.FightCalculation;
import com.bravo.li.ejb.api.StageController;
import com.bravo.li.pojo.fighter.Fighter;
import com.bravo.li.pojo.result.GameResult;

@Stateless
public class StageControllerImpl implements StageController {
	
	final Logger logger = LoggerFactory.getLogger(StageControllerImpl.class);
	
	@Inject
	EntityManager em;
	
	@Inject
	FightCalculation fightCalculator;

	@Override
	public void initiaPlayer(Fighter a) {
		a.setCurr_health(a.getHealth());
	}

	@Override
	public GameResult startFight(Fighter a, Fighter b) {
		GameResult gr = new GameResult();
		
		while(hui_he(a, b)){
			if(!hui_he(b, a)){
				gr.setLoser(a);
				gr.setWinner(b);
				logger.info("%s wins", b.getName());
				return gr;
			}
		}
		
		gr.setLoser(b);
		gr.setWinner(a);
		logger.info("%s wins", a.getName());
		
		return gr;
	}


	@Override
	public void settleResult(GameResult gr) {
		em.persist(gr);
	}
	
	private boolean hui_he(Fighter attacker, Fighter defender){
		logger.info(String.format("%s shi_chu_le_yi_zhao_da_xiang %s", attacker.getName(), defender.getName()));
		
		double damage = fightCalculator.chu_zhao(attacker);
		double defence = fightCalculator.jie_zhao(defender);
		
		double jie_suan = damage;
		logger.info(String.format("%s shou_dao_le %f dian_shang_hai", defender.getName(), jie_suan));
		defender.cal_damage(jie_suan);
		
		return (defender.getCurr_health() > 0);
	}

}
