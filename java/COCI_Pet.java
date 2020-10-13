import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COCI_Pet {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] greatest = {0, 0};
		int total;
		for(int i = 0; i < 5; i++) {
			String input [] = br.readLine().split(" ");
			total = 0;
			for(int j = 0; j < input.length; j++) {
				total += Integer.parseInt(input[j]);
			}
			if(total > greatest[1]) {
				greatest[0] = i+1;
				greatest[1] = total;
			}
		}
		System.out.printf("%d %d", greatest[0], greatest[1]);
	}

}
