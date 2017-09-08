public class ExceptionsAndGenerics{
  public static void main(String[] args) {
    
    User newUser = new User("awallraff");
    
    try {
      newUser.login();
      //do some other stuff...
      newUser.login();
      
    }catch(LoginException loginException){
      System.out.println(loginException + ": " + loginException.description);
    } catch(Exception exception){
      System.out.println(exception);
    }
    
    System.out.println("Application is finished.");
    
    Database<String, Integer> stringDatabase = new Database<String, Integer>(100);
    
    Database<User, String> userDatabase = new Database<User, String>("All The Users!");
    
    Database<Integer, User> integerDatabase = new Database<Integer, User>(newUser);
    
    stringDatabase.addObject("Apples");
    Integer stringDatabaseDescription = stringDatabase.description;
    
    printSomeType("Hello class.");
    printSomeType(123.123);
    
    overloadedMethod("Overloaded!!!");
    overloadedMethod(123);
  }
  
  public static <A> void printSomeType(A someType){
    System.out.println(someType);
  }
  
  public static void overloadedMethod(String a){
    System.out.println(a);
  }
  
  public static void overloadedMethod(Integer a){
    Integer computedValue = a * 10;
    System.out.println(computedValue);
  }
}






















