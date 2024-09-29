public class PosterFilm {
    private int id;
    private String filmName;
    private int filmLength;

    public PosterFilm (int id, String filmName, int filmLength) {
        this.id = id;
        this.filmName = filmName;
        this.filmLength = filmLength;
    }

    public int getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
    }

    public int getFilmLength() {
        return filmLength;
    }
}
