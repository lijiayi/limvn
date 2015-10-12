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

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name ="WuXue")
@XmlRootElement(name = "武学")
public class WuXue {

	@Id
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval=true)
    @JoinColumn(name="Zhaoshi_ID")
	private List<ZhaoShi> zhaoshi;
	
	@Embedded
	private WuXueAdjustment wuxueAdjustment;
	
	/**
	 * @param name
	 * @param zhaoshi
	 */
	public WuXue(String name, List<ZhaoShi> zhaoshi, WuXueAdjustment wuxueAdjustment) {
		super();
		this.name = name;
		this.zhaoshi = zhaoshi;
		this.wuxueAdjustment = wuxueAdjustment;
	}
	
	public void add_ZhaoShi(final ZhaoShi zhao){
		if(zhaoshi == null){
			zhaoshi = new ArrayList<ZhaoShi>();
		}
		
		zhaoshi.add(zhao);
	}

	public WuXue() {
	}

	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the zhaoshi
	 */
	public List<ZhaoShi> getZhaoshi() {
		return zhaoshi;
	}
	/**
	 * @param zhaoshi the zhaoshi to set
	 */
	public void setZhaoshi(List<ZhaoShi> zhaoshi) {
		this.zhaoshi = zhaoshi;
	}

	/**
	 * @return the wuxueAdjustment
	 */
	public WuXueAdjustment getWuxueAdjustment() {
		return wuxueAdjustment;
	}

	/**
	 * @param wuxueAdjustment the wuxueAdjustment to set
	 */
	public void setWuxueAdjustment(WuXueAdjustment wuxueAdjustment) {
		this.wuxueAdjustment = wuxueAdjustment;
	}
}
