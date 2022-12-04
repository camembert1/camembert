import java.util.Scanner;

public class Main {
	public static int hansu(int X) {

		int cnt = 0;

		if (X < 100) {
			return X;

		} else {
			for (int i = 100; i <= X; i++) {

				int num1 = i % 10;
				int num2 = i / 10 % 10;
				int num3 = i / 100;

				if (num3 - num2 == num2 - num1) {
					cnt++;
				}
			}
			return 99 + cnt;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		System.out.println(hansu(X));
	}
}