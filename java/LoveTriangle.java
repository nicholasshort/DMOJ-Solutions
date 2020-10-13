import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveTriangle {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] input = br.readLine().split(" ");
		if(Math.abs(Long.parseLong(input[0])-Long.parseLong(input[1]))>Long.parseLong(input[1])*Long.parseLong(input[0])&&Math.abs(Long.parseLong(input[0])-Long.parseLong(input[1]))>Long.parseLong(input[1])+Long.parseLong(input[0])) {
			System.out.println(Math.abs(Long.parseLong(input[0])-Long.parseLong(input[1])));
		}else if(Long.parseLong(input[1])*Long.parseLong(input[0])>Math.abs(Long.parseLong(input[0])-Long.parseLong(input[1]))&&Long.parseLong(input[1])*Long.parseLong(input[0])>Long.parseLong(input[1])+Long.parseLong(input[0])) {
			System.out.println(Long.parseLong(input[1])*Long.parseLong(input[0]));
		}else {
			System.out.println(Long.parseLong(input[1])+Long.parseLong(input[0]));
		}
		
	}

}
