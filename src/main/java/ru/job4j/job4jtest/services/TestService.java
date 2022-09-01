package ru.job4j.job4jtest.services;

import ru.job4j.job4jtest.model.Employee;
import ru.job4j.job4jtest.model.Test;

import java.util.List;

public interface TestService {

    void startTest(Employee employee);
    void save(Test test);
    void stop(Test test);
    List<Test> findAll();
    List<Test> findById(int id);
    boolean isPassed();
}
