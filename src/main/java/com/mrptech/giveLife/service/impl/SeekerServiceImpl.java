/**
 * 
 */
package com.mrptech.giveLife.service.impl;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrptech.giveLife.clientRes.SeekerReq;
import com.mrptech.giveLife.clientRes.SeekerRes;
import com.mrptech.giveLife.dto.SeekerDto;
import com.mrptech.giveLife.repo.SeekerRepo;
import com.mrptech.giveLife.service.SeekerService;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
@Path("/givelife")
public class SeekerServiceImpl implements SeekerService {
	
	
	@Autowired
	SeekerRepo seekerRepo;

	
	public SeekerRes doSeeker(SeekerReq seekerReq) {
		
		SeekerRes seekerRes=new SeekerRes();
		List<SeekerDto> seekerDtos=null;
		try {
			seekerDtos=seekerRepo.seeker(seekerReq);
		} catch (ApplicationException e) {
			seekerRes.setRescode("200");
			seekerRes.setResMsg("Failed");
			return seekerRes;
		}
		seekerRes.setRescode("400");
		seekerRes.setResMsg("Success");
		seekerRes.setSeekerDtos(seekerDtos);
		return seekerRes;
	}

}
