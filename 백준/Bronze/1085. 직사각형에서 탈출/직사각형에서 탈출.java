import java.util.*;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
		int[] arr = {x, y, w-x, h-y};
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}