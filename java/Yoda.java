import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yoda {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String sub1 = input.substring(input.indexOf(",")+2), sub2 =  input.substring(0, input.indexOf(","));
		sub1 = !sub1.equals("") ? sub1.substring(0, sub1.length()-1) : sub1;
		sub1 = !sub1.equals("") ? Character.toUpperCase(sub1.charAt(0)) + sub1.substring(1) : sub1;
		sub2 = !sub1.equals("") ? Character.toLowerCase(sub2.charAt(0)) + sub2.substring(1): sub2; 
		if(sub1.equals("")) 
			System.out.printf("%s%c", sub2, input.charAt(input.length()-1));
		else
			System.out.printf("%s %s%c", sub1, sub2, input.charAt(input.length()-1));
		
	}
	
}
