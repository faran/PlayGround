//Example 1
//without lambda
//        Drawable drawable = new Drawable() {
//
//public void draw() {
//        System.out.println("Drawing " + width);
//        }
//        };


interface Drawable{
    void draw();
}

public class LambdaExpressionExample {

    public static void main (String[] args){
        int width = 10;

        //With lambda

        Drawable drawable = () -> {
            System.out.println("Drawbale " + width);
        };
        drawable.draw();
    }
}
