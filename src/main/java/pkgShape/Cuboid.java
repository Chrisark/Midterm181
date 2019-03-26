package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable<Object>{
	private int iDepth;

	public Cuboid(int iDepth, int iLength, int iWidth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
		
		//throws an IllegalArgumentExcpetion if the depth is less than or equal to 0
		if(iDepth <= 0) {
			throw new IllegalArgumentException();
		}
	}
	
	//gets the depth of the cuboid
	public int getiDepth() {
		return iDepth;
	}

	//sets the depth of the cuboid
	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	//finds the volume of the cuboid
	public double volume() {
		return (iDepth * super.getiWidth() * super.getiLength());
	}
	
	//finds the surface area of the cuboid
	@Override
	public double area() {
		return ((2 * super.getiLength() * super.getiWidth()) + 
				(2 * iDepth * super.getiLength()) + 
				(2 * iDepth * super.getiWidth()));
	}
	
	//finds the perimeter of the cuboid
	@Override
	public double perimeter() {
		return ((4 * iDepth) + (4 * super.getiWidth() + (4 * super.getiLength())));
	}
	
	//finds the areas of cuboids and sorts them in ascending order.
	@Override
	public int compareTo(Object obj) {
		Cuboid c = (Cuboid) obj;
		return (int) (this.area() - c.area());
		
	}
	
}
