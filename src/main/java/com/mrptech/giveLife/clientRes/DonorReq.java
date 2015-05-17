/**
 * 
 */
package com.mrptech.giveLife.clientRes;

import java.math.BigDecimal;


/**
 * @author Manas Ranjan
 *
 */
public class DonorReq {

	private String status;
	private BigDecimal userId;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	
}
