/**
 * 
 */
package com.src;
/**
 * @author PAVINANDY
 *
 */
import java.util.Scanner;

public class DebugEx {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
		}
		try
		{
			int arr[]= {5,6,7,8};
			System.out.println(arr[5]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Successful");
		}

	}

}
