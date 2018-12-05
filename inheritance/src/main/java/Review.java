public class Review {
    public String body;
    public String author;
    public int stars;
    public Restaurant restaurant;
    //TODO: Make it so a review can be about a shop or restaurant
    // Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing.
    // Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw!

    //Creates a review not associated to any restaurant
    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    //Creates a review along with all the associations between it and the restaurant it's for
    public Review(String body, String author, int stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        restaurant.addReview(this);
    }

    //Converts the review object into a readable string
    public String toString() {
        if(restaurant != null) {
            return "Author: " + author + "\n" + "Restaurant: " + restaurant.name + "\n" + "Stars: " + stars + "\n" + "Review: " + body;
        }
        else {
            return "Author: " + author + "\n" + "Stars: " + stars + "\n" + "Review: " + body;
        }
    }
}
