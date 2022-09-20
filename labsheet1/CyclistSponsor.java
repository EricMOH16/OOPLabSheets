package labsheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {
        String name;
        int distance;
        double cost;
        final double LOW_RATE = 1.75, HIGH_RATE = 2.50;

        name = JOptionPane.showInputDialog(null,"Please enter your name"
                ,JOptionPane.INFORMATION_MESSAGE);

        distance = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter number of km cycled",
                JOptionPane.INFORMATION_MESSAGE));

        if (distance<=10)
            cost = LOW_RATE*distance;
        else
            cost = LOW_RATE*10 + HIGH_RATE*(distance-10);

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nDistance Cycled: " + distance + "km" + "\nSponsorship amount due: €" + String.format("%.2f",cost),
                "Receipt",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
