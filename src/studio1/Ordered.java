package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		boolean xy = x>y;
		boolean yz = y>z;
		boolean finale = xy&&yz;



		boolean yx = y>x;
		boolean zy = z>y;
		boolean finale2 = yx&&zy;


		boolean finale3 = finale||finale2;
		System.out.println("Ascending or descending order? " + finale3);




	}

}
