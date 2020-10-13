
public class Main {
	
	public static void main(String [] args) {
		SuperClass s = new SubClass("Nut Sack", 3);
		SuperClass tempS = new SuperClass("a");
		tempS.suckMePeepee();
		int n [][] = new int[3][2];
		int count = 0;
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				count++;
				n[i][j] = count;
			}
		}
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j]);
			}
			System.out.println();
		}
		
	}

}
