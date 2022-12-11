import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for (int i = M; i <= N; i++) {
			
			boolean isPrime = true;
			
			if(i == 1) isPrime = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) System.out.println(i);
			
		}

	}

}