import java.util.*;

public class Main {
	public static void main(String [] args) {
	
		System.out.println("Enter count ");
		Scanner scn = new Scanner(System.in);

		int count = scn.nextInt();
		System.out.println("Count enetered is " + count); 

		while(count > 0) {
			System.out.println("Enter num to check prime");

			int num = scn.nextInt();
			System.out.println("Entered number is " + num );

			boolean isPrime = true;
			int div = 2;

			while (div * div <= num) {
				if(num % div == 0 ) {
					System.out.println("not prime");
					isPrime = false;
					break;
				}
				div++;
			}
			if(isPrime) {
				System.out.println("prime");
			}
			count--;

		}

	}
}
