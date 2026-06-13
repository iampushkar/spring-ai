package com.pushkar.springai.controller;

import com.pushkar.springai.service.GeminiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final GeminiService geminiService;

    public AiController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @GetMapping("/{query}")
    public String getAiResponse(@PathVariable String query) {
        System.out.println("Received query: " + query);
        return geminiService.getGeminiResponse(query);
    }
}
