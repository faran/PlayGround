import java.util.*;
/**
 * Java 7 implementation
 * */
public class NewPerson {

    public static void main (String[] args){

        List<Person> people = Arrays.asList(
                new Person("Faran", "Ahmed", 40),
                new Person("Maisha", "Ahmed", 7),
                new Person("Sundas", "Khan", 30),
                new Person("Rafael", "Ahmed" , 0)
                );


        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });


        System.out.println("Last name Starts with A: ");
        printFilter(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("A");
            }
        });

        System.out.println("First name starts with F: ");
        printFilter(people, new Condition(){
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("F");
            }
        });
    }

    private static void printFilter(List<Person> people, Condition condition) {

        for (Person person : people){
            if (condition.test(person)){
                System.out.println(person);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for(Person peopleList: people){
            System.out.println(peopleList.getFirstName());
        }
    }
}


interface Condition{
    boolean test(Person p);
}