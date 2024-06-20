package com.ucu.ada1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Main {

	public static void main(String[] args) {

		new SpringApplicationBuilder(Main.class)
				.registerShutdownHook(true)
				.run(args);
	}

}
