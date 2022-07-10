import java.util.*;

public class Main {

    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);

        // If String and Int is there in program use, this for inputing a number then
        int num = Integer.parseInt(scn.nextLine());

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

        String name = scn.nextLine();
        System.out.println(name);
    }
}