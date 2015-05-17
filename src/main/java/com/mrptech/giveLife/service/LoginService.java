/**
 * 
 */
package com.mrptech.giveLife.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mrptech.giveLife.clientRes.LoginReq;
import com.mrptech.giveLife.clientRes.LoginRes;

/**
 * @author Manas Ranjan
 *
 */
public interface LoginService {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/login")
	LoginRes login(LoginReq loginReq);

}
