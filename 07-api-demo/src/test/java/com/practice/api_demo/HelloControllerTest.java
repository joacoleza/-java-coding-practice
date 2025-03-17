package com.practice.api_demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloControllerTest {

	@Mock
	private HelloService helloService;

	@InjectMocks
	private HelloController helloController;

	@Test
	void testHelloEndpoint() {
		// Mock the service method
		when(helloService.getGreeting()).thenReturn("some-string");

		// Call the controller method and check the result
		String result = helloController.hello();

		// Verify the response
		assertEquals("some-string", result);
	}
}
