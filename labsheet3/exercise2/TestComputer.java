package labsheet3.exercise2;

import labsheet3.exercise2.Computer;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output = "";

        Computer c1 = new Computer();

        output +="Calling the no-argument Computer constructor. " +
                "The first computer details are: \n\n" + c1.toString();

        Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

        c2.setSpeed(-3.15);

        output += "\n\nCalling the multi-argument computer constructor. " +
                "The second computer object details are: \n\n" + c2.toString();

        Computer c3 = new Computer("Apple","Desktop",2.9, 12, 865.00);

        c3.setRAM(-8);

        output += "\n\nCalling the multi-argument computer constructor. " +
                "The third computer object details are: \n\n" + c3.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);


    }
}
