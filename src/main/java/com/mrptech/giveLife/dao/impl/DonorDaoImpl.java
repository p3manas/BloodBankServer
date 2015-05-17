/**
 * 
 */
package com.mrptech.giveLife.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.mrptech.giveLife.dao.DonorDao;
import com.mrptech.giveLife.model.UserDonor;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
@Repository
public class DonorDaoImpl implements DonorDao{

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public void donor(UserDonor userDonor) throws ApplicationException {
		hibernateTemplate.save(userDonor);
	}
}