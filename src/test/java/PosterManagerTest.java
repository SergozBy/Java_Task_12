import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager manager = new PosterManager();

    PosterFilm film1 = new PosterFilm(1, "Terminator", 115);
    PosterFilm film2 = new PosterFilm(2, "Robocop", 123);
    PosterFilm film3 = new PosterFilm(3, "Starwars", 136);
    PosterFilm film4 = new PosterFilm(4, "Lord of the Ring", 298);
    PosterFilm film5 = new PosterFilm(5, "Games of the trons", 432);
    PosterFilm film6 = new PosterFilm(6, "Alien", 105);
    PosterFilm film7 = new PosterFilm(7, "Predator", 99);

    @BeforeEach
    public void setup() {
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
        PosterFilm[] expected = {film1, film2, film3, film4, film5, film6, film7};
        PosterFilm[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilms() {
        PosterFilm[] expected = {film7, film6, film5, film4, film3};
        PosterFilm[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSixFilms() {
        PosterFilm[] expected = {film7, film6, film5, film4, film3, film2};
        PosterFilm[] actual = manager.findLast(6);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastForFilms() {
        PosterFilm[] expected = {film7, film6, film5, film4};
        PosterFilm[] actual = manager.findLast(4);

        Assertions.assertArrayEquals(expected, actual);
    }
}
