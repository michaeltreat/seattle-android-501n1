public class ClassAndInterfaceDemo {
  
  public static void main(String[] args) {
    
    
    Person adam = new Person("Adam", 31);
    
    String adamAsString = adam.toString();
    
    System.out.println(adamAsString);

    adam.greeting();
    
    Employee mike = new Employee("Mike", 25, 10);
    mike.greeting();
    
    Dog mika = new Dog(5);

    // mika.setAgeInHumanYears(5);
    
    System.out.println(mika.getAge());
    
    // Person me = new Person();
    // me.name = "Adam";
    // 
    // System.out.println(me.name);
    // 
    // Person otherAdam = me;
    // 
    // otherAdam.name = "Atom";
    // 
    // System.out.println(me);
    // System.out.println(otherAdam);
    // 
    // Integer numberOne = 10;
    // Integer numberTwo = numberOne;
    // 
    // numberTwo = 1000;
    // 
    // System.out.println(numberOne);
    // 
    // String firstThing = "Thing 1";
    // String secondThing = firstThing;
    // secondThing = "Thing 2";
    // 
    // System.out.println(firstThing);
    // 
    
    Manager brook = new Manager("Brook", 107);
    Employee duncan = new Employee("Duncan", 31, 20);
    
    brook.fireEmployee(duncan);
    
    Employee newDuncan = brook.hireNewPerson(duncan);
    System.out.println("welcome back! " + newDuncan.name);
    
    
    Ceo appleCEO = new Ceo();
    appleCEO.name = "Tim Cook";
    
    Ceo.CodeFellowsCEO.name = "Jeff";
  }
  
}



















