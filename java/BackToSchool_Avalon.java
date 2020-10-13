import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackToSchool_Avalon {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int G = Integer.parseInt(in.readLine());
		double prob = 1;
		for(int i = 0; i < G; i++) {
			String temp [] = in.readLine().split(" ");
			prob*=1.0/((Double.parseDouble(temp[1]))/(Double.parseDouble(temp[1])-Double.parseDouble(temp[0])));
		}
		System.out.print(prob);
		
	}
		
}
