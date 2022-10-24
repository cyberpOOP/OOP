package lab1;

/* IO-03 Haidysh vlad
 * C2 = 1 ( - )
 * C3 = 2
 * C5 = 0 ( * )
 * C7 = 4 char
 */

public class Solution{
	
	private final byte C = 2;
	private static int n, m, a, b;
	private static double S;
	
	public static void main(String[] args) {
		
	}
	
	Solution(int n, int m, int a, int b){
		Solution.n =  n;
		Solution.m = m;
		Solution.a = a;
		Solution.b = b;
	}
	
	public void Result() {
		//System.out.println(n+" "+m+" "+a+" "+b);
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
