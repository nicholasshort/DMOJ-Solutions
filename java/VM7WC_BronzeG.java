import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VM7WC_BronzeG {
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		byte N = Byte.parseByte(in.readLine());
		char [][] g = {{'G','G','G','G','G'},{'G','.','.','.','.'},{'G','.','.','G','G'},{'G','.','.','.','G'},{'G','G','G','G','G'}};
		int i = 0, count = 0;
		while(i < g.length) {
			int j = 0;
			while(j < g[i].length) {
				for(int z = 0; z < N; z++) {
					System.out.print(g[i][j]);
				}
				j++;
			}
			count++;
			i = count % N != 0 ? i : i+1;
			System.out.println();
		}
	}

}
