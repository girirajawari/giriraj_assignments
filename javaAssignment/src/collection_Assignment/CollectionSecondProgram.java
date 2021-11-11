package collection_Assignment;

import java.util.HashSet;
import java.util.Set;

public class CollectionSecondProgram {

	public static void main(String[] args) {
		Set<Object> hs=new HashSet<>();
		hs.add(-5);
		hs.add(800);
		hs.add(null);
		hs.add("hello naveen");
		hs.add(0);
		hs.add(76);
		hs.add(-40);
		hs.add(-5); //will be neglected for being duplicate
		hs.add("Bye");
		hs.add("3.14");
		
		System.out.println(hs);
	}
}

