public class Review {
    public String body;
    public String author;
    public double stars;

    public Review(String body, String author, double stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String toString() {
        return "Author: " + author + "\n" + "Stars: " + stars + "\n" + "Review: " + body;
    }
    //TODO: Test your toString method.
    //TODO: Write a test to create an instance of Review and ensure that its toString is working properly.
}
