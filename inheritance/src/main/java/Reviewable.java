public interface Reviewable {
    //Anything reviewable should be able to add more
    void addReview(Review toAdd);

    //The reviewable place should be able to give what its name is
    String getName();
}
