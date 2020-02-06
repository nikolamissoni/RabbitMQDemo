package com.rabbitmq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, TimeoutException {

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		Publisher.Send();
		Consumer.Receive();
	}
}
