package com.pushkar.springai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    private final ChatClient chatClient;

    public GeminiService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String getGeminiResponse(String query) {
        String response = chatClient.prompt(query)
                .call()
                .content();
        System.out.println("Gemini response: " + response);
        return response;
    }
}
