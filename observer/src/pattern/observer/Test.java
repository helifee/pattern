package pattern.observer;


public class Test {

	public static void main(String[] args) {
		House h = new House(3000f);
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		h.addObserver(p1);
		h.addObserver(p2);
		h.addObserver(p3);
		h.setPrice(5000f);
	}

}
