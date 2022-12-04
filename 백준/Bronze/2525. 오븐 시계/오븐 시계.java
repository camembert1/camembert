import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hr = sc.nextInt();
		int min = sc.nextInt();
		int cooking_min = sc.nextInt();
		
		int endTime = hr*60 + min + cooking_min;
		System.out.printf("%d %d", (endTime/60 >= 24)? endTime/60 - 24: endTime/60, endTime%60);
		
	}
}