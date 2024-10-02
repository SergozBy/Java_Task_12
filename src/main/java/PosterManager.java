public class PosterManager {
    /** Creation of list of films
     *
     */
    private PosterFilm[] films = new PosterFilm[0];

    private int maxFilms;

    public PosterManager() {
        this(5);
    }

    public PosterManager(int maxFilms) {
        this.maxFilms = maxFilms;
    }

    /** Adding new film to the list of films
     *
     */
    public void add(PosterFilm film) {
        PosterFilm[] tmp = new PosterFilm[films.length + 1];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length] = film;
        films = tmp;
    }

    /**
     * Return all films in order from old to new
     */
    public PosterFilm[] findAll() {
        return films;
    }

    /**
     * Return some last added films by request. From new to old
     */
    public PosterFilm[] findLast() {
        int resultLength;
        if (maxFilms > films.length) {
            resultLength = films.length;
        } else {
            resultLength = maxFilms;
        }
        PosterFilm[] tmp = new PosterFilm[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        films = tmp;
        return films;
    }
}