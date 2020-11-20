/**
 * 
 */
package com.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.src.Account;

class AccountTest3 {

	@Test
	void getAccountNumber()
	{
		Account ac=new Account("Lakshu",2593214, 25000);  //initializing the constructor
		long accountnum=2593214;
		assertEquals(accountnum,ac.getAccountNumber()); //checking the condition
	}

}
