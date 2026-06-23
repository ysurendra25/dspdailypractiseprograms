package DSApackage;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		java.util.List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(200);
		l1.add(300);
		
		Iterator<Integer> i1 = l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
