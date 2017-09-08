import java.util.*;

public class Database<T, String>{
  private ArrayList<T> objects;
  public String description;
  
  public Database(String description){
    this.objects = new ArrayList<T>();
    this.description = description;
  }
  
  public void addObject(T object){
    this.objects.add(object);
  }
  
  public T objectAtIndex(int index){
    return this.objects.get(index);
  }
  
}