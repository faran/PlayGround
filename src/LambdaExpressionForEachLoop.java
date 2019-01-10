import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionForEachLoop {
    public static void main(String args[]){
        List<String> stringList = new ArrayList<>();

        stringList.add("Faran");
        stringList.add("Maisha");
        stringList.add("Rafael");
        stringList.add("Sundas");

        stringList.forEach(System.out::println);
    }
}
