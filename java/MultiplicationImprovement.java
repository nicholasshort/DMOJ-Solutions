import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MultiplicationImprovement {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] numbers = new int[(int)(input.length()/2)+1]; 
		int count = 0;
		long product = 1;
		for(int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) {
				numbers[count] = Character.getNumericValue(input.charAt(i));
				count++;
			}
		}
		Arrays.sort(numbers);
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(i!=numbers.length-1 ? Integer.toString(numbers[i])+"x" : Integer.toString(numbers[i])+"\n");
			product*=numbers[i]; 
		}
		System.out.println(product);
	}
	
}
