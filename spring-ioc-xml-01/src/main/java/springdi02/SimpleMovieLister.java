package springdi02;

public class SimpleMovieLister {

    private Movie_Finder movieFinder;

    private String movieName;

    public void setMovieFinder(Movie_Finder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }


}
