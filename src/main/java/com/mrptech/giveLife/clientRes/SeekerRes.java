/**
 * 
 */
package com.mrptech.giveLife.clientRes;

import java.util.List;

import com.mrptech.giveLife.dto.SeekerDto;

/**
 * @author Manas Ranjan
 *
 */
public class SeekerRes {

	private String rescode;
	private String resMsg;
	private List<SeekerDto> seekerDtos;
	/**
	 * @return the rescode
	 */
	public String getRescode() {
		return rescode;
	}
	/**
	 * @param rescode the rescode to set
	 */
	public void setRescode(String rescode) {
		this.rescode = rescode;
	}
	/**
	 * @return the resMsg
	 */
	public String getResMsg() {
		return resMsg;
	}
	/**
	 * @param resMsg the resMsg to set
	 */
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	/**
	 * @return the seekerDtos
	 */
	public List<SeekerDto> getSeekerDtos() {
		return seekerDtos;
	}
	/**
	 * @param seekerDtos the seekerDtos to set
	 */
	public void setSeekerDtos(List<SeekerDto> seekerDtos) {
		this.seekerDtos = seekerDtos;
	}
	
}
