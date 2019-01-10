//No Arguments
interface Sayable{
    public String say();
}

public class LambdaExpressionNoParameter {

    public static void main(String args[]){

        Sayable s1 = () -> "Saying from Lambda";
        System.out.println(s1.say());
    }
}
