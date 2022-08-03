import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number to check Even or Odd.");
        int num = scn.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number entered " + num + " is Even.");
        } else {
             System.out.println("Number entered " + num + " is Odd.");
        }
    }
}