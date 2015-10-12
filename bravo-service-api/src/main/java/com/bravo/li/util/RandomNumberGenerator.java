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
package com.bravo.li.util;

import java.math.BigDecimal;
import java.util.Random;

public class RandomNumberGenerator {

	private Random rndNumber = new Random();
	
	public double getRandomDouble(double min, double max){
		double rate = rndNumber.nextDouble();
		double result = min + (max - min) * rate;
		result = new BigDecimal(result).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		
		return result;
	}
	
	public int getRandomInt(int min, int max){
		int rate = rndNumber.nextInt(max - min);
		int result = min + rate;
		
		return result;
	}
}
