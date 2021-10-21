package labsheet8.exercise2;

public class TestVehicle2 {
    public static void main(String[] args) {
        String text = "";

        Car2 c1 = new Car2();
        text += "Testing the Car no-arg constructor: " + c1;

        Car2 c2 = new Car2(1000000.0,4.5,1.25,2000.0,"Ferrari","F2",2,"05KY1");
        text += "\n\nTesting the Car multi-arg constructor: " + c2;

        Bicycle2 b1 = new Bicycle2();
        text += "\n\nTesting the Bicycle no-arg constructor: " + b1;

        Bicycle2 b2 = new Bicycle2(500.0,1.5,1.0,50.0,"Raleigh","Mountain Bike",true,4);
        text += "\n\nTesting the Bicycle multi-arg constructor: " + b2;

        System.out.println(text);
    }
}
