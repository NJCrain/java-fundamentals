import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TheaterTest {
    Set<String> movies = new HashSet<>(Arrays.asList("Indiana Jones", "Star Wars: Episode IV", "Jurassic Park"));
    Theater test = new Theater("AMC", movies);
    Review rev = new Review("Good popcorn", "Jimmy", 4);

    @Test
    public void testConstructor() {
        assertNotNull("Actually creates a valid object", test);
        assertEquals("Should have a set of movies with size 3", 3, test.movies.size());
        assertEquals("Should know its name", "AMC", test.name);
        assertEquals("Starts with 0 stars", 0, test.stars, 0.0);
    }

    @Test
    public void testAddMovie() {
        test.addMovie("Die Hard");

        assertEquals("Movie set should increase in size", 4, test.movies.size());
        assertTrue("Actually adds that movie", test.movies.contains("Die Hard"));
    }

    @Test
    public void testAddMovieDuplicate() {
        test.addMovie("Jurassic Park");

        assertEquals("Movie set should not increase in size", 3, test.movies.size());
    }

    @Test
    public void testRemoveMovie() {
        test.removeMovie("Jurassic Park");

        assertEquals("Movie set should be 1 less in size", 2, test.movies.size());
        assertFalse("Should remove the movie we told it to", test.movies.contains("Jurassic Park"));
    }

    @Test
    public void testToString() {
        assertEquals("Should return a formatted string of the object", "Theater name: AMC | stars: 0.0\nmovies: [Jurassic Park, Indiana Jones, Star Wars: Episode IV]", test.toString());
    }

    @Test
    public void testAddReview() {
        test.addReview(rev);

        assertEquals("The restaurants stars should now be 4", 4, test.stars, 0.0);
        assertEquals("The HashSet for reviews should now have size of 1", 1, test.reviews.size());
        assertTrue("The HashSet should contain the review that was just added", test.reviews.contains(rev));
        assertEquals("The added review should now have an association with the restaurant it's for", test, rev.location);
        assertEquals("Calling to string on the restaurant should reflect the changes from adding the review", "Theater name: AMC | stars: 4.0\nmovies: [Jurassic Park, Indiana Jones, Star Wars: Episode IV]", test.toString());
    }

    @Test
    public void testAddReviewDuplicate() {
        test.addReview(rev);
        test.addReview(rev);

        assertEquals("The locations stars should be 4", 4, test.stars, 0.0);
        assertEquals("The HashSet for reviews should have size of 1", 1, test.reviews.size());
        assertEquals("Calling to string on the movie should match the expected behavior of adding test once", "Theater name: AMC | stars: 4.0\nmovies: [Jurassic Park, Indiana Jones, Star Wars: Episode IV]", test.toString());
    }

    @Test
    public void testAddReviewMultiple() {
        Review second = new Review("Dumpster out back had better movies in it", "Jim", 1, test);
        Review third = new Review("This place was ok!", "Bob", 3, test);
        Review fourth = new Review("Twice the price of most theaters", "Nick", 2, test);
        Review fifth = new Review("Loved it!", "Hannah", 5, test);
        test.addReview(rev);
        test.addReview(second);
        test.addReview(third);
        test.addReview(fourth);
        test.addReview(fifth);

        assertEquals("The restaurants stars should now be 3", 3.0, test.stars, 0.0);
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

        assertEquals("Calling to string on the restaurant should reflect the changes from adding the reviews", "Theater name: AMC | stars: 3.0\nmovies: [Jurassic Park, Indiana Jones, Star Wars: Episode IV]", test.toString());
    }

}