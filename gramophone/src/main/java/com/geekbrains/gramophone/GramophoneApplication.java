package com.geekbrains.gramophone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.logging.LogManager;

@SpringBootApplication
public class GramophoneApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(GramophoneApplication.class, args);
	}
}
