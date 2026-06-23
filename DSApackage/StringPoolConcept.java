package DSApackage;

public class StringPoolConcept {

	public static void main(String[] args) {
//		String s1 = "ram";
//		String s2 = "ram";
//		
//		if(s1==s2) {
//			System.out.println("values are same");
//		} else {
//			System.out.println("values are not same");
//		}
//	
//		if(s1.equals(s2)) {
//			System.out.println("values are same");
//		} else {
//			System.out.println("values are not same");
//		}
		
		String s1 = new String("ajay");
		String s2 = new String("ajay");
		if(s1==s2) {//false because its referring address
			System.out.println("values are same");
		} else {
			System.out.println("values are not same");
		}
	
		if(s1.equals(s2)) {//true because its referring values
			System.out.println("values are same");
		} else {
			System.out.println("values are not same");
		}

	}

}
