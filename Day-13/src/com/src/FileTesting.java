package com.src;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileTesting 
{
	public void createFile()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name : ");
	String name = sc.next(); //getting name from the user
	name=name+".txt";  //appending text extension with name
	FileWriter fo=null;
	FileReader fr=null;
	try
	{
		fo=new FileWriter(name);  //creating the file with name as file name
		fo.write(name);
		fr=new FileReader(name);
		int i=fr.read();
		while(i!=-1)  //reading the file
		{
			System.out.println(i);
		}
		System.out.println("File created");
	}
	catch(Exception e)  //handling the exception
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("Successful");
	}

}

	public static void main(String[] args)
	{
		FileTesting ft=new FileTesting();  //creating and initializing the object
		ft.createFile();  //calling the method
	}
	}
