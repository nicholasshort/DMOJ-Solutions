import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class ListMinimumHard {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(in.readLine());
		int[] numbers = new int[N];
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(in.readLine());
		}
		Arrays.sort(numbers);
		for(Integer i: numbers) {
			pw.println(i);
		}
		pw.close();
	}

}
