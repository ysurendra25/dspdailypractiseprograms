package DSApackage;

class Fruit {
	Fruit getFruit() {
		System.out.println("returned fruit");
		return new Fruit();
	}
}
class Mango extends Fruit {
	Mango getFruit() {
		System.out.println("getting mango");
		return new Mango();
	}
}



public class CovarReturnType {
    public static void main(String []args) {
    	Fruit f1 = new Mango();
    	f1.getFruit();
    	Fruit f2 = new Fruit();
    	f2.getFruit();
    }
}
