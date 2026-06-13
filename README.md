# springai

Minimal Spring Boot example that proxies a query to Google GenAI via Spring AI and returns the model's text response.

## Prerequisites
- Java 21
- Maven
- Google GenAI API key

## Configuration
Set the API key in `application.properties` or as an environment property:

```
spring.ai.google.genai.api-key=YOUR_API_KEY
```

## Run
```
mvn spring-boot:run
```

## UI
Open http://localhost:8080/ in a browser and use the simple web UI (type a query and click "Send").

## Endpoint
```
GET /api/ai/{query}
```

## Example
```
curl -s "http://localhost:8080/api/ai/Hello%20from%20SpringAI"
```

## Response
Plain text: the model's output.
