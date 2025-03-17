package com.practice.api_demo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String getGreeting() {
		return "Hello from your first Java API! 👋";
	}
}
