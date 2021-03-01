# Question 4C Response

This particular piece of code is undesirable because the method that accomplishes the function of writing a review has a different name in each subclass. This decreases reusability of each subclass, increases the difficulty in adding new subclasses, and necessitates writing extra lines of code in the main function. It would be more beneficial to consolidate the review process into one function `writeReview()`, which is first declared in the abstract User class, and overridden in each of the concrete subclasses to reflect the subclasses' unique processes. The benefits to this refactored design are not immediately noticeable in the User class and subclasses; however, in the new `main()`, the entire switch block has been replaced with a single line of code. Thus, readability and reusability are improved.

~~~~
public class MainDemo {
  public static void main(String[] args) {
    User user; // assume "User" is an abstract class
    ...
    // user is assigned to a concrete "User" type here
    ...
    user.writeReview(); 
  } 
}
