package com.test;

import static org.junit.jupiter.api.Assertions.*;
import com.src.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileTestingTest {

	@Test
	void createFile() throws IOException {
		FileTesting t=new FileTesting();
		FileWriter fo=new FileWriter("pavi123.txt");  //writing the file
		FileReader fr=new FileReader("pavi123.txt");  //reading the file
		int i=fr.read();
		while(i!=-1)  //reading the file
		{
			System.out.println(i);
		}
		}

}
