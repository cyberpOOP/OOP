package lab6;

import java.util.Scanner;

public class Range {
	private Armor[] InRange;
	
	public Range(Armor[] Array) {
		Scanner Number = new Scanner(System.in);
		System.out.println("Put price range:");
		int lower = Number.nextInt();
		int upper = Number.nextInt();
		while(upper < lower) {
			System.out.println("Put correct upper range");
			upper = Number.nextInt();
		}
		//System.out.println("Range: "+lower+"-"+upper);
		Number.close();
		
		Armor[] Range = new Armor[Array.length];
		System.out.println();
		
		int j=0;
		for(int i=0; i<Array.length; i++) {
			if(Array[i].GetPrice()>lower && Array[i].GetPrice()<upper) {
				Range[j] = Array[i];
				j+=1;
			}
		}
		
		Armor[] NewRange = new Armor[j];
		
		for(int i=0; i<j; i++) {
			NewRange[i] = Range[i];
		}
		
		this.InRange = NewRange;	
		System.out.println("Ammunition in range "+lower+"-"+upper+":");
	}
	
	public Armor[] GetAmunition() {
		return this.InRange;
	}
}
