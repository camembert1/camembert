import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		int min = sc.nextInt();
		
		if(min < 45) {
			
			System.out.printf("%d %d", (hr == 0) ? 23 : hr-1, min+15);
		} else {
			System.out.printf("%d %d", hr, min-45);
			
		}
		
	}

}