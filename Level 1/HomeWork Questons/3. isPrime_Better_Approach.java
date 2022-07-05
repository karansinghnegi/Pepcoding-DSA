import java.util.*;

public class Main {

	public static void main(String [] args) {
	
		System.out.println("Enter number to check isPrime");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		boolean isPrime = true;
		System.out.println("Entered number is " + num);

		/* Second Approach [A little more better]
		 * Checking prime from  [2 -- num/2]
		 */

		for(int i = 2; i<= num/2; i++ ) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if(isPrime && num != 1) {
		  System.out.println("Prime");	
		} else {
		  System.out.println("Not Prime");
		}
	}
}
