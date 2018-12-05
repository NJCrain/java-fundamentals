public class Review {
    public String body;
    public String author;
    public int stars;
    public Location location;
    public String movie;

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

    //Creates a review with associations to the Theater it is for and the specifc movie
    public Review(String body, String author, int stars, Theater location, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie = movie;
        location.addReview(this);
    }

    //Converts the review object into a readable string
    public String toString() {
        if(location != null) {
            if(movie != null) {
                return "Author: " + author + "\nMovie: " + movie + "\nTheater: " + location.name + "\nStars: " + stars + "\nReview: " + body;
            } else {
                return "Author: " + author + "\nLocation: " + location.name + "\nStars: " + stars + "\nReview: " + body;
            }
        }
        else {
            return "Author: " + author + "\nStars: " + stars + "\nReview: " + body;
        }
    }
}
