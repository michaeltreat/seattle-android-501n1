# Class 3 - Intro To Java  

## Learning Objectives  
* Students should have a fundamental understanding of the basics of JAVA including:  
  * Classes  
  * The Object Type  
  * Interfaces  

## Lab Assignment  
* Create a new Java file called `ClassesAndInterfaces.java`.  
* Define your `ClassesAndInterfaces` class as public.  
* Implement the required `main(String[] args)` method as a `public` and `static` method.  
* Declare a Todo class that has a String property named `text`.  
* Give the Todo class a constructor that takes in the `text` for the corresponding `Todo`.  
* Define ObjectStore interface with the following methods:  
  * `add(Todo)`  
  * `remove(Todo)`  
  * `Todo objectAtIndex(int index)`  
  * `int numberOfObjects()`  
  * `Todo[] allTodos()`  
* Create a Store class that will implement the ObjectStore interface and implement required methods.  
  * This includes writing the logic for each method...  
  * To do this, Store will need to have an array of `Todo` objects as a property.  
* Create a `testStore()` method and demonstrate using all the methods from ObjectStore interface on the Store's `Todo` array.  

## Reading Assignment (read **before** Class 4):  
* [Singleton Pattern in Java](https://www.tutorialspoint.com/java/java_using_singleton.htm)  
* [Error Handling and Exceptions](https://www.tutorialspoint.com/java/java_exceptions.htm)  
* [Generics](https://www.tutorialspoint.com/java/java_generics.htm)  

## Submitting Your Assignment  
- Go to https://gist.github.com, and create a new Gist  
- In the "Gist description..." field, put your name  
- In the "Filename including extension..." field put 'ClassesAndInterfaces.java'.  
- Copy-paste your code from your `ClassesAndInterfaces.java` into the big input field for the Gist.  
- Select the button that says "Create secret gist"; copy that link for submission in the Canvas assignment.  
- Add a comment to your Canvas submission with answers to the prompted questions.  

## Other Resources  
* [Grading Rubrics](../../resources/)  
* *Insert link to slides* [Lecture Slides]()  
