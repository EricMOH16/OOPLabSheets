package labsheet4.exercise3;

import labsheet4.exercise3.Book;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Book b1 = new Book();

        output += "Calling the no-argument Book constructor. " +
                "The first book details are: \n\n" +b1.toString();

        Book b2 = new Book("The Davinci Code",19.99,"3452617232",348);

        output += "\n\nCalling the multi-argument computer constructor. " +
                "The second book object details are: \n\n" + b2.toString();


        JOptionPane.showMessageDialog(null,output,"Book Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
