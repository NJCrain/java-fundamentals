public class Review {
    public String body;
    public String author;
    public double stars;
    public Restaurant restaurant;

    public Review(String body, String author, double stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(String body, String author, double stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        restaurant.addReview(this);
    }

    public String toString() {
        if(restaurant != null) {
            return "Author: " + author + "\n" + "Restaurant: " + restaurant.name + "\n" + "Stars: " + stars + "\n" + "Review: " + body;
        }
        else {
            return "Author: " + author + "\n" + "Stars: " + stars + "\n" + "Review: " + body;
        }
    }
}
