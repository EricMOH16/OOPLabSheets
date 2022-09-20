package labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {

        String name,course;
        int snacks;

        name = JOptionPane.showInputDialog(null,"Please enter your name"
        ,JOptionPane.INFORMATION_MESSAGE);

        course = JOptionPane.showInputDialog(null,"Please enter your course",
                JOptionPane.INFORMATION_MESSAGE);

        snacks = Integer.parseInt(JOptionPane.showInputDialog(null,"How many snacks would you like?",
                JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showMessageDialog(null,"Name: " + name +"\nCourse: " + course + "\nSnacks: " + snacks +
                "\nCost: €" + (snacks*2),"Receipt",JOptionPane.INFORMATION_MESSAGE);


        System.exit(0);
    }
}
