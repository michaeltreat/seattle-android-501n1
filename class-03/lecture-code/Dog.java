class Dog {
  private int age;
  
  public Dog(int age){
    this.age = age * 7;
  }
  
  public void setAgeInHumanYears(int age){
    this.age = age * 7;
  }
  
  public int getAge(){
    return this.age;
  }
  
}