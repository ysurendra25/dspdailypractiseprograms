package DSApackage;

interface program51 {
	int disp1(int a);
}

public class LamdaExpression {

	public static void main(String[] args) {
		program51 p1 = (int a)->{
			return a;
		};
		System.out.println(p1.disp1(10));

	}

}
