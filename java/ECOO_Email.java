import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ECOO_Email {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> addresses = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			int N = Integer.parseInt(br.readLine());
			for(int j = 0; j < N; j++) {
				addresses.add(eFormatter(br.readLine().toLowerCase()));
			}
			ArrayList<String> listWithoutDuplicates = (ArrayList<String>) addresses.stream().distinct().collect(Collectors.toList());
			System.out.println(listWithoutDuplicates.size());
			addresses.clear();
		}
	}
	
	public static String eFormatter(String s) {
		String email = s;
		int i = 0;
		while(i < email.length()) {
			if(email.charAt(i)=='.'&&!email.substring(0, i).contains("@")) {
				email = email.substring(0, i) + email.substring(i+1);
				i--;
			}
			else if(email.charAt(i)=='+'&&!email.substring(0, i).contains("@")) {
				email = email.substring(0, i) + email.substring(email.indexOf("@"));
				return email;
			}
			i++;
		}
		return email;
	}

}
