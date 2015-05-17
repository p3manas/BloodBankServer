/**
 * 
 */
package com.mrptech.giveLife.dto;

import java.math.BigDecimal;

/**
 * @author Manas Ranjan
 *
 */
public class SeekerDto {

	private BigDecimal mobileNo;
	private BigDecimal donorId;
	private BigDecimal accountId;

	public SeekerDto() {

	}

	public SeekerDto(BigDecimal mobileNo,BigDecimal donorId,BigDecimal accountId) {
		this.accountId=accountId;
		this.donorId=donorId;
		this.mobileNo=mobileNo;
	}

	/**
	 * @return the mobileNo
	 */
	public BigDecimal getMobileNo() {
		return mobileNo;
	}

	
	/**
	 * @return the donorId
	 */
	public BigDecimal getDonorId() {
		return donorId;
	}

	

	/**
	 * @return the accountId
	 */
	public BigDecimal getAccountId() {
		return accountId;
	}

	

	@Override
	public String toString() {
		return " "+mobileNo;
	}
}
