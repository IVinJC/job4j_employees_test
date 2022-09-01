package ru.job4j.job4jtest.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@RequiredArgsConstructor
public class Test {
    private int id;
    private Employee employee;
    private Map<AnswerOptions, Questions> mapTests;
    private LocalDateTime dateTime;
    private Integer score;
    private PassTest wasPassed;
}
