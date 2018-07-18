package sg.edu.rp.c346.simplemovielist;

/**
 * Created by 16046491 on 18/7/2018.
 */

public class MovieItem {

    private String movieName;
    private String releaseDate;
    private String movieRatings;

    public MovieItem(String movieName, String releaseDate, String movieRatings) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.movieRatings = movieRatings;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getMovieRatings() {
        return movieRatings;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setMovieRatings(String movieRatings) {
        this.movieRatings = movieRatings;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "movieName='" + movieName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", movieRatings='" + movieRatings + '\'' +
                '}';
    }
}
