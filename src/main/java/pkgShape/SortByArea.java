package pkgShape;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid>{
		
		public SortByArea() {

		}
		
		@Override
		public int compare(Cuboid a, Cuboid b) {
			return (int) (a.area() - b.area());
		}
}


