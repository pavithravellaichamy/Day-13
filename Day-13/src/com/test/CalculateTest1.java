package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.src.Message;

class CalculateTest1 {
	String message="Hello";
	Message m=new Message(message);  //initializing the constructor
	@Test
	void displaymessage()
	{
		message="Hi "+"Hello";
		assertEquals(message,m.displayMessage());  //checking the condition
	}

}
