import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			String vps = sc.next();
			System.out.println(findVPS(vps));
		}
	}

	public static String findVPS(String vps) {
		while (vps.contains("()")) {
			vps = vps.replace("()", "");
		}
		return (vps.equals(""))? "YES": "NO";
	}
	
}