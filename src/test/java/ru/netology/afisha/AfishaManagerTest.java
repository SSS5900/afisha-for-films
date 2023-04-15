package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test
    public void testAddFilmOne() {
        AfishaManager kino = new AfishaManager();

        kino.add("film 1");

        String[] expected = {"film 1"};
        String[] actual = kino.findAllFilm();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void testAddFilMoreOne() {
        AfishaManager kino = new AfishaManager();

        kino.add("film 1");
        kino.add("film 2");
        kino.add("film 3");
        kino.add("film 4");
        kino.add("film 5");
        kino.add("film 6");
        kino.add("film 7");


        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5", "film 6", "film 7"};
        String[] actual = kino.findAllFilm();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddFilmZero() {
        AfishaManager kino = new AfishaManager();


        String[] expected = {};
        String[] actual = kino.findAllFilm();

        Assertions.assertArrayEquals(expected, actual);

    }




    @Test
    public void testLastFilm() {
        AfishaManager kino = new AfishaManager();

        kino.add("film 1");
        kino.add("film 2");
        kino.add("film 3");
        kino.add("film 4");
        kino.add("film 5");
        kino.add("film 6");
        kino.add("film 7");


        String[] expected = {"film 7", "film 6", "film 5", "film 4", "film 3"};
        String[] actual = kino.findLastFilm();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testLastFilmBelowLimit() {
        AfishaManager kino = new AfishaManager();

        kino.add("film 1");
        kino.add("film 2");
        kino.add("film 3");
        kino.add("film 4");



        String[] expected = {"film 4", "film 3", "film 2", "film 1"};
        String[] actual = kino.findLastFilm();

        Assertions.assertArrayEquals(expected, actual);

    }


}
