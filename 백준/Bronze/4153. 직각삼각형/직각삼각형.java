import java.util.*;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
			if (x == 0) break;
			
			int[] arr = {x, y, z};
			Arrays.sort(arr);
			System.out.println((arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2])? "right": "wrong");
		}
	}
}