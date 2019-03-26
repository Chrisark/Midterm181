package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboidTest {

	//tests to see if the cuboids are sorted in correct order by area.
	@Test
	public void sortByAreaTest() {
		pkgShape.Cuboid cuboid1 = new pkgShape.Cuboid(10, 12, 15);
		pkgShape.Cuboid cuboid2 = new pkgShape.Cuboid(11, 13, 16);
		pkgShape.SortByArea tester = new pkgShape.SortByArea();
		
		boolean assertion = false;
		
		if(tester.compare(cuboid2, cuboid1) > 0) 
			assertion = true;
		
		assertTrue(assertion);
	}
	
	//tests to see if the cuboids are sorted in correct order by volume.
	@Test
	public void sortByVolumeTest() {
		pkgShape.Cuboid cuboid1 = new pkgShape.Cuboid(10, 12, 15);
		pkgShape.Cuboid cuboid2 = new pkgShape.Cuboid(11, 13, 16);
		pkgShape.SortByVolume tester = new pkgShape.SortByVolume();
		
		boolean assertion = false;
		
		if(tester.compare(cuboid2, cuboid1) > 0) 
			assertion = true;
		
		assertTrue(assertion);
	}
	
	//tests to see if the constructor and getters are implemented properly
	@Test
	public void constructorAndGetterTest() {
		pkgShape.Cuboid test1 = new pkgShape.Cuboid(10, 12, 15);
		boolean assertion = false;
		
		if(test1.getiDepth() == 10 && test1.getiWidth() == 15 
				&& test1.getiLength() == 12)
			assertion = true;
		
		assertTrue(assertion);
	}
	
	//tests to see if the setters for cuboid works properly
	@Test
	public void getterAndSetterTest() {
		pkgShape.Cuboid test1 = new pkgShape.Cuboid(1,1,1);
		boolean assertion1 = false;
 
		test1.setiLength(10);
		test1.setiWidth(20);
		test1.setiDepth(30);

		if(test1.getiLength() == 10 && test1.getiWidth() == 20
				&& test1.getiDepth() == 30)
			assertion1 = true;
		
		assertTrue(assertion1);
		
	}
	
	//tests to see if the surface area for cuboid works properly
	@Test
	public void surfaceAreaTest() {
		pkgShape.Cuboid test1 = new pkgShape.Cuboid(8,5,6);
		boolean assertion = false;
		
		if(test1.area() == 236) {
			assertion = true;
		}
		assertTrue(assertion);
			
	}
	
	//tests to see if the volume for cuboid works properly
	public void volumeTest() {
		pkgShape.Cuboid test1 = new pkgShape.Cuboid(5,8,13);
		boolean assertion = false;
		
		if(test1.volume() == 520) {
			assertion = true;
		}
		assertTrue(assertion);
	}
	
	//tests to see if the perimeter for cuboid works properly
	public void perimeterTest() {
		pkgShape.Cuboid test1 = new pkgShape.Cuboid(1,2,3);
		boolean assertion = false;
		
		if(test1.volume() == 24) {
			assertion = true;
		}
		assertTrue(assertion);
	
	}
	
	//tests to see if the IllegalArgumentException is thrown properly.
	@Test(expected = IllegalArgumentException.class)
	public void exceptionTest() {
		pkgShape.Cuboid test1 = new pkgShape.Cuboid(-10, 12, 15);
	}

}
