import java.util.HashSet;
import java.util.Set;

public class Shop implements Reviewable {
    public String name;
    public String description;
    public String price;
    public double stars;
    public Set<Review> reviews = new HashSet<>();

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stars = 0;
    }

    public String toString() {
        return "Shop name: " + name + " | stars: " + stars + " | price: " + price + "\ndescription: " + description;
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
