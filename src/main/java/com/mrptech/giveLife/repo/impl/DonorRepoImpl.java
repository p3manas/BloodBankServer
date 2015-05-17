/**
 * 
 */
package com.mrptech.giveLife.repo.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mrptech.giveLife.clientRes.DonorReq;
import com.mrptech.giveLife.dao.DonorDao;
import com.mrptech.giveLife.model.User;
import com.mrptech.giveLife.model.UserDonor;
import com.mrptech.giveLife.repo.DonorRepo;
import com.mrptech.giveLife.util.ApplicationException;
import com.mrptech.giveLife.util.Way2CauseUtil;

/**
 * @author Manas Ranjan
 *
 */
@Service
public class DonorRepoImpl implements DonorRepo {
	
	@Autowired
	DonorDao donorDao;

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void donor(DonorReq donorReq) throws ApplicationException {
		
		UserDonor donor=new UserDonor();		
		donor.setDonorId(Way2CauseUtil.randomGenerator());
		donor.setStatus("ACTIVE");
		donor.setDonorReqTime(new Date());		
		User user=new User();
		user.setAccountId(donorReq.getUserId());
		donor.setUser(user);
		donorDao.donor(donor);
	}
}