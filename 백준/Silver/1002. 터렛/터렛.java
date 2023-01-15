import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt(),
				x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();
			
			int dif = Math.abs(r2-r1);
			int sum = r2 + r1;
			double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			
			if (dif < d && d < sum) result = 2;
			if (dif == d || sum == d) result = 1;
			if (d < dif || sum < d) result = 0;
			if (d == 0 && dif == 0) result = -1;
			
			System.out.println(result);
		}

	}
}