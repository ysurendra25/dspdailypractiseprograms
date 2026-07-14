package DSApackage;



class Program1 {
	int a; 
	class Program2 {
		int b;
		public void disp1() {
			System.out.println("program2 disp");
		}
	}
	void disp2() {
		Program2 p2 = new Program2();
		p2.b= 10;
		a = 10;
		System.out.println("program1 A value:"+a);
		System.out.println("program2 B value: "+p2.b);
		p2.disp1();
	}
}



public class MemberInnerClass {

	public static void main(String[] args) {
		Program1 p1 = new Program1();
		p1.disp2();
		Program1.Program2 p = p1.new Program2();
		p.disp1();
		
		
		

	}

}
