package ru.job4j.job4jtest.model;

import lombok.Data;

import java.util.List;
import java.util.Map;
@Data
public class Test {
    private int id;
    private Employee employee;
    private Map<Integer, List<String>> mapTests;
}
