import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Java 8 implementation
 */

public class NewPersonJava8 {

    public static void main (String[] args){

        List<Person> people = Arrays.asList(
                new Person("Faran", "Ahmed", 40),
                new Person("Maisha", "Ahmed", 7),
                new Person("Sundas", "Khan", 30),
                new Person("Rafael", "Ahmed" , 0)
        );


        Collections.sort(people, (p1, p2) ->  p1.getLastName().compareTo(p2.getLastName()));

        printFilter(people, p -> true, p -> System.out.println(p));


        System.out.println("Last name Starts with K: ");
        printFilter(people, p -> p.getLastName().startsWith("K"), p -> System.out.println(p.getLastName()));

        System.out.println("First name starts with R: ");
        printFilter(people, p -> p.getFirstName().startsWith("R"), p -> System.out.println(p.getFirstName()));
    }

    //private static void printFilter(List<Person> people, Condition condition) {
    private static void printFilter(List<Person> people, Predicate<Person> personPredicate, Consumer<Person> personConsumer) {

        for (Person person : people){
            if (personPredicate.test(person)){
                personConsumer.accept(person);
            }
        }
    }
}
