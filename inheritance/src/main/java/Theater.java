import java.util.HashSet;
import java.util.Set;

public class Theater implements Reviewable {
    public String name;
    public Set<String> movies;
    public double stars;
    public Set<Review> reviews = new HashSet<>();

    public Theater(String name, Set<String> movies) {
        this.name = name;
        this.movies = movies;
        this.stars = 0;
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        this.movies.remove(movie);
    }

    public String toString() {
        return "Theater name: " + name + " | stars: " + stars + "\nmovies: " + movies.toString();
    }

    public void addReview(Review toAdd) {
        reviews.add(toAdd);
        toAdd.location = this;
        double totalStars = 0;
        for (Review review : reviews) {
            totalStars += (double) review.stars;
        }
        stars = totalStars / (double) reviews.size();
    }

    public String getName() {
        return this.name;
    }
}
