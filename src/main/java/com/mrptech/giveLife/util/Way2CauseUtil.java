package com.mrptech.giveLife.util;

import java.math.BigDecimal;
import java.util.Random;

public class Way2CauseUtil {

	
	public static BigDecimal randomGenerator(){
		
		Random random=new Random();
		
		
		return new BigDecimal(random.nextInt());
	}
}
