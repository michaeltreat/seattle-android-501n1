class Employee extends Person {
  
  public int sickDays;
  
  public Employee(String name, int age, int sickDays){
    super(name, age);
    
    this.sickDays = sickDays;
  }
  
  public void greeting(){
    super.greeting();
    System.out.println("I have " + this.sickDays + " left at work...");
  }
  
}