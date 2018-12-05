# Inheritance Lab
This library includes a Reviewable interface, a Location superclass that implements it, various subclasses of Location, and a Review class. A Location will keep track of which reviews are for itself as well as each review holds a pointer to the Location it is for. Reviews can be added upon instantiation or later on using the Location's addReview method.

# Testing
All test for this library can be run in the terminal by running `./gradlew test`.