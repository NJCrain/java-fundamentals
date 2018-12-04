import java.util.HashSet;
import java.util.Set;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Restaurant {
    public String name;
    public double stars;
    public String price;
    public Set<Review> reviews = new HashSet<>();

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
        this.stars = 0;
    }

    public String toString() {
        return "Restaurant: " + name + " | Price: "  + price + " | Rating: " + stars + " | Reviews: " + reviews.size();
    }

    public void addReview(Review toAdd) {
        reviews.add(toAdd);
        toAdd.restaurant = this;
        double totalStars = 0;
        for (Review review : reviews) {
            totalStars += (double) review.stars;
        }
        stars = totalStars / (double) reviews.size();
    }
}
