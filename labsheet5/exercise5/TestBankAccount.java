package labsheet5.exercise5;

import labsheet5.exercise5.BankAccount;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        String output = "";

        BankAccount b1 = new BankAccount();

        output += "Calling the no argument constructor. The first BankAccount object " +
                "details are: \n\n " + b1.toString();

        BankAccount b2 = new BankAccount("Richy Rich",0.75);


        output += "\n\nCalling the multi argument constructor. The second BankAccount object " +
                "details are: \n\n " + b2.toString();

        BankAccount.setInterestRate(0.5);

        output += "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5.\n\n The first BankAccount object " +
                "details are: \n\n " + b1.toString();

        output += "\n\nThe second BankAccount object details are: \n\n " + b2.toString();

        JOptionPane.showMessageDialog(null,output + "\n\n " +
                        "The number of bank account objects created is: " +
                        BankAccount.getCount(),"Bank Account Object Details",
                1);

    }
}
