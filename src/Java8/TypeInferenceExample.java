package Java8;

public class TypeInferenceExample {

    public static void main(String[] args){
        printLabmbda(s -> s.length());

    }

    public static void printLabmbda(StringLengthLambdas s){
        System.out.println(s.getLength("Hello Labmda"));
    }

    interface StringLengthLambdas {
        int getLength(String s);
    }
}
