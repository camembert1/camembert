import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		String[] board = new String[N];
		for (int i = 0; i < N; i++) {
			board[i] = sc.next();
		}
        
		String[] corrBoard = {"WBWBWBWB", "BWBWBWBW"};
		int cnt = 0;
		int result = 33;
		
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				
				for (int k = 0; k < 8; k++) {
					for (int h = 0; h < 8; h++) {
						char section = board[i+k].charAt(j+h);
						char corrSection = corrBoard[((i+k)%2 != 0)? 0: 1].charAt(h);
						if (section != corrSection) cnt++;
					}
				}
				if (cnt > 32) cnt = 64 - cnt;
				if (cnt < result) result = cnt;
				cnt = 0;
                
			}
		}
		System.out.println(result);
	}
}