package pkgShape;

import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid>{
	
	public SortByVolume() {

	}
	
	@Override
	public int compare(Cuboid a, Cuboid b) {
		return (int) (a.area() - b.area());
	}

}
