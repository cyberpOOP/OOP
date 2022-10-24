package lab3;

import java.util.Scanner;

/* IO-03 Haidysh Vlad
 * C3=2  String
 * C17= 16
 * In each word of the given text, delete all previous occurrences of the last letter of that word.
 */

public class Lab3 {
	public static void main(String[] args) {
		Scanner txt= new Scanner(System.in);
		System.out.print("Your Text: ");
		String text = txt.nextLine();
		String delimeter = " ";
		String[] arr = text.split(delimeter);
		String temp;
		String[] t;
		int S;
		txt.close();
		
		System.out.println("Text after an operation:");
		for(int i=0; i<arr.length; i++)
		{
			temp=arr[i];
			S = temp.length();
			t = temp.split("");
			char last=temp.charAt(S-1);
			for(int j=0; j<S; j++)
			{
				char b=temp.charAt(j);
				if(b==last && j!=S-1) 
				{
					t[j]="";
				}
			System.out.print(t[j]);
			}
			System.out.print(" ");
		}
	}
}
