package labsheet8.exercise1;

public class TestVehicle {
    public static void main(String[] args) {
        String text = "";

        Car c1 = new Car();
        text += "Testing the Car no-arg constructor: " + c1;

        Car c2 = new Car(1000000.0,4.5,1.25,2000.0,"Ferrari","F2",2,"05KY1");
        text += "\n\nTesting the Car multi-arg constructor: " + c2;

        Bicycle b1 = new Bicycle();
        text += "\n\nTesting the Bicycle no-arg constructor: " + b1;

        Bicycle b2 = new Bicycle(500.0,1.5,1.0,50.0,"Raleigh","Mountain Bike",true,4);
        text += "\n\nTesting the Bicycle multi-arg constructor: " + b2;

        System.out.println(text);
    }
}
