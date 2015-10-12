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
package com.bravo.li.pojo.fighter;

import javax.persistence.*;

import com.bravo.li.pojo.Gender;
import com.bravo.li.pojo.Human;
import com.bravo.li.pojo.wugong.WuXue;

@Entity(name ="Fighter")
public class Fighter extends Human {
	
	@Transient
	public static double MAX_ATTEMPTS = 100;
	
	private double defence;
	private double attack;
	private double dodge;
	private double accuracy; 
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="wuxue_name")
	private WuXue wuxue;
	
	public void cal_damage(double damage){
		if(damage > 0){
			this.setCurr_health(this.getCurr_health() - damage);
		}
	}
	/**
	 * @return the defence
	 */
	public double getDefence() {
		return defence;
	}

	/**
	 * @param defence the defence to set
	 */
	public void setDefence(double defence) {
		this.defence = defence;
	}

	/**
	 * @return the attack
	 */
	public double getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(double attack) {
		this.attack = attack;
	}

	/**
	 * @return the dodge
	 */
	public double getDodge() {
		return dodge;
	}

	/**
	 * @param dodge the dodge to set
	 */
	public void setDodge(double dodge) {
		this.dodge = dodge;
	}

	/**
	 * @return the accuracy
	 */
	public double getAccuracy() {
		return accuracy;
	}

	/**
	 * @param accuracy the accuracy to set
	 */
	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	public Fighter(){
		super();
	}

	/**
	 * @param gender
	 * @param age
	 * @param name
	 * @param health
	 */
	public Fighter(Gender gender, int age, String name, int health, double defence, double attack, double dodge, double accuracy) {
		super(gender, age, name, health);
		
		this.defence = defence;
		this.attack = attack;
		this.dodge = dodge;
		this.accuracy = accuracy;
	}

	@Override
	public String toString() {
		return "Fighter [defence=" + defence + ", attack=" + attack
				+ ", dodge=" + dodge + ", accuracy=" + accuracy
				+ ", toString()=" + super.toString() + "]";
	}
	/**
	 * @return the wuxue
	 */
	public WuXue getWuxue() {
		return wuxue;
	}
	/**
	 * @param wuxue the wuxue to set
	 */
	public void setWuxue(WuXue wuxue) {
		this.wuxue = wuxue;
	}
	
}
