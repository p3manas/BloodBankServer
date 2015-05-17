/**
 * 
 */
package com.mrptech.giveLife.dao;

import com.mrptech.giveLife.model.User;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
public interface LoginDao {

	void login(User user)  throws ApplicationException;
}
