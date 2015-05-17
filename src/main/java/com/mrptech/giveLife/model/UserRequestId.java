package com.mrptech.giveLife.model;

// Generated May 13, 2015 10:44:21 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserRequestId generated by hbm2java
 */
@Embeddable
public class UserRequestId implements java.io.Serializable {

	private BigDecimal accountId;
	private BigDecimal reqId;
	private BigDecimal donorId;

	public UserRequestId() {
	}

	public UserRequestId(BigDecimal accountId, BigDecimal reqId,
			BigDecimal donorId) {
		this.accountId = accountId;
		this.reqId = reqId;
		this.donorId = donorId;
	}

	@Column(name = "ACCOUNT_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAccountId() {
		return this.accountId;
	}

	public void setAccountId(BigDecimal accountId) {
		this.accountId = accountId;
	}

	@Column(name = "REQ_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getReqId() {
		return this.reqId;
	}

	public void setReqId(BigDecimal reqId) {
		this.reqId = reqId;
	}

	@Column(name = "DONOR_ID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getDonorId() {
		return this.donorId;
	}

	public void setDonorId(BigDecimal donorId) {
		this.donorId = donorId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserRequestId))
			return false;
		UserRequestId castOther = (UserRequestId) other;

		return ((this.getAccountId() == castOther.getAccountId()) || (this
				.getAccountId() != null && castOther.getAccountId() != null && this
				.getAccountId().equals(castOther.getAccountId())))
				&& ((this.getReqId() == castOther.getReqId()) || (this
						.getReqId() != null && castOther.getReqId() != null && this
						.getReqId().equals(castOther.getReqId())))
				&& ((this.getDonorId() == castOther.getDonorId()) || (this
						.getDonorId() != null && castOther.getDonorId() != null && this
						.getDonorId().equals(castOther.getDonorId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAccountId() == null ? 0 : this.getAccountId().hashCode());
		result = 37 * result
				+ (getReqId() == null ? 0 : this.getReqId().hashCode());
		result = 37 * result
				+ (getDonorId() == null ? 0 : this.getDonorId().hashCode());
		return result;
	}

}
