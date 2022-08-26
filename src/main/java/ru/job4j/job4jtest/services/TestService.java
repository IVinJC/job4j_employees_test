package ru.job4j.job4jtest.services;

import ru.job4j.job4jtest.model.Test;

import java.util.List;

public interface TestService {
    void startTest();
    void save();
    void stop();
    List<Test> findAll();
}
