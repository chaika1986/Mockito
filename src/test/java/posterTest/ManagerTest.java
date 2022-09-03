package posterTest;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    Manager manager = new Manager();

    @Test
    public void emptyPosterTest() {

        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void onePosterTest() {

        manager.addFilm("film1");

        String[] expected = {"film1"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void severalPosterTest() {

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] expected = {
                "film1",
                "film2",
                "film3",
                "film4",
                "film5",
                "film6",
                "film7",
                "film8",
                "film9",
                "film10",
                "film11",
                "film12"
        };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void defaultFindLastPosterTest() {

        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] expected = {
                "film2",
                "film3",
                "film4",
                "film5",
                "film6",
                "film7",
                "film8",
                "film9",
                "film10",
                "film11",
                "film12"
        };
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastPosterEqualThanLimit() {
        Manager manager = new Manager(6);

        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] expected = {
                "film7",
                "film8",
                "film9",
                "film10",
                "film11",
                "film12"

        };
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsLessLimit() {
        Manager manager = new Manager(7);

        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] expected = {
                "film7",
                "film8",
                "film9",
                "film10",
                "film11",
                "film12"

        };
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastPosterMoreThanLimit() {
        Manager manager = new Manager();

        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] expected = {
                "film8",
                "film9",
                "film10",
                "film11",
                "film12"
        };
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}
