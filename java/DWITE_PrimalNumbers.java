import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DWITE_PrimalNumbers {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 5; i++) {
			int N = Integer.parseInt(in.readLine()), count = 2, counter = 3, c;
			if(N==1) {
				System.out.println(3);
				continue;
			}
			while(count < N) {
				counter+=2;
				if(checkPrime(counter)) {
					count++;
				}
			}
			count = 2; c = 3;
			while(count < counter) {
				c+=2;
				if(checkPrime(c)) {
					count++;
				}
				
			}
			System.out.println(c);
		}
	}
	
	public static boolean checkPrime(int num){
	    if(num == 1)
	      return false;
	    if(num == 2)
	      return true;
	    for(int i = 2; i < (int)Math.sqrt(num) +1; i++){
	      if(num%i == 0)
	        return false;
	    }
	    return true;
	  }

}
