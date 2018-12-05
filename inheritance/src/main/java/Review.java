public class Review {
    public String body;
    public String author;
    public int stars;
    public Reviewable location;
    //TODO: Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing.
    //TODO: Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw!

    //Creates a review not associated to any restaurant
    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    //Creates a review along with all the associations between it and the restaurant it's for
    public Review(String body, String author, int stars, Reviewable location) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        location.addReview(this);
    }

    //Converts the review object into a readable string
    public String toString() {
        if(location != null) {
            return "Author: " + author + "\n" + "Restaurant: " + location.getName() + "\n" + "Stars: " + stars + "\n" + "Review: " + body;
        }
        else {
            return "Author: " + author + "\n" + "Stars: " + stars + "\n" + "Review: " + body;
        }
    }
}
