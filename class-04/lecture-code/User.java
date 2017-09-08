public class User {
  
  boolean isLoggedIn = false;
  String username;
  
  public User(String username){
    this.username = username;
  }
  
  public void login() throws Exception {
    if (this.isLoggedIn) {
      throw new LoginException(this.username + " is ALREADY logged in");
    } 
    
    try {  
      this.validateCredentials();
    } catch (Exception e) {
      throw e;
    }
      
    this.isLoggedIn = true;
    System.out.println(this.username + " is now logged in.");
    
  }
  
  public void validateCredentials() throws Exception {
    throw new Exception("Invalid Credentials");
  }
  
  
  
}



