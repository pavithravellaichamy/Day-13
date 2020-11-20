/**
 * 
 */
package com.test;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.src.Account;
import com.src.MessageClass;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class })
public class AccountSuite
{

	Result result = JUnitCore.runClasses(Account.class); //creating object with JUnitCore
	{
	for (Failure failure : result.getFailures()) 
	{
        System.out.println(failure.toString());	 //display if any failure occurs
	}
	System.out.println(result);  //displaying the result
}

}
