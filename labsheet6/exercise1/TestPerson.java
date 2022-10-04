package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {

        String output = "", firstName, lastName;

        Person p1 = new Person();

        output += "Calling the Person() constructor..... \nValue of the first Person" +
                " object is: " + p1.toString();

        firstName = JOptionPane.showInputDialog(null,"Please enter the first nam of the second person");
        lastName = JOptionPane.showInputDialog(null,"Please enter the last name of the second person ");

        Person p2 = new Person(firstName,lastName);

        output += "\n\nCalling the Person(String,String) constructor after getting the user-supplied values\n" +
                "Value of the second person object is: " + p2.toString();

        JOptionPane.showMessageDialog(null,output,"Person Class Tester",1);

        System.exit(0);

    }
}
