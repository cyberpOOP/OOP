package lab4;

public class Furniture{
	private String type; 
	private String color; 
	private int heigh;
	private int length;
	private int width;
	
	public Furniture(String t, String c, int h, int l, int w) {
		this.type = t;
		this.color = c;
		this.heigh = h;
		this.length = l;
		this.width = w;
	}
	
	public String gettype() {
		return this.type;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public int getheigh() {
		return this.heigh;
	}
	
	public int getlength() {
		return this.length;
	}
	
	public int getwidth() {
		return this.width;
	}
}