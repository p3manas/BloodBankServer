/**
 * 
 */
package com.mrptech.giveLife.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mrptech.giveLife.dao.LoginDao;
import com.mrptech.giveLife.model.User;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
@Repository
public class LoginDaoImpl implements LoginDao{

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public void login(User user)  throws ApplicationException{		
		hibernateTemplate.save(user);
	}
}