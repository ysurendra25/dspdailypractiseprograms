package DSApackage;

public class StringInbuiltMethods {
    public static void main(String[] args) {
    	String s1 = "ram";
    	String s2 = "bheem";
    	
    	System.out.println(s1.toUpperCase());
    	System.out.println(s2.contains("bh"));
    	System.out.println(s1.concat(" "+s2));
    	System.out.println(s2.charAt(2));
    	System.out.println(s2.indexOf("m"));
    	System.out.println(s2.length());
    	System.out.println(s2.startsWith("bh"));
    	System.out.println(s2.endsWith("em"));
    	
    	String s3 = "";
    	String s4 = " ";
    	System.out.println(s3.isBlank());
    	System.out.println(s4.isEmpty());
    	
    }
}
