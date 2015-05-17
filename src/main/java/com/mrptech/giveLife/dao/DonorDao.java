/**
 * 
 */
package com.mrptech.giveLife.dao;

import com.mrptech.giveLife.model.UserDonor;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
public interface DonorDao {

	void donor(UserDonor userDonor)  throws ApplicationException;
}
