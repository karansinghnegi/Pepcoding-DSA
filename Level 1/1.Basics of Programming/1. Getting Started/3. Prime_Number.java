import java.util.*;

public class Main {
	public static void main(String [] args) {
	
		Scanner scn = new Scanner(System.in);

		int count = scn.nextInt();

		while(count > 0) {

			int num = scn.nextInt();
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
