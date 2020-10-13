import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_UpAndDown {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());
		int b = Integer.parseInt(in.readLine());
		int c = Integer.parseInt(in.readLine());
		int d = Integer.parseInt(in.readLine());
		int e = Integer.parseInt(in.readLine());
		int remA = e%(a+b);
		int remB = e%(c+d);
		int totalA = e/(a+b)*(a-b);
		int totalB = e/(c+d)*(c-d);
		
		
		if(remA>=a) {
			totalA+=a;
			remA-=a;
			totalA-=remA;
		}else if(remA<a){
			totalA+=remA;
		}
		
		if(remB>=c) {
			totalB+=c;
			remB-=c;
			totalB-=remB;
		}else if(remB<c){
			totalB+=remB;
		}	
		
		
		System.out.println(totalA + " " + totalB);
		if(totalA>totalB) 
			System.out.println("Nikky");
		else if(totalB>totalA)
			System.out.println("Byron");
		else
			System.out.println("Tied");
	}
	
}
