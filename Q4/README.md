# ENSE 370 Winter 2020 Midterm Exam - Question 4

**PROMPT:** Consider a software system where you (and other users) are subscribed to a particular YouTube channel and you want to be informed when a new video is available. However, there are many genres of YouTube videos available (e.g. Product Review Videos, How-To Videos, etc.) and due to the resource limitation, the software system can only allow one channel of each genre to be available for users to subscribe. Users are also divided into categories (e.g. children, teenagers, adults, etc.). There can be an unlimited number of users in any user category.

PART A: Design a software system which meets the above requirements. State what Design Pattern(s) you have used and draw the Class diagram. Include all attributes or methods that are essential to the Design Pattern(s) you have used. Any other attributes or methods are optional.

PART B: Draw the sequence diagram of your design.

PART C: Assume that each class of users has its own way of providing reviews on the videos that were posted, and that the `main()` program is implemented in the following way:
~~~~
public class MainDemo {
  public static void main(String[] args) {
    User user; // assume "User" is an abstract class
    ...
    // user is assigned to a concrete "User" type here
    ...
    switch (user.getUserType()) {
      case Child: ((Child) user).childReview(); break;
      case Teenager: ((Teenager) user).teenagerReview(); break;
      case Adult: ((Adult) user).adultReview(); break;
    }
~~~~

You may assume that `User` is an abstract class and the other three classes `Child`, `Teenager` and `Adult` are derived classes from the `User` class. The `User` class has a method `getUserType()` which returns what concrete derived class it is, and the methods `childReview()`, `teenagerReview()` etc. are the methods for providing review in the `Child` class, `Teenager` class, etc., respectively.

Explain what is undesirable about this code and refactor it to make it better. State any assumptions you made.
