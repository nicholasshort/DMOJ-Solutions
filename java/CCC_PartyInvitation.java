import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC_PartyInvitation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(in.readLine());
		ArrayList<Integer> peeps = new ArrayList<>();
		for(int i = 0; i < K; i++) {
			peeps.add(i+1);
		}
		int m = Integer.parseInt(in.readLine());
		for(int i = 0; i < m; i++) {
			int r = Integer.parseInt(in.readLine());
			int j = 0, count = 1;
			while(j < peeps.size()) {
				System.out.println(count);
				if(count==r) {
					count = 1;
					peeps.remove(j);
				}
				count++;
				j++;
			}
		}
		for(Integer i: peeps) {
			System.out.println(i);
		}
		
	}

}
