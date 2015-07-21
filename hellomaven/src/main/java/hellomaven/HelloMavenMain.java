package hellomaven;


import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMavenMain {

	public static void main(String[] args) throws IOException {

		Logger logger = LoggerFactory.getLogger(HelloMavenMain.class);
		logger.info("Hello Maven");
		
		int i = System.in.read();
		System.out.println("Number got is: " + i);
	
	}

}
