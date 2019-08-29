package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String n1 = ap.nextString("Name of Person 1");
		String n2 = ap.nextString("Name of Person 2");
		String n3 = ap.nextString("Name of Person 3");
		String n4 = ap.nextString("Name of Person 4");
		//
		// Say hello to the names in s0 through s3.
		//
	System.out.println("Suh " + n1 + ", " + n2 + ", " + n3 + ", and " + n4 );
	}
}
