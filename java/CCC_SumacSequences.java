import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_SumacSequences {
	
	
	private int num1, num2, counter = 2;
	
	public void run() throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		num2 = Integer.parseInt(in.readLine());
		num1 = Integer.parseInt(in.readLine());
		count();
		System.out.println(counter);
	}
	
	public static void main(String[] args) throws IOException {
		CCC_SumacSequences c = new CCC_SumacSequences();
		c.run();
	}
	
	public void count() {
		int next = num2-num1;
		counter++;
		if(next <= num1 && next >=0) {
			num2 = num1;
			num1 = next;
			count();
		}
	}
	

}
