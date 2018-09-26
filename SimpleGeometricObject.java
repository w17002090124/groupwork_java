
public class SimpleGeometricObject {
	private double side1;
	private double side2;
	private double side3;
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	public SimpleGeometricObject() {
		dateCreated = new java.util.Date();
	}
	public SimpleGeometricObject(String color,boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public SimpleGeometricObject(double side1,double side2,double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public SimpleGeometricObject(double width,double height,String color,boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3() {
		this.side3 = side3;
	}
	public double getArea() {
		double p=(side1+side2+side3)/2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	public String toString() {
		return "side1= "+side1+"side2 ="+side2+"side3="+side3 + "\ncolor: " + color + "and filled: " + filled;
	}
}
