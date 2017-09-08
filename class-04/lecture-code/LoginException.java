public class LoginException extends Exception{
  
  String description;
  
  public LoginException(String description){
    this.description = description;
  }
  
}