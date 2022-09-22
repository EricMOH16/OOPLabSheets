package labsheet4.Exercise5;

import labsheet4.Exercise4.Book;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "",title,ISBN;
        int pages;
        double price;

        title = JOptionPane.showInputDialog(null,"Please enter the title of your favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the price of your favourite book"));
        ISBN = JOptionPane.showInputDialog(null,"Please enter the ISBN of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter how many pages your favourite book has"));

        labsheet4.Exercise4.Book favBook = new labsheet4.Exercise4.Book(title,price,ISBN,pages);

        output += "\n\n" + favBook.toString();

        title = JOptionPane.showInputDialog(null,"Please enter the title of your least favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the price of your least favourite book"));
        ISBN = JOptionPane.showInputDialog(null,"Please enter the ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter how many pages your least favourite book has"));

        labsheet4.Exercise4.Book leastFavBook = new Book(title,price,ISBN,pages);

        output += "\n\n" + leastFavBook.toString();




        JOptionPane.showMessageDialog(null,output,"Book Object Details",JOptionPane.INFORMATION_MESSAGE);




        System.exit(0);
    }
}
