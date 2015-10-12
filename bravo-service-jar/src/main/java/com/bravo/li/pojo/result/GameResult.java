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
package com.bravo.li.pojo.result;

import javax.persistence.*;

import com.bravo.li.pojo.fighter.Fighter;

@Entity(name ="GameResult")
public class GameResult {
	
	@Id
	@GeneratedValue
	Integer id;
	
	@OneToOne(optional=false)
	Fighter winner;
	
	@OneToOne(optional=false)
	Fighter loser;

	/**
	 * @param fighterA
	 * @param fighterB
	 */
	public GameResult(Fighter winner, Fighter loser) {
		super();
		this.winner = winner;
		this.loser = loser;
	}

	/**
	 * 
	 */
	public GameResult() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the winner
	 */
	public Fighter getWinner() {
		return winner;
	}

	/**
	 * @param winner the winner to set
	 */
	public void setWinner(Fighter winner) {
		this.winner = winner;
	}

	/**
	 * @return the loser
	 */
	public Fighter getLoser() {
		return loser;
	}

	/**
	 * @param loser the loser to set
	 */
	public void setLoser(Fighter loser) {
		this.loser = loser;
	}
}
