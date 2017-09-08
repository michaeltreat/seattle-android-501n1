public class Manager extends Employee implements Boss {
  
  public Manager(String name, int age){
    super(name, age, 365);
  }
  
  public Employee hireNewPerson(Person person){
    return new Employee(person.name, person.age, 5);
  }
  
  public void fireEmployee(Employee employee){
    System.out.println(employee.name + ", Your Fired! Get your sh@t.");
  }
  
}