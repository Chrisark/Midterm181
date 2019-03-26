package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;


public class RectangleTest {
	
	//Tests to see if the constructor and getters work properly
	@Test
	public void constructorAndGetterTest() {
		pkgShape.Rectangle test1 = new pkgShape.Rectangle(20, 10);
		boolean assertion = false;
		
		if(test1.getiLength() == 10 && test1.getiWidth() == 20)
			assertion = true;
		
		assertTrue(assertion);
	}
	
	//Tests to see if the setters worked properly
	@Test
	public void getterAndSetterTest() {
		pkgShape.Rectangle test1 = new pkgShape.Rectangle(1,1);
		boolean assertion1 = false;
 
		test1.setiLength(10);
		test1.setiWidth(20);

		if(test1.getiLength() == 10 && test1.getiWidth() == 20)
			assertion1 = true;
		
		assertTrue(assertion1);
		
	}
	
	//Tests to find the area of a rectangle
	@Test
	public void AreaTest() {
		pkgShape.Rectangle test1 = new pkgShape.Rectangle(2,2);
		boolean assertion = false;
		
		if(test1.area() == 4) {
			assertion = true;
		}
		assertTrue(assertion);
			
	}
	
	
	//Tests to find the perimeter of a rectangle
	@Test
	public void PerimeterTest() {
		pkgShape.Rectangle test1 = new pkgShape.Rectangle(2,2);
		boolean assertion = false;
		
		if(test1.perimeter() == 8) {
			assertion = true;
		}
		assertTrue(assertion);
			
	}
	
	//Checks to see if an IllegalArgumentException occurred
	
	@Test(expected = IllegalArgumentException.class)
	public void exceptionTest1() {
		pkgShape.Rectangle test1 = new pkgShape.Rectangle(-10, 12);
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void exceptionTest2() {
		pkgShape.Rectangle test2 = new pkgShape.Rectangle(10, -12);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void exceptionTest3() {
	pkgShape.Rectangle test3 = new pkgShape.Rectangle(-10, -12);
	
	}
	
	//Tests to see if the rectanlges are sorted in correct order
	@Test
	public void compareToTest() {
		pkgShape.Rectangle rec1 = new pkgShape.Rectangle(2, 2);
		pkgShape.Rectangle rec2 = new pkgShape.Rectangle(4, 6);
		boolean assertion = false;
		
		if(rec1.compareTo(rec2) == -20) {
			 assertion = true;
			
		}
		 assertTrue(assertion);
	}

}
