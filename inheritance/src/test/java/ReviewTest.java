import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review test = new Review("This place was good", "Jimmy", 4);
    Restaurant testaurant = new Restaurant("Chili's", "$$$");

    @Test
    public void testConstructor() {
        assertNotNull("Should properly instantiate a review object", test);
        assertEquals("The review should have a body that matches what the constructor was given", "This place was good", test.body);
        assertEquals("The review should similarly contain the given author", "Jimmy", test.author);
        assertEquals("It should also contain the number of stars", 4, test.stars);
    }

    @Test
    public void testToString() {
        assertEquals("The review should be able to print a formatted string with no restaurant if it hasn't been assigned yet", "Author: Jimmy\nStars: 4\nReview: This place was good", test.toString());


        test.restaurant = testaurant;
        assertEquals("Should now print the name of the restaurant the review is for", "Author: Jimmy\nRestaurant: Chili's\nStars: 4\nReview: This place was good", test.toString());

    }

    @Test
    public void testOtherConstructor() {
        Review withRestaurant = new Review("This place was amazing!", "Jim", 5, testaurant);

        //Same assertions as testConstructor
        assertNotNull("Should properly instantiate a review object", withRestaurant);
        assertEquals("The review should have a body that matches what the constructor was given", "This place was amazing!", withRestaurant.body);
        assertEquals("The review should similarly contain the given author", "Jim", withRestaurant.author);
        assertEquals("It should also contain the number of stars", 5, withRestaurant.stars);

        //New Things that should happen
        assertEquals("Should also contain a reference to the restaurant it's for", testaurant, withRestaurant.restaurant);
        assertEquals("Calling to String should include the restuarants name", "Author: Jim\nRestaurant: Chili's\nStars: 5\nReview: This place was amazing!", withRestaurant.toString());
        assertEquals("Should cause the restaurants stars to change", 5.0, testaurant.stars, 0.0);
        assertEquals("Should cause the restaurants review count to change", 1, testaurant.reviews.size());

    }
}