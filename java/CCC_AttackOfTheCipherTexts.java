import java.util.Scanner;


public class CCC_AttackOfTheCipherTexts {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};
		char [] encrypt = new char[27];
		String ans1 = sc.nextLine();
		String ans2 = sc.nextLine();
		String message = sc.nextLine();
		for(int i = 0; i < ans2.length(); i++) {
			encrypt[indexOf(ans1.charAt(i), alpha)] = ans2.charAt(i);
		}
		for(int i = 0; i < message.length(); i++) {
			try {
				System.out.print(alpha[indexOf(message.charAt(i), encrypt)]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.print('.');
			}
		}
		
	}
	
	public static int indexOf(char a, char[] alpha) {
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i]==a) {
				return i;
			}
		}
		return -1;
	}

}
