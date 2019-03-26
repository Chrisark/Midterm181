package pkgShape;

import java.util.Comparator;

public class Rectangle extends Shape implements Comparable<Object> {
	private int iWidth;
	private int iLength;

	public Rectangle(int iWidth, int iLength) {
		this.iWidth = iWidth;
		this.iLength = iLength;
		
		
		//throws an IllegalArgumentException if the width of length is equal to or less than 0.
		if(iWidth <= 0 || iLength <= 0) {
			throw new IllegalArgumentException();
		}
	}

	//gets the width of the rectangle
	public int getiWidth() {
		return iWidth;
	}
	
	//sets the width of the rectangle
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	//gets the length of the rectangle
	public int getiLength() {
		return iLength;
	}

	//sets the length of the rectangle
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	//finds the area of the rectangle
	@Override
	public double area() {
		return (iWidth * iLength);
	}
	
	//finds the perimeter of the rectangle
	@Override
	public double perimeter() {
		return (2 * iLength + 2 * iWidth);
	}
	
	//compares the areas of two rectangles and sorts them in ascending order
	@Override
	public int compareTo(Object obj) {
		Rectangle r = (Rectangle) obj;
		return (int) (this.area() - r.area());
	}
}
