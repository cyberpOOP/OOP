package lab6;
/*
 * Determine the knight's ammunition hierarchy.
 * Equip the knight. Calculate the cost of ammunition.
 * Sort ammunition by weight.
 * Find ammunition items that match a given price range.
 */

import java.util.Arrays;

public class lab6 {
	public static void main(String[] args) {
		Helmet Helmet1 = new Helmet("Atomic-valence tri-radii-oscillator", 4065, 0.5, 4);
		Helmet Helmet2 = new Helmet("T-45d power helmet", 912, 5, 5);
		Helmet Helmet3 = new Helmet("Centurion helmet", 131, 3.5, 1);	
		Chest Chest1 = new Chest("Stealth suit 'Mark II'", 7392, 25, 14);
		Chest Chest2 = new Chest("Courier duster", 1331, 3.5, 13);
		Chest Chest3 = new Chest("T-51b power armor", 4065, 40.5, 25);
		Weapons Weapon1 = new Weapons("'Fat Man'", 10470, 15.8, 771);
		Weapons Weapon2 = new Weapons("'Medicine Stick'", 18098, 5.5, 95);
		Weapons Weapon3 = new Weapons("'Old Glory'", 1889, 8, 39);
		Heals Heal1 = new Heals("Stimpack", 7650, 0.15, 120);
		Heals Heal2 = new Heals("Slasher", 500, 0.2, 40);
		Heals Heal3 = new Heals("Psycho", 500, 0.21, 60);
		Armor[] Array = {Helmet1, Helmet2, Helmet3, 
						Chest1, Chest2, Chest3, 
						Weapon1, Weapon2, Weapon3, 
						Heal1, Heal2, Heal3};
		Armor[] Helmets = {Helmet1, Helmet2, Helmet3};
		Armor[] Chests = {Chest1, Chest2, Chest3};
		Armor[] Guns = {Weapon1, Weapon2, Weapon3};
		Armor[] Heal = {Heal1, Heal2, Heal3};
		
		Munition Knight = new Munition(Helmets, Chests, Guns, Heal);
		
		System.out.println();
		Armor[] Array1 = Knight.GetEquip();
		System.out.println("Your ammunition:");
		for(int i=0; i<4; i++) {
			System.out.println(Array1[i].GetName());
		}
		
		System.out.println();
		System.out.println("Ammunition cost:");
		Costs Sum = new Costs(Array1);
		System.out.println(Sum.GetSum());
		System.out.println();
		
		Range Money = new Range(Array);
		Armor[] Equip = Money.GetAmunition();
		for(int i=0; i<Equip.length; i++) {
			System.out.println("Name:"+Equip[i].GetName()+" Price: "+Equip[i].GetPrice());
		}
		
		
		System.out.println();
		System.out.println("Sorted by weight:");
		Arrays.sort(Array, new SortWeight().reversed());
		for(int i=0; i<Array.length; i++) {
			System.out.println("Name:"+Array[i].GetName() +", weight: " + Array[i].GetWeight());
		}
		Knight.Close();
	}
}
