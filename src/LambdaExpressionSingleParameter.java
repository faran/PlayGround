//single , double parameter
//with or without return
interface Sayable1{
    public String say(String name, String surName);
}

public class LambdaExpressionSingleParameter {
    public static void main (String args[]){

        Sayable1 sayable1 = (name, surName) -> "My name is " + name + " " + surName;
        System.out.println(sayable1.say("Faran", "Khan"));
    }
}
