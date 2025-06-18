package com.example.llmapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LlmapiApplication 
{

	public static void main(String[] args) 
	{
		System.setProperty("file.encoding", "UTF-8");
		SpringApplication.run(LlmapiApplication.class, args);
	}

}
