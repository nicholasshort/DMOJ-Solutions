import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class COCI_Contest4_Veci {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		if(number.length()==1) {
			System.out.println(0);
			System.exit(0);
		}
		int index = number.length()-1;
		char [] newNumber;
		do {
			index--;
			if(index<0) {
				System.out.println(0);
				System.exit(0);
			}
			newNumber = number.substring(index).toCharArray();
			newNumber = revArray(newNumber);
		}while(new String(newNumber).equals(number.substring(index)));
		char [] finalDigits = new char[newNumber.length-1];
		for(int i = 1; i < newNumber.length; i++) {
			finalDigits[i-1] = newNumber[i];
		}
		Arrays.sort(finalDigits);
		System.out.println(number.substring(0, index) + newNumber[0] + new String(finalDigits));	
		
	}
	
	public static char [] revArray(char [] c) {
		int [] n= new int[c.length]; 
		for(int i = 0; i < c.length; i++) {
			n[i] = Character.getNumericValue(c[i])*-1;
		}
		Arrays.sort(n);
		for(int i = 0; i < c.length; i++) {
			c[i] = Character.forDigit((n[i]*-1), 10);
		}
		return c;
	}
	

}
