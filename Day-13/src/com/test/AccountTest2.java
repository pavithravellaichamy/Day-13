package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.src.Account;

class AccountTest2 {

	@Test
	void getBalance()
	{
		Account ac=new Account("Lakshu",2593214, 25000); //initializing the constructor
		double balance=39000*0.045;
		assertEquals(balance,ac.getBalance());  //checking the condition 
		
		
	}

}
