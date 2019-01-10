package string;

public class StringBuffer {


    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("String a");
        stringBuilder.append(" + b");
        //stringBuilder.reverse();
        stringBuilder.replace(0,1,"T");
        System.out.println(stringBuilder);
        System.out.println(Math.random());

        float[] myFloatArray = new float[10];
        double[] myDoubleArray = {22,11,20,56,23,25};
//
//
//        for (float v : myFloatArray) {
//            System.out.println(v);
//        }
//
//        for(double x: myDoubleArray){
//            System.out.println(x);
//            }


        double max = myDoubleArray[0];
        for(int i =0; i < myDoubleArray.length; i++){
            if(myDoubleArray[i] > max){
                max = myDoubleArray[i];

            }else{
                System.out.println(myDoubleArray[i]);
            }


        }
        System.out.println("Biggest number is " + max);

    }



}
