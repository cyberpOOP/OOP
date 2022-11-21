package lab5;

import java.util.Scanner;

public class lab5{
	
	public static void main(String[] args) {
		
		Scanner txt = new Scanner(System.in);
		System.out.println("Your text:");
		String temp = txt.nextLine();
		txt.close();
		
		Text text = new Text(temp);
		String[] words = text.GetWords();
		Punctuation punc = new Punctuation();
		
		for(int i=0; i<words.length; i++) {
			punc.Punc(words[i]);
		}
		
		punc.GetText();
		
	}	
}