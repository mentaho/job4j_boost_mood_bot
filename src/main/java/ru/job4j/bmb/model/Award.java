package ru.job4j.bmb.model;

import jakarta.persistence.*;
import org.springframework.data.repository.CrudRepository;

import java.util.Objects;
import java.util.Optional;

@Entity
@Table(name = "mb_award")
public class Award {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private int days;

    public Award(String title, String description, int days) {
    this.title = title;
    this.description = description;
    this.days = days;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Award award = (Award) o;
        return Objects.equals(award, award.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
