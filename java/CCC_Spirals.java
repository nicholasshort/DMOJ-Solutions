import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_Spirals{
	
	public static int currentNum, currentX, currentY;
	
	public static int[][] spiral;
	
	public static int direction = 0;//down 0, right 1, up 2, left 3
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine()), y = Integer.parseInt(in.readLine());
		currentNum = x+1;
		spiral = new int[(int)Math.ceil(Math.sqrt(y-x))][(int)Math.ceil(Math.sqrt(y-x))];
		int start = (int)Math.ceil(spiral.length/2.0)-1;
		if(x==y) {
			System.out.println(x);
			System.exit(0);
		}else if(x+1==y) {
			System.out.println(x);
			System.out.println(y);
			System.exit(0);
		}
		spiral[start][start] = x;
		currentX = start;
		currentY = start;
		while(currentNum<=y) {
			if(direction==0) {
				if(down()) {
					direction++;
					currentNum++;
					currentY++;
				}else {
					direction=3;
				}
			}else if(direction==1) {
				if(right()) {
					direction++;
					currentNum++;
					currentX++;
				}else {
					direction--;
				}
			}else if(direction==2) {
				if(up()) {
					direction++;
					currentNum++;
					currentY--;
				}else {
					direction--;
				}
			}else {
				if(left()) {
					direction = 0;
					currentNum++;
					currentX--;
				}else {
					direction--;
				}
			}
		}
		for(int i = 0; i < spiral.length; i++) {
			for(int j = 0; j < spiral[i].length; j++) {
				System.out.print(spiral[j][i]!=0 ? spiral[j][i]+" " : "   ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static boolean down() {
		if(spiral[currentX][currentY+1]==0) {
			spiral[currentX][currentY+1]=currentNum;
			return true;
		}
		return false;
	}
	
	public static boolean up() {
		if(spiral[currentX][currentY-1]==0) {
			spiral[currentX][currentY-1]=currentNum;
			return true;
		}
		return false;
	}
	
	public static boolean left() {
		if(spiral[currentX-1][currentY]==0) {
			spiral[currentX-1][currentY]=currentNum;
			return true;
		}
		return false;
	}
	
	public static boolean right() {
		if(spiral[currentX+1][currentY]==0) {
			spiral[currentX+1][currentY]=currentNum;
			return true;
		}
		return false;
	}
	

}
