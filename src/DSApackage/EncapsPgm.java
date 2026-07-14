package DSApackage;

class Bookk {
	 private int a=10;
	 public void setInt(int a) {
		 this.a = a;
	 }
	 public int  getInt() {
		 return a;
	 }
}

public class EncapsPgm {

	public static void main(String[] args) {
		Bookk b = new Bookk();
		b.setInt(2);
		System.out.println(b.getInt());

	}

}
