package DSApackage;

class Jio {
	String name;
	int plan;
	int validity;
	
	Jio(String name) {
		this.name = name;
		System.out.println(name);
	}
	Jio(String name,int plan) {
		this(name,299,28);
	}
	Jio(String name,int plan,int validity) {
		this.name = name;
		this.plan = plan;
		this.validity = validity;
	}
    void display() {
    	System.out.println(plan+" "+validity+" "+name);
    }
}

public class UsingThis {

	public static void main(String[] args) {
		Jio j1 = new Jio("99494933");
		j1.display();

	}

}
