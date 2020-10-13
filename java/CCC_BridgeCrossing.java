import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC_BridgeCrossing {
	
	public static ArrayList<Integer> times = new ArrayList<>();
	
	
	public static ArrayList<String> people = new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(in.readLine());//Number of people per group
		int Q = Integer.parseInt(in.readLine());//Number of people
		int totalTime = 0;
		for(int i = 0; i < Q; i++) {
			String person = in.readLine();
			int time = Integer.parseInt(in.readLine());
			sort(time, person);
		}
		int i = 0;
		for(int z = 0; z < times.size(); z++) {
			System.out.println(times.get(z) + " " + people.get(z));
		}
		System.out.println();
		ArrayList<String> groups = new ArrayList<String>();
		while(i < times.size()) {
			int groupTime = 0;
			for(int j = 0; j < M; j++) {
				if(i+j > times.size()-1) {
					break;
				}
				if(j==0) {
					groupTime = times.get(i);
					groups.add(people.get(i));
					continue;
				}
				//System.out.println(j);
				//System.out.println(i+j + " " + times.get(i+j) + " " + groupTime + people.get(i+j));
				if(times.get(i+j)==groupTime) {
					System.out.println("Here");
					groups.add(people.get(i+j));
				}else {
					i+=j-1;
					System.out.println(j-1);
					groups.add(".");//Separates groups
					break;
				}
			}
			totalTime+=groupTime;
			i++;
		}
		System.out.println("Total Time: " + totalTime);
		for(String s: groups) {
			System.out.println(s);
		}
	}
	
	public static void sort(int time, String person) {
		for(int i = 0; i < times.size(); i++) {
			if(times.get(i) > time) {
				times.add(i, time);
				people.add(i, person);
				return;
			}
		}
		times.add(time);
		people.add(person);
	}

}
