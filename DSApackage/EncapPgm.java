package DSApackage;

class Book {
	private int page;
	
	public void getPage(int p1) {
		page = p1;
	}
	
	public int setpage() {
		return page;
	}
	
}

public class EncapPgm {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.getPage(11);
		System.out.println(b1.setpage());
		
	
	}

}
