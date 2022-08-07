import java.util.*;

public class Main {
  public static void main (String[] args) {
    System.out.println("Please enter any number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 1;
    System.out.println("You have entered: " + num);
    while(count <= num) {
      if (count % 2 == 0) {
        System.out.println("Number is even: " + count);
      } else {
        System.out.println("Number is odd:  " + count);
      }
      count++;
    }
  }
}
