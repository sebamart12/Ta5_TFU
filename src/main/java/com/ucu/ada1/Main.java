package com.ucu.ada1;

import com.ucu.ada1.infrastructure.api.JudgeController;
import java.io.ObjectInputFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
