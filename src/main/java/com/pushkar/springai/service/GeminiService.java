package com.pushkar.springai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    private final ChatClient chatClient;

    public GeminiService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String getGeminiResponse(String query) {
        String response = chatClient.prompt().user(query).call().content();
        System.out.println("Gemini response: " + response);
        return response;
    }
}
