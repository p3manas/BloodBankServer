/**
 * 
 */
package com.mrptech.giveLife.service.impl;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrptech.giveLife.clientRes.DonorReq;
import com.mrptech.giveLife.clientRes.DonorRes;
import com.mrptech.giveLife.repo.DonorRepo;
import com.mrptech.giveLife.service.DonorService;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
@Path("/givelife")
public class DonorServiceImpl implements DonorService {
	
	
	@Autowired
	DonorRepo donorRepo;

	public DonorRes doDonor(DonorReq donorReq) {
		
		DonorRes donorRes=new DonorRes();
		
		try {
			donorRepo.donor(donorReq);
		} catch (ApplicationException e) {
			donorRes.setRescode("200");
			donorRes.setResMsg("Failed");
			return donorRes;
		}
		donorRes.setRescode("400");
		donorRes.setResMsg("Success");
		return donorRes;
	}

}
