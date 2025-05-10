package com.audio.audio_tanscribe;


import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.ai.openai.api.OpenAiAudioApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transcription")
public class TranscriptionController {

    private final OpenAiAudioTranscriptionModel transcriptionModel;

    public TranscriptionController(String apiKey) {
        OpenAiAudioApi openAiAudioApi
                = new OpenAiAudioApi(System.getenv("spring.ai.open.api-key"));

        this.transcriptionModel
                = new OpenAiAudioTranscriptionModel(openAiAudioApi);
    }



}
