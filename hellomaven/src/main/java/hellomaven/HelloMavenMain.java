package hellomaven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMavenMain {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(HelloMavenMain.class);
		logger.info("Hello Maven");
	}

}
