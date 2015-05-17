/**
 * 
 */
package com.mrptech.giveLife.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mrptech.giveLife.clientRes.SeekerReq;
import com.mrptech.giveLife.dao.SeekerDao;
import com.mrptech.giveLife.dto.SeekerDto;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
@Repository
public class SeekerDaoImpl implements SeekerDao{

	@Autowired
	HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	public List<SeekerDto> fetchDonors(SeekerReq seekerReq) throws ApplicationException {
		return (List<SeekerDto>)hibernateTemplate.findByNamedQuery("DONOR_LIST", seekerReq.getLocation(),seekerReq.getBloodReq());	
	}
}