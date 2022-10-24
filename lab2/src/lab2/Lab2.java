package lab2;

import java.util.Scanner;

/* IO-03 Haidysh Vlad
 * C5=0
 * C7=4
 * C11=8
 */

public class Lab2 {

	private final static int a = 5;
	private static long B[][];
	private static long C[][];
	private static double F[];
	private static int n;
	private static int m;
	private static long temp = 0;
	
	private static Scanner num = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scan();
		//System.out.println(n+" "+m);
		
		B = new long[n][m];
		C = new long[n][m];
		F = new double[n];
		
		Randomizer();
		Operation();
		
	}
	
	private static void Scan() {
		System.out.print("Input n: ");
		n = num.nextInt();
		System.out.print("Input m: ");
		m = num.nextInt();
		
		if(n==0)
			while(n==0) {
				System.out.print("Write n>0 ");
				n = num.nextInt();
			}
		if(m==0)
			while(m==0) {
				System.out.print("Write m>0 ");
				m = num.nextInt();
			}
			
		num.close();
	}
	
	private static void Randomizer() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				B[i][j] = (long)(Math.random() * 100);
			}
		}
	}
	
	private static void Operation() {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				C[i][j] = (long)a * B[i][j];
			}
		}
		for(int i=0; i<n; i++) {
			temp = 0;
			for(int j=0; j<m; j++) {
				temp += C[i][j];
			}
			F[i] = (double)temp/m;
		}
		System.out.println();
		Result();	
	}
	
	private static void Result() {
		System.out.print("Matrix C:");
		for(int i=0; i<n; i++) {
			System.out.println();
			for(int j=0; j<m; j++) {
				System.out.print(C[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("The average value of the elements of each row of the matrix C:");
		for(int i=0; i<n; i++)
			System.out.print(F[i]+" ");
	}
}