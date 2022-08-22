package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test
    public void ShouldAddMovie() {
        Poster poster = new Poster();

        poster.addMovie("Movie 1");
        poster.addMovie("Movie 2");
        poster.addMovie("Movie 3");
        poster.addMovie("Movie 4");
        poster.addMovie("Movie 5");
        poster.addMovie("Movie 6");
        poster.addMovie("Movie 7");

        String[] actual = poster.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldPrintPosterInDefaultLimit() {
        Poster poster = new Poster();

        poster.addMovie("Movie 1");
        poster.addMovie("Movie 2");
        poster.addMovie("Movie 3");
        poster.addMovie("Movie 4");
        poster.addMovie("Movie 5");
        poster.addMovie("Movie 6");
        poster.addMovie("Movie 7");
        poster.addMovie("Movie 8");
        poster.addMovie("Movie 9");
        poster.addMovie("Movie 10");


        String[] actual = poster.findLast();
        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldPrintPosterAboveDefaultLimit() {
        Poster poster = new Poster();

        poster.addMovie("Movie 1");
        poster.addMovie("Movie 2");
        poster.addMovie("Movie 3");
        poster.addMovie("Movie 4");
        poster.addMovie("Movie 5");
        poster.addMovie("Movie 6");
        poster.addMovie("Movie 7");
        poster.addMovie("Movie 8");
        poster.addMovie("Movie 9");
        poster.addMovie("Movie 10");
        poster.addMovie("Movie 11");


        String[] actual = poster.findLast();
        String[] expected = {"Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldPrintPosterBellowDefaultLimit() {
        Poster poster = new Poster();

        poster.addMovie("Movie 1");
        poster.addMovie("Movie 2");
        poster.addMovie("Movie 3");
        poster.addMovie("Movie 4");
        poster.addMovie("Movie 5");
        poster.addMovie("Movie 6");
        poster.addMovie("Movie 7");
        poster.addMovie("Movie 8");
        poster.addMovie("Movie 9");

        String[] actual = poster.findLast();
        String[] expected = {"Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldPrintPosterInNewtLimit() {
        Poster poster = new Poster(7);

        String[] expected = {};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
