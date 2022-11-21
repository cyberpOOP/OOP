package lab4;

import java.util.Comparator;

public class SortColor implements Comparator<Furniture> {

	public int compare(Furniture obj1, Furniture obj2) {
		return obj1.getcolor().compareTo(obj2.getcolor());
	}
}
