# API Demo - Spring Boot Application

A simple Spring Boot application that provides a RESTful API with a `GET /hello` endpoint, returning a greeting message. The project includes unit and integration tests.

## Project Structure

```
07-api-demo
├── src
│   ├── main
│   │   └── java
│   │       └── com.practice.api_demo
│   │           ├── ApiDemoApplication.java
│   │           ├── HelloController.java
│   │           └── HelloService.java
│   └── test
│       └── java
│           └── com.practice.api_demo
│               ├── ApiDemoApplicationTests.java
│               ├── HelloControllerTest.java
│               └── HelloControllerIntegrationTest.java

```

## Getting Started

### Prerequisites

- Java 21+
- Maven 3.6+

### Run the Application

1. Build the project:

   ```bash
   mvn clean install
   ```

1. Run the application:

   ```bash
   mvn spring-boot:run
   ```

The application will be available at http://localhost:8080.

### Test the API

To test the API:

```bash
curl http://localhost:8080/hello
```

Response:

```
Hello from your first Java API! 👋
```

### Run Tests

To run unit and integration tests:

```bash

mvn test
```

## License

MIT License
