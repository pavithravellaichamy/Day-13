/**
 * 
 */
package com.test;
/**
 * @author PAVINANDY
 *
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.Result;

import com.src.MessageClass;


@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests 
{
	Result result = JUnitCore.runClasses(MessageClass.class);  //creating object with JUnitCore
	{
	for (Failure failure : result.getFailures()) 
	{
        System.out.println(failure.toString());	//display if any failure occurs
	}
	System.out.println(result);  //displaying the result
}
}