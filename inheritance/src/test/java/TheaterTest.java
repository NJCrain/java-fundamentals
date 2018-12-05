import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TheaterTest {
    Set<String> movies = new HashSet<>(Arrays.asList("Indiana Jones", "Star Wars: Episode IV", "Jurassic Park"));
    Theater test = new Theater("AMC", movies);

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
    }

}