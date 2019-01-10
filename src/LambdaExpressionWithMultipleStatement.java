//multiple statements in lambda
interface Sayable2{
    String say(String message);
}

public class LambdaExpressionWithMultipleStatement {
    public static void main(String args[]){

        Sayable2 sayable2 = (message) -> {
            String str1 = "This is example of ";
            return str1 + message;
        };
        System.out.println(sayable2.say("Multiple statement in Lambda func "));
    }
}
