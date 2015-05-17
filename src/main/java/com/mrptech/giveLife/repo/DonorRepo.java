/**
 * 
 */
package com.mrptech.giveLife.repo;

import com.mrptech.giveLife.clientRes.DonorReq;
import com.mrptech.giveLife.util.ApplicationException;

/**
 * @author Manas Ranjan
 *
 */
public interface DonorRepo {

	
	void donor(DonorReq donorReq) throws ApplicationException;
}
