public class PosterManager {
    //Creation of list of films
    private PosterFilm[] films = new PosterFilm[0];

    // Adding new film to the list of films
    public void add(PosterFilm film) {
        PosterFilm[] tmp = new PosterFilm[films.length + 1];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length] = film;
        films = tmp;
    }

    // Return all films in order from old to new
    public PosterFilm[] findAll() {
        return films;
    }

    // Return only 5 last added films by default. From new to old
    public PosterFilm[] findLast() {
        int countFilms = 5;
        int countIterations = countFilms;
        PosterFilm[] tmp = new PosterFilm[countFilms];
        for (int i = 0; i < countIterations; i++) {
            tmp[i] = films[films.length - 1 - i];
            countFilms--;
        }
        films = tmp;
        return films;
    }


    // Return some last added films by request. From new to old
    public PosterFilm[] findLast(int countFilms) {
        int countIterations = countFilms;
        PosterFilm[] tmp = new PosterFilm[countFilms];
        for (int i = 0; i < countIterations; i++) {
            tmp[i] = films[films.length - 1 - i];
            countFilms--;
        }
        films = tmp;
        return films;
    }
}