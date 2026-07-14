package DSApackage;

import DSApackage.Program1.Program2;
import DSApackage.Program11.Program12;

class Program11 {
	int a;
	static class Program12 {
		int b;
		void disp2() {
			System.out.println("insisde p2");
		}
	}
	void disp1() {
		Program12 p2 = new Program12();
		p2.b = 20;
		System.out.println("inside p2.b value: "+ p2.b);
		p2.disp2();
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		Program12 p2 = new Program12();
		p2.disp2();
		Program11 p1 = new Program11();
		p1.disp1();
		

	}

}
