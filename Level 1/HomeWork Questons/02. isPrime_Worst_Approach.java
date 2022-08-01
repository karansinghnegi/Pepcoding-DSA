import java.util.*;

public class Prime {
	public static void main(String [] args) {
	
		System.out.println("Enter number to check isPrime");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0;
		System.out.println("Entered number is " + num);
		
		/* Brute force approach
		 * Checking prime from [1 -- num]
		 */

		for(int i = 1; i <=num; i++) {
			if(count > 2) {
				break;
			}
			if(num % i == 0) {
				count++;
			}

		}
		if(count <= 2 && num != 1) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	
	}


}

