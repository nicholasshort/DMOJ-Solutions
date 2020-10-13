import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BackToSchool_Paradox {

	static ArrayList<Boolean> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		for(int i = 0; i < C; i++) {
			String temp [] = br.readLine().split(" ");
			switch(temp[0]) {
				case "1":
					one(Boolean.parseBoolean(temp[1]));
					break;
				case "2":
					two(Boolean.parseBoolean(temp[1]));
					break;
				case "3":
					three(Boolean.parseBoolean(temp[1]));
					break;
				case "4":
					four();
					break;
				default:
					System.out.println("Chinese fuin student");
			}
		}
	}
	
	public static void one(boolean b) {
		if(!list.contains(b)) {
			list.add(b);
			System.out.println(true);
			return;
		}
		System.out.println(false);
	}
	
	public static void two(boolean b) {
		if(list.contains(b)) {
			list.remove(b);
			System.out.println(true);
			return;
		}
		System.out.println(false);;
	}
	
	public static void three(boolean b) {
		if(list.contains(b)) {
			System.out.println(list.indexOf(b));
			return;
		}
		System.out.println(-1);
			
		
	}
	
	public static void four() {
		for(Boolean b: list) {
			if(!b)
				System.out.print(false + " ");
		}
		for(Boolean b: list) {
			if(b)
				System.out.print(true + " ");
		}
		
	}
	
}
