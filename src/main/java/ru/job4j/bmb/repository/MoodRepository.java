package ru.job4j.bmb.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.bmb.model.User;

import java.util.List;

public interface MoodRepository extends CrudRepository {

    List<User> findAll();
}