package lab4;

import java.util.Comparator;

public class SortWidth implements Comparator<Furniture> {

	public int compare(Furniture obj1, Furniture obj2) {
		return obj1.getwidth() - obj2.getwidth();
	}
}