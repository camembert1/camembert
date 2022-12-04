import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();
		int num = inputNum;
		
		for (int i = 1; ; i++) {
			num = (num%10) * 10 + (num/10 + num%10) % 10;
			if(num == inputNum) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
