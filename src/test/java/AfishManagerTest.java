import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishManagerTest {

    @Test
    public void test() {
        AfishaManager afisha = new AfishaManager();
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");

        String[] actual = afisha.findAll();
        String[] expected = {"film1", "film2", "film3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        AfishaManager afisha = new AfishaManager();
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");
        afisha.addFilm("film7");
        afisha.addFilm("film8");
        afisha.addFilm("film9");
        afisha.addFilm("film10");
        afisha.addFilm("film11");

        String[] actual = afisha.findLast();
        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        AfishaManager afisha = new AfishaManager(7);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");
        afisha.addFilm("film7");
        afisha.addFilm("film8");
        afisha.addFilm("film9");
        afisha.addFilm("film10");
        afisha.addFilm("film11");

        String[] actual = afisha.findLast();
        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        AfishaManager afisha = new AfishaManager(7);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");

        String[] actual = afisha.findLast();
        String[] expected = {"film6", "film5", "film4", "film3", "film2", "film1"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
