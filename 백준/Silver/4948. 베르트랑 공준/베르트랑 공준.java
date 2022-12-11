import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int N = sc.nextInt();
			int cnt = 0;
			for (int i = N + 1; i <= 2 * N; i++) {
				boolean isPrime = true;
				if (i == 1)
					isPrime = false;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime)
					cnt++;
			}
			if (N == 0)
				break;
			System.out.println(cnt);
		}

	}
}