package ru.job4j.bmb.services;

import ru.job4j.bmb.content.Content;
import ru.job4j.bmb.model.Mood;
import ru.job4j.bmb.model.MoodLog;

public class RecommendationEngine {
    private long chatId;
    private Long moodId;

    public RecommendationEngine(long chatId, Long moodId) {
        this.chatId = chatId;
        this.moodId = moodId;
    }

    public Content recommendFor(long chatId, Long moodId) {
        Content content = new Content(chatId);
        return content;
    }
}
