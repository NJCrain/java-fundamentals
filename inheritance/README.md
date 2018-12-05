# Inheritance Lab
This library includes a Reviewable interface, various classes that implement it, and a Review class. A Reviewable will keep track of which reviews are for itself as well as each review holds a pointer to the Reviewable it is for. Reviews can be added upon instantiation or later on using the Reviewable's addReview method.

# Testing
All test for this library can be run in the terminal by running `./gradlew test`.