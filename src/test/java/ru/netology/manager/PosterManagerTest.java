package ru.netology.manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    void LimitN() {
        PosterManager cond = new PosterManager(2);

        Assertions.assertEquals(1, cond.getMaxLimit());
    }
}