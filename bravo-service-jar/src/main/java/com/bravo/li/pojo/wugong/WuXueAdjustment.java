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
package com.bravo.li.pojo.wugong;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlType;

@Embeddable
@XmlType(name = "武学加成")
public class WuXueAdjustment {
	
	private Double attack_addition;
	private Double attack_adjustment ;
	private Double defend_addition ;
	private Double defend_adjustment;
	private Double dodge_addition ;
	private Double dodge_adjustment ;
	private Double accuracy_addition ;
	private Double accuracy_adjustment ;
	
	public WuXueAdjustment(){
		
	}
	
	/**
	 * @param attack_addition
	 * @param attack_adjustment
	 * @param defend_addition
	 * @param defend_adjustment
	 * @param dodge_addition
	 * @param dodge_adjustment
	 * @param accuracy_addition
	 * @param accuracy_adjustment
	 */
	public WuXueAdjustment(Double attack_addition, Double attack_adjustment,
			Double defend_addition, Double defend_adjustment,
			Double dodge_addition, Double dodge_adjustment,
			Double accuracy_addition, Double accuracy_adjustment) {
		super();
		this.attack_addition = attack_addition;
		this.attack_adjustment = attack_adjustment;
		this.defend_addition = defend_addition;
		this.defend_adjustment = defend_adjustment;
		this.dodge_addition = dodge_addition;
		this.dodge_adjustment = dodge_adjustment;
		this.accuracy_addition = accuracy_addition;
		this.accuracy_adjustment = accuracy_adjustment;
	}

	/**
	 * @return the attack_addition
	 */
	public Double getAttack_addition() {
		return attack_addition;
	}

	/**
	 * @param attack_addition the attack_addition to set
	 */
	public void setAttack_addition(Double attack_addition) {
		this.attack_addition = attack_addition;
	}

	/**
	 * @return the attack_adjustment
	 */
	public Double getAttack_adjustment() {
		return attack_adjustment;
	}

	/**
	 * @param attack_adjustment the attack_adjustment to set
	 */
	public void setAttack_adjustment(Double attack_adjustment) {
		this.attack_adjustment = attack_adjustment;
	}

	/**
	 * @return the defend_addition
	 */
	public Double getDefend_addition() {
		return defend_addition;
	}

	/**
	 * @param defend_addition the defend_addition to set
	 */
	public void setDefend_addition(Double defend_addition) {
		this.defend_addition = defend_addition;
	}

	/**
	 * @return the defend_adjustment
	 */
	public Double getDefend_adjustment() {
		return defend_adjustment;
	}

	/**
	 * @param defend_adjustment the defend_adjustment to set
	 */
	public void setDefend_adjustment(Double defend_adjustment) {
		this.defend_adjustment = defend_adjustment;
	}

	/**
	 * @return the dodge_addition
	 */
	public Double getDodge_addition() {
		return dodge_addition;
	}

	/**
	 * @param dodge_addition the dodge_addition to set
	 */
	public void setDodge_addition(Double dodge_addition) {
		this.dodge_addition = dodge_addition;
	}

	/**
	 * @return the dodge_adjustment
	 */
	public Double getDodge_adjustment() {
		return dodge_adjustment;
	}

	/**
	 * @param dodge_adjustment the dodge_adjustment to set
	 */
	public void setDodge_adjustment(Double dodge_adjustment) {
		this.dodge_adjustment = dodge_adjustment;
	}

	/**
	 * @return the accuracy_addition
	 */
	public Double getAccuracy_addition() {
		return accuracy_addition;
	}

	/**
	 * @param accuracy_addition the accuracy_addition to set
	 */
	public void setAccuracy_addition(Double accuracy_addition) {
		this.accuracy_addition = accuracy_addition;
	}

	/**
	 * @return the accuracy_adjustment
	 */
	public Double getAccuracy_adjustment() {
		return accuracy_adjustment;
	}

	/**
	 * @param accuracy_adjustment the accuracy_adjustment to set
	 */
	public void setAccuracy_adjustment(Double accuracy_adjustment) {
		this.accuracy_adjustment = accuracy_adjustment;
	}
	
}
