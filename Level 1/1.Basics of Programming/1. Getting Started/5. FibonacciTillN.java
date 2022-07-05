import java.util.*;
  
 public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int a = 0;
      int b = 1;

      for(int i = 0; i <num; i++) {
        int c = a + b;
        System.out.println(a);
        a = b;
        b = c;
      }
   }
 }
