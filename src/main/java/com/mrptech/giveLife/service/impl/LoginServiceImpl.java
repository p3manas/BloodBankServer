/**
 * 
 */
package com.mrptech.giveLife.service.impl;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrptech.giveLife.clientRes.LoginReq;
import com.mrptech.giveLife.clientRes.LoginRes;
import com.mrptech.giveLife.repo.LoginRepo;
import com.mrptech.giveLife.service.LoginService;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
@Path("/givelife")
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	LoginRepo loginRepo;

	/* 
	 * @see com.mrptech.giveLife.service.LoginService#login(com.mrptech.giveLife.clientRes.LoginReq)
	 */
	public LoginRes login(LoginReq loginReq) {
		
		LoginRes loginRes=new LoginRes();		
		try {
			loginRepo.login(loginReq);
		} catch (ApplicationException e) {
			loginRes.setRescode("200");
			loginRes.setResMsg("Failed");
			return loginRes;
		}
		loginRes.setRescode("400");
		loginRes.setResMsg("Success");
		return loginRes;
	}

}
