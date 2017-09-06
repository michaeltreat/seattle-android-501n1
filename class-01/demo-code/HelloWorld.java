public class HelloWorld {
  
  String text;
  
  public static void main(String[] args) {
    log("Hello Android Class!");
    
    String testOne, testTwo;
    
    testOne = "some";
    testTwo = "other";
    
    String test = "Test";
    String firstName = "Adam";
    String lastName = "Wallraff";
    
    Integer age = 31;
    
    // log("Name: " + firstName + " " + lastName + " - Age:" + age);
    // 
    // firstName = "31";
    // 
    // log("Name: " + firstName + " " + lastName + " - Age:" + age);

    String fullName = firstName + " " + lastName; // "Adam Wallraff"
    
    String something;

    // if (fullName.contains("Adam")) {
    //   log("Your name is Adam.");
    // } else if(fullName == "Adam Wallraff") {
    //   log("Hello Adam Wallraff...");
    // } else {
    //   log("I dont know you...");
    // }
    
    fullName = "Bob Wallraf";

  //   switch (fullName) {
  //     case "Adam":
  //       log("Hello Adam");
  //       break;
  //     case "Adam Wallraff":
  //       log("Hello Adam Wallraff!");
  //       break;
  //     default:
  //       log("I dont know you.");
  //   }
  // 
    switch (age) {
      case 31:
        log("This is Adam's age");
        break;
      case 18:
        log("This person...can buy cigs.");
      case 21:
        log("This is technically an Adult.");
    }
    
    firstName = "Bob";
    
    String favoriteProgrammingLanguage = firstName == "Adam" ? "Java" : "JavaScript";
    
    // String favoriteProgrammingLanguage;
    // 
    // if (firstName == "Adam") {
    //   favoriteProgrammingLanguage = "Java";
    // } else {
    //   favoriteProgrammingLanguage = "JavaScript";
    // }
    log(favoriteProgrammingLanguage);
    
    
    
    
    
    
    Integer numberOfStudent = 4;
    
    // for (int i = 0; i < numberOfStudent; i++) {
    //   log(i);
    // }
    
    String[] teachers = {"Adam", "Nick", "Duncan"};
    
    
    for (String teacher : teachers) {
      log(teacher + " is a teacher at CF.");
    }
    
    Boolean keepLooping = true;
    
    // Integer count = 0;
    // 
    // while(count < 10){
    //     log("lulz: " + count);
    //     
    //     count++;
    // }
    
    Integer count = 10;
    
    do {
        log("lulz: " + count);
        count++;
    } while(count < 0);
    
    
    
    String somethingToReverse = "Hello Everybody!";
    
    Integer index = somethingToReverse.length();
    
    String reversed = "";
    
    while(index > 0){
      index--;
      reversed += somethingToReverse.charAt(index);
    }
    
    log(reversed);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
  
  
  
  
  
  
  
  public static void log(Object object){
    System.out.println(object);
  }

}
























