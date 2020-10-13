import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ECOO_SideScrollingSimulator {
	
	static char [][] map;
	
	static int J, W, H, x, y;
	
	static boolean flag;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 10; i++) {
			String[] temp = in.readLine().split(" ");
			J = Integer.parseInt(temp[0]);
			W = Integer.parseInt(temp[1]);
			H = Integer.parseInt(temp[2]);
			map = new char[H][W];
			x = 0;
			y = H-2;
			flag = false;
			for(int j = 0; j < H; j++) {
				String temp2 = in.readLine();
				for(int z = 0; z < temp2.length(); z++) {
					map[j][z] = temp2.charAt(z);
				}
			}
			while((x!=W-1||y!=H-2)&&!flag) {
				move();
				gravity();
			}
			System.out.print(!flag ? "CLEAR\n" : "");
	
		}
	}
	
	public static void move() {
		if(map[y][x+1] == '.'||map[y][x+1] == 'G') {
			map[y][x+1] = 'L';
			x++;
			//drawMap();
		}else if(map[y][x+1] == '@'){
			jump();
		}
	}
	
	public static void jump() {
		if(checkJumpPath()) {
			map[y][x+2] = 'L';
			x+=2;
			//drawMap();
		}else {
			System.out.println(x+2);
			flag = true;
			
		}
	}
	
	public static void gravity() {
		if(map[y+1][x] == '.') {
			map[y+1][x] = 'L';
			y++;
			//drawMap();
		}
	}
	
	public static boolean checkJumpPath() {
		for(int i = 0; i <= J; i++) {
			if(map[y-i][x]=='@'||map[y-i][x+2]=='@') {
				return false;
			}
		}
		if(map[y-J][x+1]=='@') {
			return false;
		}
		return true;
	}
	
	public static void drawMap() {
		for(int j = 0; j < H; j++) {
			for(int z = 0; z < W; z++) {
				System.out.print(map[j][z]);
			}
			System.out.println();
		}
	}
	
	

}

