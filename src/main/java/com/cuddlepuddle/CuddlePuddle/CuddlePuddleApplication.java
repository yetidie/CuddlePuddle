package com.cuddlepuddle.cuddlePuddle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CuddlePuddleApplication extends SpringBootServletInitializer {

		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources( CuddlePuddleApplication.class);
		}

		public static void main(String[] args) {
			SpringApplication.run( CuddlePuddleApplication.class, args);
		}

}

