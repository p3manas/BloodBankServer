package com.mrptech.giveLife.model;

// Generated May 13, 2015 10:44:21 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserRequest generated by hbm2java
 */
@Entity
@Table(name = "USER_REQUEST")
public class UserRequest implements java.io.Serializable {

	private UserRequestId id;
	private UserDonor userDonor;
	private User user;
	private String bloodReqType;
	private Date reqTime;
	private String status;

	public UserRequest() {
	}

	public UserRequest(UserRequestId id, UserDonor userDonor, User user) {
		this.id = id;
		this.userDonor = userDonor;
		this.user = user;
	}

	public UserRequest(UserRequestId id, UserDonor userDonor, User user,
			String bloodReqType, Date reqTime, String status) {
		this.id = id;
		this.userDonor = userDonor;
		this.user = user;
		this.bloodReqType = bloodReqType;
		this.reqTime = reqTime;
		this.status = status;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "accountId", column = @Column(name = "ACCOUNT_ID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "reqId", column = @Column(name = "REQ_ID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "donorId", column = @Column(name = "DONOR_ID", nullable = false, precision = 22, scale = 0)) })
	public UserRequestId getId() {
		return this.id;
	}

	public void setId(UserRequestId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DONOR_ID", nullable = false, insertable = false, updatable = false)
	public UserDonor getUserDonor() {
		return this.userDonor;
	}

	public void setUserDonor(UserDonor userDonor) {
		this.userDonor = userDonor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCOUNT_ID", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "BLOOD_REQ_TYPE", length = 30)
	public String getBloodReqType() {
		return this.bloodReqType;
	}

	public void setBloodReqType(String bloodReqType) {
		this.bloodReqType = bloodReqType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REQ_TIME", length = 7)
	public Date getReqTime() {
		return this.reqTime;
	}

	public void setReqTime(Date reqTime) {
		this.reqTime = reqTime;
	}

	@Column(name = "STATUS", length = 30)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
