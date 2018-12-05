import java.util.Set;

public class Theater extends Location{
    public Set<String> movies;

    //Create a new Theater instance
    public Theater(String name, Set<String> movies) {
        this.name = name;
        this.movies = movies;
        this.stars = 0;
    }

    //Adds a specified movie to the set
    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    //Removes the specified movie from the set
    public void removeMovie(String movie) {
        this.movies.remove(movie);
    }

    //Returns a formatted string representing the Theater object
    public String toString() {
        return "Theater name: " + name + " | stars: " + stars + "\nmovies: " + movies.toString();
    }
}
