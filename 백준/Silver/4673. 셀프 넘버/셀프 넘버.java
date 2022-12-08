import java.util.Arrays;

public class Main {
	public static void selfNum() {

		int[] arrs = new int[10000];
		for (int n = 1; n < 10000; n++) {
			int dN = n + n / 1000 + n / 100 % 10 + n / 10 % 10 + n % 10;
			arrs[n] = dN;
		}
		
		Arrays.sort(arrs);
		for (int i = 1; i < 10000; i++) {
			if(Arrays.binarySearch(arrs, i) < 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		selfNum();
	}
}