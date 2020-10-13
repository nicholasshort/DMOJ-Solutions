
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC_Punchy {
	
	private int A = 0, B = 0;

	public void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int A = 0, B = 0;
		String instruction = "";
		while(true) {
			instruction = in.readLine();
			if(instruction.charAt(0) == '7') {
				break;
			}else if(instruction.charAt(0) == '1') {
				one(instruction);
			}else if(instruction.charAt(0)== '2') {
				two(instruction);
			}else if(instruction.charAt(0)== '3') {
				three(instruction);
			}
			else if(instruction.charAt(0)== '4') {
				four(instruction);
			}
			else if(instruction.charAt(0)== '5') {
				five(instruction);
			}
			else if(instruction.charAt(0)== '6') {
				six(instruction);
			}
		}
		
	}
	
	public void one(String instruction) {
		if(instruction.charAt(2)=='A') {
			A=Integer.parseInt(instruction.substring(4, instruction.length()));
		}else {
			B=Integer.parseInt(instruction.substring(4, instruction.length()));
		}
	}
	
	public void two(String instruction) {
		if(instruction.charAt(2) == 'A') {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}
	
	public void three(String instruction) {
		if(instruction.charAt(2) == 'A') {
			if(instruction.charAt(4) == 'A')
				A+=A;
			else	
				A+=B;
		}else {
			if(instruction.charAt(4) == 'A')
				B+=A;
			else	
				B+=B;
		}
	}
	
	public void four(String instruction) {
		if(instruction.charAt(2) == 'A') {
			if(instruction.charAt(4) == 'A')
				A*=A;
			else	
				A*=B;
		}else {
			if(instruction.charAt(4) == 'A')
				B*=A;
			else	
				B*=B;
		}
	}
	
	public void five(String instruction) {
		if(instruction.charAt(2) == 'A') {
			if(instruction.charAt(4) == 'A')
				A-=A;
			else	
				A-=B;
		}else {
			if(instruction.charAt(4) == 'A')
				B-=A;
			else	
				B-=B;
		}
	}
	
	public void six(String instruction) {
		if(instruction.charAt(2) == 'A') {
			if(instruction.charAt(4) == 'A')
				A/=A;
			else	
				A/=B;
		}else {
			if(instruction.charAt(4) == 'A')
				B/=A;
			else	
				B/=B;
		}
	}
	
	public static void main(String[] args) throws IOException {
		CCC_Punchy c = new CCC_Punchy();
		c.run();
	}

}	


