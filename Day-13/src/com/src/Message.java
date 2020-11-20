package com.src;

public class Message
{
	String message;
	public Message(String message)  //constructor with parameter
	{
		this.message=message;
	}
	public String printMessage() //method to return message
	{
		return message;
	}
	public String displayMessage()
	{
		message="Hi "+message; //appending message
		return message;  //returning message
	} 
}
