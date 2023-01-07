import java.util.*;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String result;
		
		while (true) {
			
			int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
			if (x == 0) break;
			
			int[] arr = {x, y, z};
			Arrays.sort(arr);
			
			if (arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2]) result = "right";
			else result = "wrong";
			
			System.out.println(result);
		}
	}
}