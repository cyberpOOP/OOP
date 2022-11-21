package lab4;

import java.util.Arrays;
/*
 * 305%11=8
 * Define the furniture class, which consists of at least 5 fields.
 */

/*
 * An executive class in which an array of objects of the Furniture class is specified
 * The class sorts the array by one of the fields in descending or ascending order
 * 
 * Packege: lab4.Furniture
 * 			lab4.sortlength
 * 			lab4.sortwidth
 * 			lab4.sortheigh
 * 			lab4.sortcolor
 * 			lab4.sorType
 *
*/

public class lab4 {
	public static void main(String[] args) {
		Furniture table1 = new Furniture("table", "brown", 74, 150, 75);
		Furniture table2 = new Furniture("table", "darkoak", 76, 140, 80);
		Furniture table3 = new Furniture("table", "white", 75, 190, 80);
		Furniture chair1 = new Furniture("chair", "lightbirch", 84, 56, 74);
		Furniture chair2 = new Furniture("chair", "red", 120, 42, 55);
		Furniture chair3 = new Furniture("chair", "black", 95, 46, 52);
		Furniture[] Array = { table1, table2, table3, chair1, chair2, chair3 };

		Arrays.sort(Array, new SortLength().reversed());
		System.out.print("Sorting by length:");// by decline
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i].getlength() + " ");
		}

		System.out.println();
		Arrays.sort(Array, new SortWidth());
		System.out.print("Sorting by width:");// by growth
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i].getwidth() + " ");
		}

		System.out.println();
		Arrays.sort(Array, new SortHeigh());
		System.out.print("Sorting by height:");// by growth
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i].getheigh() + " ");
		}

		System.out.println();
		Arrays.sort(Array, new SortColor());
		System.out.print("Sorting by color:");// by growth
		for (int i = 0; i < Array.length; i++) {
			System.out.print(" " + Array[i].getcolor());
		}

		System.out.println();
		Arrays.sort(Array, new SortType());
		System.out.print("Sorting by type:");// by decline
		for (int i = 0; i < Array.length; i++) {
			System.out.print(" " + Array[i].gettype());
		}

	}
}
