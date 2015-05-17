/**
 * 
 */
package com.mrptech.giveLife.clientRes;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Manas Ranjan
 *
 */
public class LoginReq {

	private String firstName;
	private String lastName;
	private String pwd;
	private Date dob;
	private String bloodGrp;
	private BigDecimal mobileNo;
	private String email;
	
	/*@Override
	public String toString() {
		return "userName : "+userName+" bloodGrp :"+bloodGrp +" pwd :"+pwd;
	}*/
	
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public BigDecimal getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(BigDecimal mobileNo) {
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
