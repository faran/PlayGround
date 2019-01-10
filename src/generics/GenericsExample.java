package generics;

import org.testng.annotations.Test;

import java.util.*;

public class GenericsExample {

    //@Test
    public void betterForCasting(){
        List<String> list = new ArrayList<>();

        list.add("a string");
        list.add("another string");
    }

    //@Test
    public void boxestest(){
        List<Box> boxes = new ArrayList<>();
        Box<String> box = new Box<>();
        box.setObj("a string");

        Box<Integer> box1 = new Box<>();
        box1.setObj(99);

        boxes.add(box);
        boxes.add(box1);

        System.out.println(box.getObj());
        System.out.println(box1.getObj());

        box.inspect(123);
    }

    //@Test
    public void UsingPairs(){

        Pair<String, String> p1 = new OrderedPair<>("aKey", "aValue");
        Pair<Integer, String> p2 = new OrderedPair<>(123, "asdf");

    }

    @Test
    public void showSumNumbers(){
        sumOfNumbers(Arrays.asList(1,2,3));
        sumOfNumbers(Arrays.asList(1.1,2.2,3.4));
        sumOfNumbers(Arrays.asList(1L,2L));
    }

    //upper bound extends
    public void sumOfNumbers(List<? extends Number> numbers){
        double d = 0.0;
        for (Number n : numbers){
            d += n.doubleValue();
        }
        System.out.println(d);
    }

}
