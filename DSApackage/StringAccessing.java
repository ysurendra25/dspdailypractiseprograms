package DSApackage;

public class StringAccessing {

	public static void main(String[] args) {
		String s1 = "abcdefghijkl";
		char part[] = s1.toCharArray();
		
		for(char ss:part) {
			System.out.print(ss+"");
		}
		System.out.println();
		String s3 = new String("kodnest");
		String s4 = "kodnest";
		String ss9 = "kodnest";
		StringBuffer s5 = new StringBuffer("kodnest");
		if(s3.equals(s4)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		String ss1 = s3.concat("technologies");
		s4.concat("technologies");
		s5.append("techonlogies");
		ss9 = ss9+s3;
		
		System.out.println(ss1);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(ss9);
		
		
		String ts1 = "ram";
		String ts2 = "bheem";
		
		ts1 = ts1+ts2;
		System.out.println(ts1);
		
		if(s3.equals(s5)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		

	}

}
