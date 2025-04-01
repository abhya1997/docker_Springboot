package com.example.DockerTest;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerTestApplicationTests {
	
	public static Logger logger=org.slf4j.LoggerFactory.getLogger(DockerTestApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Hey Our First Test With Jenkins");
	}
	

}
