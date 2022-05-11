package com.taco.tacomytaco;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TacoMyTacoApplication  {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication
				(TacoMyTacoApplication.class);
		app.setBanner((environment, sourceclass, out) -> out.print("\n\n\tThis is my own banner!\n\n".toUpperCase()));
		app.run(args);
	}
	static void makeStandardLog(){
		Logger logger = LoggerFactory.getLogger(TacoMyTacoApplication.class);
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
	}
	static void makeLogForTwo(){
		 Logger logger = (Logger) LogManager.getLogger("commons-log");
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");
	}
}
