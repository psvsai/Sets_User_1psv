import java.util.HashSet;


public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[] args) {
   HashSet<Person> i = new HashSet<>();
   i.add(new Person("PSVSAI", 3, 15000, "Associate"));
   i.add(new Person("MAHESH", 34, 25000, "TL"));
   i.add(new Person("SAI MAHESH", 25, 35000, "B3"));
    for(Person person:i){
        System.out.println(person);
    }
}
}
