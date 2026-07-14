package DSApackage;

abstract class Program41 {
	abstract void disp1();
	abstract void disp2();
}

public class AbstractInnerClass {
	public static void main(String[] args) {
		Program41 p1 = new Program41() {
			void disp1() {
				System.out.println("iam inside anonymous inner class");
			}
			void disp2() {
				System.out.println("iam disp2");
			}
		};
		
		p1.disp1();
		p1.disp2();
	}

}
