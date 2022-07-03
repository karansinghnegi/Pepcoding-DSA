import java.util.*;

public class Main {

	public static void main(String [] args) {
	
		System.out.println("Enter number to check isPrime");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		boolean isPrime = true;
		System.out.println("Entered number is " + num);

		/* Second Approach [Best Approach]
		 * Checking prime from  [2 --- squareRoot of num]
		 */

		for(int i = 2; i*i<= num; i++ ) {
			if(num % i == 0) {
				System.out.println("Not Prime");
				isPrime = false;
				break;
			}
		}

		if(isPrime) {
		  System.out.println("Prime");	
		}
	}
}
