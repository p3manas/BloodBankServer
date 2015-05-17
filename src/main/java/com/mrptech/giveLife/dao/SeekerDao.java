/**
 * 
 */
package com.mrptech.giveLife.dao;

import java.util.List;

import com.mrptech.giveLife.clientRes.SeekerReq;
import com.mrptech.giveLife.dto.SeekerDto;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
public interface SeekerDao {

	List<SeekerDto> fetchDonors(SeekerReq seekerReq)  throws ApplicationException;
}
