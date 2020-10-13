import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PostfixNotation {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp [] = in.readLine().split(" ");
		ArrayList<Double> stack = new ArrayList<>();

		for(int i = 0; i < temp.length; i++) {
			if(temp[i].equals("+")) {
				stack.set(stack.size()-2, stack.get(stack.size()-1)+stack.get(stack.size()-2));
				stack.remove(stack.size()-1);
			}else if(temp[i].equals("-")) {
				stack.set(stack.size()-2, stack.get(stack.size()-1)-stack.get(stack.size()-2));
				stack.remove(stack.size()-1);
			}else if(temp[i].equals("*")) {
				stack.set(stack.size()-2, stack.get(stack.size()-1)*stack.get(stack.size()-2));
				stack.remove(stack.size()-1);
			}else if(temp[i].equals("/")) {
				stack.set(stack.size()-2, stack.get(stack.size()-1)/stack.get(stack.size()-2));
				stack.remove(stack.size()-1);
			}else if(temp[i].equals("%")) {
				stack.set(stack.size()-2, stack.get(stack.size()-1)%stack.get(stack.size()-2));
				stack.remove(stack.size()-1);
			}else if(temp[i].equals("^")) {
				stack.set(stack.size()-2, Math.pow(stack.get(stack.size()-1),stack.get(stack.size()-2)));
				stack.remove(stack.size()-1);
			}else {
				stack.add(Double.parseDouble(temp[i]));
			}
		}
		System.out.println(stack.get(0));
		
		
	}
	
	
}
