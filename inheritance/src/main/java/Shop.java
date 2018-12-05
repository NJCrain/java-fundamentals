public class Shop implements Reviewable {
    public String name;
    public String description;
    public String price;

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return "Shop name: " + name + " | price: " + price + "\ndescription: " + description;
    }
    //TODO: Add tests for the basics of your Shop class.

    public void addReview(Review toAdd) {

    }
}
