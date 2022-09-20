package labsheet1;

import java.util.Scanner;

//determine the acceleration due to gravity on a different planet
public class PlanetGravity {
    public static void main(String[] args) {

        float g = 9.81f;
        float MassE,RadiusE,MassP,RadiusP,acceleration;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the mass of Planet Earth: ");
        MassE = input.nextFloat();
        System.out.print("Please enter the radius of Planet Earth: ");
        RadiusE = input.nextFloat();
        System.out.print("Please enter the mass of the other planet: ");
        MassP = input.nextFloat();
        System.out.print("Please enter the radius of the other planet: ");
        RadiusP = input.nextFloat();

        acceleration = g*MassP*RadiusE*RadiusE / (MassE*RadiusP*RadiusP);

        System.out.println("The acceleration due to gravity on the other planet is: " +
                String.format("%.2f",acceleration) + " m/s/s");





    }
}
