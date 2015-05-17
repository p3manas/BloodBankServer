/**
 * 
 */
package com.mrptech.giveLife.clientRes;

import java.math.BigDecimal;


/**
 * @author Manas Ranjan
 *
 */
public class SeekerReq {

	private String bloodReq;
	private BigDecimal userId;
	private String location;

	/**
	 * @return the bloodReq
	 */
	public String getBloodReq() {
		return bloodReq;
	}

	/**
	 * @param bloodReq the bloodReq to set
	 */
	public void setBloodReq(String bloodReq) {
		this.bloodReq = bloodReq;
	}

	/**
	 * @return the userId
	 */
	public BigDecimal getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
}
