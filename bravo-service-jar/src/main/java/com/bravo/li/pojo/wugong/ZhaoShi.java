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

import javax.persistence.*;
import javax.xml.bind.annotation.XmlType;

@Entity(name ="ZhaoShi")
@XmlType(name = "招式")
public class ZhaoShi {
	
	@Id
    @GeneratedValue
    private Long id;
	
	private String name;
	
	@Embedded
	private WuXueAdjustment wuxueAdjustment;

	public ZhaoShi(){
		
	}
	
	/**
	 * @param name
	 */
	public ZhaoShi(String name) {
		super();
		this.name = name;
	}
	
	/**
	 * @param name
	 */
	public ZhaoShi(String name, WuXueAdjustment wuxueAdjustment) {
		super();
		this.name = name;
		this.wuxueAdjustment = wuxueAdjustment;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
