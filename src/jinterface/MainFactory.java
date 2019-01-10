package jinterface;

public class MainFactory {

    public void createCar(Vehicle vehicle){
        vehicle.createVehicle();
    }
    public static void main(String[] args){

        Car car = new Car();
        car.createVehicle();


        Vehicle vehicleInnerClass = new Vehicle() {
            @Override
            public void createVehicle() {
                System.out.println("I am F30 aka BMW 3 series");
            }
        };

        vehicleInnerClass.createVehicle();



        MainFactory mainFactory = new MainFactory();
        mainFactory.createCar(() -> System.out.println("I am under construction"));


    }
}
