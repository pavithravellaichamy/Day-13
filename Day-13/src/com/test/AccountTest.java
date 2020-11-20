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

class AccountTest {
	
	@Test
	void deposit() 
	{
		 Account ac=new Account("Lakshu",2593214, 40000);  //initializing the constructor
		 ac.deposit(10000);
		 int result=40000+10000;
		 assertEquals(result,ac.deposit(10000));  //checking the condition 
	}

}
