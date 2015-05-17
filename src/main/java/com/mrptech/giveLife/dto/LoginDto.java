/**
 * 
 */
package com.mrptech.giveLife.dto;

import java.util.Date;

/**
 * @author Manas Ranjan
 *
 */
public class LoginDto {



	private String userName;
	private String pwd;
	private Date dob;
	private String bloodGrp;
	private String mobileNo;
	private String email;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the bloodGrp
	 */
	public String getBloodGrp() {
		return bloodGrp;
	}
	/**
	 * @param bloodGrp the bloodGrp to set
	 */
	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}
	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


}
