import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_DontPassMeTheBall {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int jNum = Integer.parseInt(br.readLine()), total = 0, increment = 1;
		for(int i = 0; i < jNum-3; i++) {
			total+=increment;
			increment+=(2+i);
		}
		System.out.println(total);
	}
}
