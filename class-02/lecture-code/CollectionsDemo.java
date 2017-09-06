
import java.util.*;

public class CollectionsDemo {
  
  String appKey = "asdf0i23n0f2knf0";
  
  public static void main(String[] args) {
    
    // arrayTests();
    // listTests();
    setTests();
  }

  //STATIC METHODS  
  public static void arrayTests(){
    String[] myFam = {"Adam", "Amanda", "Mika"};
    
    int[] intArray = new int[10];
    
    for (String familyMember: myFam) {
      // System.out.println(familyMember);
    }
      
    Integer familySize = myFam.length;
    
    myFam[2] = "";
    
    System.out.println(myFam[2]);
    
  }
  
  public static void listTests(){
    
    List<String> names = new ArrayList<String>();
    
    names.add("Adam");
    names.add("Amanda");
    names.add("Mika");
    
    names.set(0, "Bob");
    
    System.out.println(names);
    
    String name = names.get(0);
    
    List<Integer> ages = new LinkedList(); 
    
    ages.add(31);
    ages.add(30);
    ages.add(5);
    
    Integer mikasAge = ages.get(0);
    
    List<String> moreNames = new LinkedList<String>();
    
    moreNames.add("Bob");
    moreNames.add("George");

    List<String> allNames = new ArrayList<String>(moreNames);

  }
  
  public static void setTests(){
    
    TreeSet<String> alphabet = new TreeSet<String>(); //Ordered
    // HashSet<String> alphabet = new HashSet<String>(); //Unordered
    
    alphabet.add("t");
    alphabet.add("a");
    alphabet.add("z");
    alphabet.add("a");
    alphabet.add("a");
    alphabet.add("a");
    alphabet.add("b");
    alphabet.add("a");
    alphabet.add("ZASD");
    alphabet.add("SDZA");
    alphabet.add("adam");
    alphabet.add("a");
    
    TreeSet<Double> numbers = new TreeSet<Double>(); //Ordered
    // HashSet<String> alphabet = new HashSet<String>(); //Unordered
    
    numbers.add(12.5);
    
    // alphabet.remove("adam");

    System.out.println(numbers.ceiling(12.5));
  }
  
}










