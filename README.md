# springai

Minimal Spring Boot example that proxies a query to Google GenAI via Spring AI and returns the model's text response.

<img width="1306" height="681" alt="image" src="https://github.com/user-attachments/assets/aaa6911b-f7f5-46eb-9e9b-086320697a50" />

<img width="1346" height="692" alt="image" src="https://github.com/user-attachments/assets/dea85740-d917-48d6-92c2-d5cf1b36a145" />

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
