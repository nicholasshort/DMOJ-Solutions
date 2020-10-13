import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DWITE_NotQuitePrime {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int a = 0; a < 5; a++) {
			int num = Integer.parseInt(br.readLine());
			boolean found = false;
			for(int i = 1; i < num; i++) {
				for(int j = num; j >= i; j--) {
					if(i*j==num && isPrime(i) && isPrime(j)) {
						System.out.println("semiprime");
						found = true;
					}
				}
			}
			System.out.print(found ? "" :"not\n");
		}
	}
	
	public static boolean isPrime(int n) {if(n==1) return false;if(n==2) return true;if(n%2==0) return false;for(int i = 3; i <= (int)Math.sqrt(n); i+=2) if(n%i==0)return false;return true;}

}
