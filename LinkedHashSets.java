import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
 LinkedHashSet<Person> a = new LinkedHashSet<>();
 a.add(new Person("SRI VENKATA", 3, 18000, "Assoicate"));
 a.add(new Person("SAI MAHESH", 30, 25550, "TL"));
 a.add(new Person("PSVSAI", 345, 35000, "HR"));
 Iterator<Person> p = a.iterator();
  while (p.hasNext()){
    System.out.println(p.next());
    
  }
}
}