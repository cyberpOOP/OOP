package lab1;
import java.util.Scanner;

/* IO-03 Haidysh vlad
 * C2 = 1 ( - )
 * C3 = 2
 * C5 = 0 ( * )
 * C7 = 4 char
 */

public class Lab1 {

	private static final byte C = 2;
	private static int n, m, a, b;
	private static double S;
	private static Scanner num = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Scan();
		
		//System.out.println(n+" "+m+" "+a+" "+b);
		Solution();
		
	}
	
	private static void Scan() {
		System.out.print("Write an upper edge n:");
		n = num.nextInt();
		System.out.print("Write an upper edge m:");
		m = num.nextInt();
		System.out.print("Write an lower edge a:");
		a = num.nextInt();
		System.out.print("Write an lower edge b:");
		b = num.nextInt();
		
		Check();
	}
	
	private static void Check() {
		
		if(n<a) {
			System.out.println("n < a!");
			while(n<a) {
				System.out.println("Wrtie new n > "+a);
				n = num.nextInt();
			}
		}
		if(m<b) {
			System.out.println("m < b!");
			while(m<b) {
				System.out.println("Wrtie new m > "+b);
				m = num.nextInt();
			}
		}
		else num.close();
	}
	
	private static void Solution() {
		S = 0;
		try {
			for(char i = (char)a; i<n; i++) {
				for(char j = (char)b; j<m; j++) {
					S += (double)( 	(i*j)/(i - C) );
				}
			}
			System.out.println(S);
		}
		catch(ArithmeticException a){
			System.out.println("Dividing by Zero");
		}
	}
}
