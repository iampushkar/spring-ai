# springai

A minimal Spring Boot example that demonstrates using Spring AI's Google GenAI ChatClient.

This project exposes a single HTTP endpoint that proxies a user query to the Google GenAI chat model (via Spring AI) and returns the model's text response.

Prerequisites
- Java 21
- Maven 
- A Google GenAI API key (or other provider configuration supported by Spring AI) with access to the GenAI model you want to use.

Configuration
The project reads the API key from the Spring property `spring.ai.google.genai.api-key`. 
```
spring.ai.google.genai.api-key=ENTER_YOUR_API
```

Default server port: 8080 (standard Spring Boot default).

Usage

The application exposes a simple GET endpoint:

- GET /api/ai/{query}

Example (URI-encode spaces):

```
curl -s "http://localhost:8080/api/ai/Hello%20from%20SpringAI"
```

Response:
- Returns the model's text output as a plain string in the HTTP response body.
