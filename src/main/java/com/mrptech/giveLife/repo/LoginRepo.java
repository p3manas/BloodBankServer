/**
 * 
 */
package com.mrptech.giveLife.repo;

import com.mrptech.giveLife.clientRes.LoginReq;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
public interface LoginRepo {

	
	void login(LoginReq loginReq) throws ApplicationException;
}
