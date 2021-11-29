package com.taco.tacomytaco;

import java.io.PrintStream;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class TacoMyTacoApplication implements WebMvcConfigurer {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication
				(TacoMyTacoApplication.class);
		app.setBanner(new Banner() {
			@Override
			public void printBanner(Environment environment,
									Class<?> sourceclass, PrintStream out) {
				out.print("\n\n\tThis is my own banner!\n\n".toUpperCase());
			}
		});
		app.run(args);
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/2").setViewName("home");
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
