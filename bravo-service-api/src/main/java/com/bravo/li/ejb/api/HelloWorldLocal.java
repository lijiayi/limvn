package com.bravo.li.ejb.api;

import javax.ejb.Local;

import com.bravo.li.pojo.fighter.Fighter;

@Local
public interface HelloWorldLocal {
	
	public String printHello();
	
	public Fighter returnFighter();

}
