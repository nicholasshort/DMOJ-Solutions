import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class CCC_StrategicBombing {
	
	static ArrayList<String> roads = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input;
		do {
			input = in.readLine();
			roads.add(input);
		}while(!input.equals("**"));
		roads.remove(roads.size()-1);
		int i = 0, count = 0;
		while(i < roads.size()) {
			String removedRoad = roads.get(i);
			roads.remove(i);
			if(!otherSide()) {
				System.out.println(removedRoad);
				count++;
			}
			roads.add(i, removedRoad);
			i++;
		}
		System.out.println("There are " + count + " disconnecting roads.");
		
	}
	
	public static boolean otherSide() {
		ArrayList<Character> places = new ArrayList<>();
		for(int z = 0; z < roads.size(); z++) {
			char temp [] = roads.get(z).toCharArray();
			if(!places.contains(temp[0]))
				places.add(temp[0]);
			if(!places.contains(temp[1]))
				places.add(temp[1]);
		}
		char visited [][] = new char[places.size()][2];
		for(int i = 0; i < places.size(); i++) {
			visited[i][0] = places.get(i);
			visited[i][1] = visited[i][0] != 'A' ? '0' : '1';
		} 
		ArrayList<Character> placesToAdd = new ArrayList<>();
		int previousSize;
		do{
			previousSize = placesToAdd.size();
			placesToAdd.clear(); 
			for(int i = 0; i < visited.length; i++) {
				if(visited[i][1] == '1') {
					for(int j = 0; j < roads.size(); j++) {
						if(roads.get(j).contains(Character.toString(visited[i][0]))) {
							placesToAdd.add(roads.get(j).indexOf(visited[i][0]) == 0 ? roads.get(j).charAt(1) : roads.get(j).charAt(0));
						}
					}
				}
			}
			for(int i = 0; i < visited.length; i++) {
				for(Character c: placesToAdd) {
					if(visited[i][0] == c) {
						visited[i][1] = '1';
					}
				}
				if(visited[i][0] == 'B' && visited[i][1] == '1')
					return true;
			}
			
		}while(placesToAdd.size() - previousSize != 0);
		return false;
	}
	
}
