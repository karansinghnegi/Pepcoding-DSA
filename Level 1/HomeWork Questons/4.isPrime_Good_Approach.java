import java.util.*;

public class Main {

	public static void main(String [] args) {
	
		System.out.println("Enter number to check isPrime");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		boolean isPrime = true;
		System.out.println("Entered number is " + num);

		/* Second Approach [A little better]
		 * Checking prime from  [2 -- num-1]
		 */

		for(int i = 2; i<= num-1; i++ ) {
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
