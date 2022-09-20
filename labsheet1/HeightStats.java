package labsheet1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {
        int  i = 1;
        float height;

        Scanner input = new Scanner(System.in);

        while(i<=6)
        {
            System.out.print("Loop " + i +" - Please enter height: ");
            height = input.nextFloat();

          while (height>0.5464 || height<2.72) {
              System.out.print("Loop " + i + " - Height Value Invalid!!! Please re-enter height: ");
              height = input.nextFloat();

          }

        }

    }
}
