import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DWITE_AllIsBalanced {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int [][] brackets = {{0,0},{0,0},{0,0}};//first: 0 = (, 1 = ) second: 0 = [, 1 = ], third: 0 = {, 1 = }
		char latest = ' '; 
		for(int i = 0; i < 5; i++) {
			String input = in.readLine();
			boolean flag = false;
			for(int j = 0; j < input.length(); j++) {
				if(isForwardBracket(input.charAt(j))) {
					latest = input.charAt(j);
					switch(latest){
						case '(':
							brackets[0][0]+=1;
							break;
						case '[':
							brackets[1][0]+=1;
							break;
						case '{':
							brackets[2][0]+=1;
							break;
					}
				}else if(isBackwardBracket(input.charAt(j))) {
					if(input.charAt(j) != coBracket(latest)) {
						System.out.println("not balanced");
						flag = true;
						break;
					}else {
						latest = findEarlierBracket(input.substring(0, input.indexOf(latest)));
					}
					switch(input.charAt(j)){
						case ')':
							brackets[0][1]+=1;
							break;
						case ']':
							brackets[1][1]+=1;
							break;
						case '}':
							brackets[2][1]+=1;
							break;
					}
					
				}
			}
			if(!flag) {
				for(int z = 0; z < 3; z++) {
					if(brackets[z][0] != brackets[z][1]) {
						System.out.println("not balanced");
						flag = true;
					}
				}
			}
			System.out.print(!flag ? "balanced\n" : "");
		}
		
	}
	
	public static boolean isForwardBracket(char c) {
		return c == '(' || c == '[' || c == '{';
	}
	
	public static boolean isBackwardBracket(char c) {
		return c == ')' || c == ']' || c == '}';
	}
	
	public static char coBracket(char c) {
		if(c == '(') return ')';
		if(c == ')') return '(';
		if(c == '[') return ']';
		if(c == ']') return '[';
		if(c == '{') return '}';
		if(c == '}') return '{';
		else return ' ';
	}
	
	public static char findEarlierBracket(String s) {
		for(int i = s.length()-1; i >=0; i--) {
			if(isForwardBracket(s.charAt(i))||isBackwardBracket(s.charAt(i))) {
				return s.charAt(i);
			}
		}
		return ' ';
	}

}
