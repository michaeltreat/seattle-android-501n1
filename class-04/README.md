# Class 4 - Intro To Java  

## Learning Objectives  
* Students should have a fundamental understanding of the basics of JAVA including:  
  * Exceptions
  * Generics  
  * Inheritance  
  * Class Structure

## Lab Assignment  
* Create a new Java file called `ErrorsAndGenerics.java`.
* Define your `ErrorsAndGenerics` class as public.
* Implement the required `main(String[] args)` method as a `public` and `static` method.
* Define an `Exception` called `UserException` that `extends Exception`. Your `UserException` should have at least a `description` property that is properly initialized in the `UserException` constructor.
* Create a `Person` class with properties for `name` and `age`. Make sure to implement a `Person` constructor to allow creating new instances with each of their properties assigned by the end of initialization. 
* Create a new class called `User` that extends `Person` with properties for `email` and `username`. Make sure to implement a `User` constructor to allow creating new user's with each of their properties assigned by the end of initialization.  
* Add at least 2 methods to `User` that throw a `UserException`. Be Creative, some ideas include:  
 * `login() throws`  
 * `logout() throws`  
 * `signup() throws`  
* In the `ErrorsAndGenerics` class, within the `main` method, demonstrate creating 3 different users.  
* Demonstrate calling your `User` methods that `throw`.  

### Stretch Goals
* Create an interface called `Database` that requires the following methods: 
 * `add(User:)`
 * `remove(User:)`
 * `ArrayList<User> all()`
 * `int Count()`
* Implement a `UserDatabase` class that is a true singleton and has a `private` `ArrayList` of `Users`. The `UserDatabase` should also `implemnent` `Database` and it's required methods.

## Reading Assignment (read **before** Class 5):  
* [Intro to Android Studio](https://www.raywenderlich.com/154676/android-studio-tutorial-introduction)  

> This is a great overview to skim through to get a feel for Android Studio. There are a few things that may be just slightly outdated, but the general concepts are the same. The primary goal of this reading is to get you playing with Android Studio as an IDE. Please try and take some time to mess with things and get a decent feel for navigating around. This will be the focus of class 5 where we will discuss and cover the Android Studio IDE.

## Submitting Your Assignment  
- Create a new repository on GitHub for your project directory above called `Practicing Java`.  
- Add the remote and push up your code to `GitHub`.
- Copy the link to your new repo as your submission URL on canvas.  

## Other Resources  
* [Grading Rubrics](../../resources/)  
* *Insert link to slides* [Lecture Slides]()  
