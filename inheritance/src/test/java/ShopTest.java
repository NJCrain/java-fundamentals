import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    Shop test = new Shop("Target", "A store with lots of stuff", "$$");
    Review rev = new Review("It was pretty cool", "Jimmy", 4);

    @Test
    public void testConstructor() {
        assertNotNull("The shop should actually contain things", test);
        assertEquals("Should have the name it was given", "Target", test.name);
        assertEquals("Same for the description", "A store with lots of stuff", test.description);
        assertEquals("And the price", "$$", test.price);
        assertEquals("Starts with 0 stars", 0, test.stars, 0.0);
        assertEquals("And an empty HashSet of reviews", 0, test.reviews.size());
    }

    @Test
    public void testToString() {
        assertEquals("Should give back a formatted string", "Shop name: Target | stars: 0.0 | price: $$\ndescription: A store with lots of stuff", test.toString());
    }

    @Test
    public void testAddReview() {
        test.addReview(rev);

        assertEquals("The restaurants stars should now be 4", 4, test.stars, 0.0);
        assertEquals("The HashSet for reviews should now have size of 1", 1, test.reviews.size());
        assertTrue("The HashSet should contain the review that was just added", test.reviews.contains(rev));
        assertEquals("The added review should now have an association with the restaurant it's for", test, rev.location);
        assertEquals("Calling to string on the restaurant should reflect the changes from adding the review", "Shop name: Target | stars: 4.0 | price: $$\ndescription: A store with lots of stuff", test.toString());
    }

    @Test
    public void testAddReviewDuplicate() {
        test.addReview(rev);
        test.addReview(rev);

        assertEquals("The restaurants stars be 4.5", 4, test.stars, 0.0);
        assertEquals("The HashSet for reviews should have size of 1", 1, test.reviews.size());
        assertEquals("Calling to string on the restaurant should match the expected behavior of adding test once", "Shop name: Target | stars: 4.0 | price: $$\ndescription: A store with lots of stuff", test.toString());
    }

    @Test
    public void testAddReviewMultiple() {
        Review second = new Review("Dumpster out back had better items", "Jim", 1, test);
        Review third = new Review("This place was ok!", "Bob", 3, test);
        Review fourth = new Review("Walmart is cheaper", "Nick", 2, test);
        Review fifth = new Review("Loved it!", "Hannah", 5, test);
        test.addReview(rev);
        test.addReview(second);
        test.addReview(third);
        test.addReview(fourth);
        test.addReview(fifth);

        assertEquals("The restaurants stars should now be 4.5", 3.0, test.stars, 0.0);
        assertEquals("The HashSet for reviews should now have size of 5", 5, test.reviews.size());

        assertTrue("The HashSet should contain the reviews that were just added", test.reviews.contains(rev));
        assertTrue("The HashSet should contain the reviews that were just added", test.reviews.contains(second));
        assertTrue("The HashSet should contain the reviews that were just added", test.reviews.contains(third));
        assertTrue("The HashSet should contain the reviews that were just added", test.reviews.contains(fourth));
        assertTrue("The HashSet should contain the reviews that were just added", test.reviews.contains(fifth));

        assertEquals("The added reviews should now have an association with the restaurant it's for", test, rev.location);
        assertEquals("The added reviews should now have an association with the restaurant it's for", test, second.location);
        assertEquals("The added reviews should now have an association with the restaurant it's for", test, third.location);
        assertEquals("The added reviews should now have an association with the restaurant it's for", test, fourth.location);
        assertEquals("The added reviews should now have an association with the restaurant it's for", test, fifth.location);

        assertEquals("Calling to string on the restaurant should reflect the changes from adding the reviews", "Shop name: Target | stars: 3.0 | price: $$\ndescription: A store with lots of stuff", test.toString());
    }
}