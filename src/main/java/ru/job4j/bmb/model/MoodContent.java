package ru.job4j.bmb.model;

import jakarta.persistence.*;
import org.springframework.data.repository.CrudRepository;
import ru.job4j.bmb.model.Mood;

import java.util.Objects;
import java.util.Optional;

@Entity
@Table(name = "mb_mood_content")
public class MoodContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mood_id")
    private Mood mood;

    private String text;

    public MoodContent(Mood mood, String text) {
        this.mood = mood;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MoodContent moodContent = (MoodContent) o;
        return Objects.equals(id, moodContent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
