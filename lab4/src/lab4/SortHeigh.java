package lab4;

import java.util.Comparator;


public class SortHeigh implements Comparator<Furniture> {

	public int compare(Furniture obj1, Furniture obj2) {
		return obj1.getheigh() - obj2.getheigh();
	}
}
