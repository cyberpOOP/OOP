package lab4;

import java.util.Comparator;

public class SortType implements Comparator<Furniture> {

	public int compare(Furniture obj1, Furniture obj2) {
		return obj2.gettype().compareTo(obj1.gettype());
	}
}