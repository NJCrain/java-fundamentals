import java.util.HashSet;
import java.util.Set;

public class Theater implements Reviewable {
    public String name;
    public Set<String> movies;
    public double stars;
    public Set<Review> reviews = new HashSet<>();

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

    //Adds a review to the Theaters set
    public void addReview(Review toAdd) {
        reviews.add(toAdd);
        toAdd.location = this;
        double totalStars = 0;
        for (Review review : reviews) {
            totalStars += (double) review.stars;
        }
        stars = totalStars / (double) reviews.size();
    }

    //Returns the Theaters name
    public String getName() {
        return this.name;
    }
}
