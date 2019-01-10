package Java8;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();

        Greeting lambdaGreeting = () -> System.out.println("Hello world from lambda");


        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner class greeting");
            }
        };

        greeter.greet(() -> System.out.println("Hello world from lambda"));

    }
}
