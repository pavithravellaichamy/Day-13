package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import com.src.Message;

class MessageTest {
	String message="Hello";
	Message m=new Message(message);  //initializing the constructor
	@Test
	void printMessage() 
	{
		assertEquals(message,m.printMessage());  //checking the condition
	}
}
