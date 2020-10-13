import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GoingBackToDefinitions {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<String> numbers = new ArrayList<>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		for(int i = 0; i < N; i++) {
			numbers.add(in.readLine());
		}
		Collections.sort(numbers, new Unt());
		for(String i: numbers) {
			System.out.print(i);
		}
	}
	
}

class Unt implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return (o2+o1).compareTo(o1+o2) > 0 ? 1 : -1;
	}

}
