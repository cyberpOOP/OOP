package lab1;
import java.util.Scanner;

public class Reading {
	static int n, m, a, b;
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.print("Write an upper edge n:");
		n = num.nextInt();
		System.out.print("Write an upper edge m:");
		m = num.nextInt();
		System.out.print("Write an lower edge a:");
		a = num.nextInt();
		System.out.print("Write an lower edge b:");
		b = num.nextInt();
		
		if(n < a) {
			System.out.println("n < a!");
			while(n<a) {
				System.out.println("Wrtie new n > a");
				n = num.nextInt();
			}
				
		}
		if(m < b) {
			System.out.println("m < b!");
			while(m<b) {
				System.out.println("Wrtie new m > a");
				m = num.nextInt();
			}
				
		}
		
		num.close();
		
		Solution S = new Solution(n, m, a, b);
		S.Result();
	}
}
