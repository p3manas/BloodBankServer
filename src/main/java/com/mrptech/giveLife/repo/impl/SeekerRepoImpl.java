/**
 * 
 */
package com.mrptech.giveLife.repo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mrptech.giveLife.clientRes.SeekerReq;
import com.mrptech.giveLife.dao.SeekerDao;
import com.mrptech.giveLife.dto.SeekerDto;
import com.mrptech.giveLife.repo.SeekerRepo;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
@Service
public class SeekerRepoImpl implements SeekerRepo {

	@Autowired
	SeekerDao seekerDao;

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public List<SeekerDto> seeker(SeekerReq seekerReq)
			throws ApplicationException {
		return seekerDao.fetchDonors(seekerReq);
	}
}