package iterable.collection;

import java.util.Arrays;
import java.util.List;


public class ListArrayList {

    public static void main (String[] args){

        List<Employee> employees = Arrays.asList(
                new Employee("Faran", "Khan", 99),
                new Employee("Adeel", "Ahmed", 00)
        );


        for (Employee i: employees){
            System.out.println(i);
        }

//        ArrayList<String> arrayList = new ArrayList();
//
//        arrayList.add("a");
//        arrayList.add("b");
//
//        System.out.println(arrayList);
//
//
//        for(String i : arrayList){
//            System.out.println(i);
//        }
//
//
//        for (int i =0; i < arrayList.size(); i++){
//            System.out.println(i);
//
//        }

    }
}
