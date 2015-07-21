package hellomaven;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMavenMain {

	public static void main(String[] args) throws IOException {

		Logger logger = LoggerFactory.getLogger(HelloMavenMain.class);
		logger.info("Hello Maven");
		
		
		System.out.println("what is your name?");
		  BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String s = bufferRead.readLine();
	 
		    System.out.println("Nice to meet you, " + s);
	}

}
