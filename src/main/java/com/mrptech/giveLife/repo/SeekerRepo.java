/**
 * 
 */
package com.mrptech.giveLife.repo;

import java.util.List;

import com.mrptech.giveLife.clientRes.SeekerReq;
import com.mrptech.giveLife.dto.SeekerDto;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
public interface SeekerRepo {

	
	List<SeekerDto> seeker(SeekerReq seekerReq) throws ApplicationException;
}
