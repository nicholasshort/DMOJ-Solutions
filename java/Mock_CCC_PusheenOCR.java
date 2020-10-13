import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mock_CCC_PusheenOCR {
	
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(), p = "pusheen";
		int count = 0;
		for(int i = 0; i < 7; i++) {
			if(input.charAt(i)!=p.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
