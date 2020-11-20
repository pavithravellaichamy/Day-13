/**
 * 
 */
package com.test;
/**
 * @author PAVINANDY
 *
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.src.Account;

class AccountTest1 {

	@Test
	public void withdraw()
	{
		Account ac=new Account("Lakshu",2593214, 25000);  //initializing the constructor
		ac.withdraw(10000, 1000);
		int balance=50000-10000+1000;
		boolean b=balance>0?true:false;
		assertEquals(b,ac.withdraw(10000, 1000));	//checking the condition 
	}	
}
