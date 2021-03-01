# ENSE 370 Winter 2020 Midterm Exam - Question 2

**PROMPT:** Consider a tour planning company that sells different types of vacation packages:
1. No frills - a package that provides only hotel stay arrangements, no meals nor transport will be provided.
2. Basic - a package that provides hotel arrangements and meal arrangements, but no transport.
3. Deluxe - a package that provides hotel, meal and transport arrangement.

PART A: Design a system that can easily allow any of the above vacation packages to be created and added to the system. State the design pattern (if any) that you use. Draw the Class diagram. There should be a method `displayCost()` in all your classes that displays the cost of the selected package (there is no need to write the code for this method).

PART B: Assume that all the classes in your diagram in Q2(a) above had been implemented. Write the Java code for the `main()` method to create one instance of the Basic package and one instance of the Deluxe package. Make each instance display its cost. You may give your public class any name that you like.

**Instructions for Compilation**

`javac AbstractVacationPackage.java BasicDecorator.java Decorator.java DeluxeDecorator.java Main.java NoFrillsDecorator.java VacationPackage.java`

`java Main`
