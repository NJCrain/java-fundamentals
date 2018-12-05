
public class Shop extends Location {
    public String description;
    public String price;

    //Create a new Shop instance
    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stars = 0;
    }

    //Returns a formatted string representing the shop object
    public String toString() {
        return "Shop name: " + name + " | stars: " + stars + " | price: " + price + "\ndescription: " + description;
    }
}
