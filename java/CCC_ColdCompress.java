import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC_ColdCompress {
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n; i++) {
			String input = in.readLine();
			ArrayList<String> split = getList(input);
			for(String s: split) {
				System.out.printf("%d %s ", s.length(), s.charAt(0));
			}
			System.out.println();
		}
		
	}
	
	public static ArrayList<String> getList(String in){
		ArrayList<String> characters = new ArrayList<>();
		char last = in.charAt(0);
		characters.add("");
		for(int i = 0; i < in.length(); i++) {
			if(in.charAt(i)==last) {
				characters.set(characters.size()-1, characters.get(characters.size()-1)+Character.toString(in.charAt(i)));
			}else {
				characters.add(Character.toString(in.charAt(i)));
			}
			last = in.charAt(i);
		}
		return characters;
		
	}

}
