package DSApackage;

class Program31 {
	int a=10;
	void disp1() {
		class Program32 {
			int b = 20;
			void disp2() {
				System.out.println("inside p2");
				System.out.println(a);
				System.out.println(b);
			}
		}
		Program32 p2 = new Program32();
		p2.disp2();
	}
	
}

public class LocalInnerClass {

	public static void main(String[] args) {
          Program31 p1 = new Program31();
          p1.disp1();
          

	}

}
