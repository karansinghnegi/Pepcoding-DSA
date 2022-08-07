import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int count = 1;

        while (count <= num) {
            int rem = count % 2;
            if (rem == 0) { 
                System.out.println(count + " is even");
            } else {
                System.out.println(count + " is odd");
            }
            count++;
        }
    }
}