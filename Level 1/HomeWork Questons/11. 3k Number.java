import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number to check if its 3K or 3K+1 Or 3K+2 number");

        int num = scn.nextInt();

        if (num % 3 ==  0) {
            System.out.println("3k Number");
        } else if (num % 3 == 1) {
            System.out.println("3k + 1 Number");
        } else {
            System.out.println("3k + 2 Number");
        }
    }
}