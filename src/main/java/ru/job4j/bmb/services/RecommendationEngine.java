package ru.job4j.bmb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.job4j.bmb.content.Content;
import ru.job4j.bmb.model.Mood;
import ru.job4j.bmb.model.MoodLog;

@Component
public class RecommendationEngine {
    private long chatId;
    private Long moodId;

    public RecommendationEngine() {

    }


    public Content recommendFor(long chatId, Long moodId) {
        Content content = new Content(chatId);
        return content;
    }
}
