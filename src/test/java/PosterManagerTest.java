import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterFilm film1 = new PosterFilm(1, "Terminator", 115);
    PosterFilm film2 = new PosterFilm(2, "Robocop", 123);
    PosterFilm film3 = new PosterFilm(3, "Starwars", 136);
    PosterFilm film4 = new PosterFilm(4, "Lord of the Ring", 298);
    PosterFilm film5 = new PosterFilm(5, "Games of the trons", 432);
    PosterFilm film6 = new PosterFilm(6, "Alien", 105);
    PosterFilm film7 = new PosterFilm(7, "Predator", 99);

    public void setup(PosterManager manager) {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
    }

    @Test
    public void shouldFindAllFilms() {
        PosterManager manager = new PosterManager();
        setup(manager);

        PosterFilm[] expected = {film1, film2, film3, film4, film5, film6, film7};
        PosterFilm[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilms() {
        PosterManager manager = new PosterManager();
        setup(manager);

        PosterFilm[] expected = {film7, film6, film5, film4, film3};
        PosterFilm[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSixFilms() {
        PosterManager manager = new PosterManager(6);
        setup(manager);

        PosterFilm[] expected = {film7, film6, film5, film4, film3, film2};
        PosterFilm[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastForFilms() {
        PosterManager manager = new PosterManager(4);
        setup(manager);

        PosterFilm[] expected = {film7, film6, film5, film4};
        PosterFilm[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTwoFilms() {
        PosterManager manager = new PosterManager();
        manager.add(film1);
        manager.add(film2);

        PosterFilm[] expected = {film2, film1};
        PosterFilm[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Test PosterFilm for Jacoco statistic
    @Test
    public void shouldFindId() {
        PosterFilm film = new PosterFilm(4, "Matrix", 64);

        int expected = film.getId();
        int actual = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindName() {
        PosterFilm film = new PosterFilm(4, "Matrix", 64);

        String expected = film.getFilmName();
        String actual = "Matrix";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLength() {
        PosterFilm film = new PosterFilm(4, "Matrix", 64);

        int expected = film.getFilmLength();
        int actual = 64;

        Assertions.assertEquals(expected, actual);
    }
}
