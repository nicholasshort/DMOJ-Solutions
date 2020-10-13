import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquationSolver {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input [] = br.readLine().split(" ");
		String operand = "";
		int total = 0;
		boolean ran = false;
		for(String s: input) { 
			if(!ran) {
				total = Integer.parseInt(s);
				ran = true;
				continue;
			}
			if(isNumber(s)) {
				total = operand.equals("P") ? total + Integer.parseInt(s) : total - Integer.parseInt(s);
			}else {
				operand = s;
			}
		}
		System.out.println(total);
	
	}
	
	public static boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
		}catch(NumberFormatException e) {
			return false;
		}
		return true;
	}

}
