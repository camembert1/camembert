import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		try {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			for (int i = M; i <= N; i++) {
				
				boolean isPrime = true;
				
				if(i == 1) isPrime = false;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if(i%j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) bw.write(i+"\n");
			}
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
