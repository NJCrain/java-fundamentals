import java.util.HashSet;
import java.util.Set;

public class Location implements Reviewable {
    public String name;
    public double stars;
    public Set<Review> reviews = new HashSet<>();

    public void addReview(Review toAdd) {
        reviews.add(toAdd);
        toAdd.location = this;
        double totalStars = 0;
        for (Review review : reviews) {
            totalStars += (double) review.stars;
        }
        stars = totalStars / (double) reviews.size();
    }
}
