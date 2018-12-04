import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review test = new Review("This place was good", "Jimmy", 4.5);

    @Test
    public void testConstructor() {
        assertNotNull("Should properly instantiate a review object", test);
        assertEquals("The review should have a body that matches what the constructor was given", "This place was good", test.body);
        assertEquals("The review should similarly contain the given author", "Jimmy", test.author);
        assertEquals("It should also contain the number of stars", 4.5, test.stars, 0.0);
    }

    @Test
    public void testToString() {
        assertEquals("The review should be able to print a formatted string with no restuarant if it hasn't been assigned yet", "Author: Jimmy\nStars: 4.5\nReview: This place was good", test.toString());

        Restaurant testaurant = new Restaurant("Chili's", "$$$");
        test.restaurant = testaurant;
        assertEquals("Should now print the name of the restuarant the review is for", "Author: Jimmy\nRestaurant: Chili's\nStars: 4.5\nReview: This place was good", test.toString());

    }
}