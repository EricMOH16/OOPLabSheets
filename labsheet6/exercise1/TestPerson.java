package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {

        String output = "", firstName, lastName;

        Person p1 = new Person();

        output += "Calling the Person() constructor..... \nValue of the first Person" +
                " object is: " + p1.toString();

        JOptionPane.showMessageDialog(null,output,"Person Class Tester",1);

        System.exit(0);

    }
}
