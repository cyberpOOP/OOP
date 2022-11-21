package lab4;

import java.util.Comparator;

public class SortLength implements Comparator<Furniture> {

	public int compare(Furniture obj1, Furniture obj2) {
		return obj1.getlength() - obj2.getlength();
	}
}
