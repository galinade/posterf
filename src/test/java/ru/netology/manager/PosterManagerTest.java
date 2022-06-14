package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
    Poster mov1 = (new Poster(1, "Бладшот"));
    Poster mov2 = (new Poster(2, "Вперёд"));
    Poster mov3 = (new Poster(3, "Отель Белград"));
    Poster mov4 = (new Poster(4, "Джентльмены"));
    Poster mov5 = (new Poster(5, "Человек-невидимка"));
    Poster mov6 = (new Poster(6, "Тролли"));
    Poster mov7 = (new Poster(7, "Номер один"));
    Poster mov8 = (new Poster(8, "Восемь"));
    Poster mov9 = (new Poster(9, "Девять"));
    Poster mov10 = (new Poster(10, "Десять"));
    Poster mov11 = (new Poster(11, "Одиннадцать"));

    @Test
    void saveTest() {
        PosterManager manager = new PosterManager();
        manager.save(mov1);
        manager.save(mov2);
        manager.save(mov3);
        manager.save(mov4);
        // manager.save(mov5);
        //manager.save(mov6);
        //manager.save(mov7);
        // manager.save(mov8);
        // manager.save(mov9);
        //manager.save(mov10);
        //manager.save(mov11);

        Poster[] actual = manager.findAll();
        Poster[] expected = {mov1, mov2, mov3, mov4};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void findLastLimit() {

        PosterManager cond = new PosterManager(5);
        PosterManager manager = new PosterManager();
        manager.save(mov1);
        manager.save(mov2);
        manager.save(mov3);
        manager.save(mov4);
        manager.save(mov5);
        Poster[] actual = manager.findLast();
        Poster[] expected = {mov5, mov4, mov3, mov2, mov1};
        Assertions.assertArrayEquals(expected, actual);

    }
}
