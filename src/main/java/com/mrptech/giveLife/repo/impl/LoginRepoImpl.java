/**
 * 
 */
package com.mrptech.giveLife.repo.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.mrptech.giveLife.clientRes.LoginReq;
import com.mrptech.giveLife.dao.LoginDao;
import com.mrptech.giveLife.model.User;
import com.mrptech.giveLife.repo.LoginRepo;
import com.mrptech.giveLife.util.ApplicationException;
import com.mrptech.giveLife.util.Way2CauseUtil;

/**
 * @author Manas Ranjan
 *
 */
@Service
public class LoginRepoImpl implements LoginRepo {
	
	@Autowired
	LoginDao loginDao;

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void login(LoginReq loginReq) throws ApplicationException{
		
		User user=new User();
		user.setBloodGroup(loginReq.getBloodGrp());
		user.setFirstName(loginReq.getFirstName());
		user.setLastName(loginReq.getLastName());
		user.setDob(loginReq.getDob());
		user.setMobileNo(loginReq.getMobileNo());
		user.setEmail(loginReq.getEmail());
		user.setCreatedOn(new Date());
		user.setCreatedBy("Manas");
		user.setAccountId(Way2CauseUtil.randomGenerator());
		loginDao.login(user);
	}
}