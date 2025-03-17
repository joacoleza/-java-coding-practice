package com.practice.api_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIntegrationTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void helloEndpointShouldReturnExpectedMessage() {
		// Send a GET request to /hello endpoint
		ResponseEntity<String> response = restTemplate.getForEntity("/hello", String.class);

		// Verify the response
		assertEquals("Hello from your first Java API! 👋", response.getBody());
	}
}
