package com.demo;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {
    @Test
    void shouldOpen() {
        System.out.println("my new text 1");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse("15.12.2023", formatter);

       assertEquals(DayOfWeek.FRIDAY, localDate.getDayOfWeek());
        System.out.println("This is super test");
    }
}
