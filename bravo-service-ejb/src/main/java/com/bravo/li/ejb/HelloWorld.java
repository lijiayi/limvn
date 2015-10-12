package com.bravo.li.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.bravo.li.ejb.api.HelloWorldLocal;
import com.bravo.li.ejb.api.StageController;
import com.bravo.li.pojo.Gender;
import com.bravo.li.pojo.fighter.Fighter;
import com.bravo.li.pojo.wugong.*;
import com.bravo.li.util.RandomNumberGenerator;

/**
 * Session Bean implementation class HelloWorld
 */
@Stateless
public class HelloWorld implements HelloWorldLocal {

	@Inject
    private EntityManager em;
	
	@Inject
	private RandomNumberGenerator rm;
	
	@Inject
	private StageController stageController;

    /**
     * Default constructor. 
     */
    public HelloWorld() {
        
    }

    @Override
    public Fighter returnFighter(){
    	Fighter fa = gimmeARandomFighter();
		Fighter fb = gimmeARandomFighter();
		fa.setName("令狐");
		fb.setName("左冷禅");
				
		em.persist(fa);
		em.persist(fb);
		
		WuXue wuxue = new WuXue();
		wuxue.setName("逍遥拳法");
		WuXueAdjustment wuxueAdjustment = new WuXueAdjustment();
		wuxue.setWuxueAdjustment(wuxueAdjustment);
		
		ZhaoShi diyizhao = new ZhaoShi("扶摇直上");
		ZhaoShi dierzhao = new ZhaoShi("鹏飞千里");
		
		wuxue.add_ZhaoShi(diyizhao);
		wuxue.add_ZhaoShi(dierzhao);
		
		fa.setWuxue(wuxue);
		
		em.persist(fa);
		em.persist(wuxue);
		
		return fa;
    }
    
	@Override
	public String printHello() {
		StringBuilder sb = new StringBuilder();
		sb.append("这简直是大便啊");
		Fighter fa = gimmeARandomFighter();
		Fighter fb = gimmeARandomFighter();
		fa.setName("令狐");
		fb.setName("左冷禅");
				
		em.persist(fa);
		em.persist(fb);
		
		WuXue wuxue = new WuXue();
		wuxue.setName("逍遥拳法");
		WuXueAdjustment wuxueAdjustment = new WuXueAdjustment();
		wuxue.setWuxueAdjustment(wuxueAdjustment);
		
		ZhaoShi diyizhao = new ZhaoShi("扶摇直上");
		ZhaoShi dierzhao = new ZhaoShi("鹏飞千里");
		
		wuxue.add_ZhaoShi(diyizhao);
		wuxue.add_ZhaoShi(dierzhao);
		
		fa.setWuxue(wuxue);
		
		em.persist(fa);
		em.persist(wuxue);
		
//		stageController.initiaPlayer(fa);
//		stageController.initiaPlayer(fb);
//		
//		GameResult gr = stageController.startFight(fa, fb);
//		
//		stageController.settleResult(gr);
		
		// TODO Auto-generated method stub
		return sb.toString();
	}
	
	private Fighter gimmeARandomFighter(){
		double defence = rm.getRandomDouble(0, Fighter.MAX_ATTEMPTS);
		double attack = rm.getRandomDouble(0, Fighter.MAX_ATTEMPTS);
		double dodge = rm.getRandomDouble(0, 1);
		double accuracy = rm.getRandomDouble(0, 1);
		
		Fighter f = new Fighter(Gender.MALE, 14, "DABIAN", 120, defence, attack, dodge, accuracy);
		
		return f;
	}

}
