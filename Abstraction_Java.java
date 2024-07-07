package AbstractClass;

interface a {
	void method1();
}

interface b extends a {
	void method2();
}

class c implements b {
	public void method1() {
		System.out.println("A extends b");
	}

	public void method2() {
		System.out.println("B implements C");
	}
}

public class Abstraction_Java {

	public static void main(String[] args) {
		Abstraction_Java a1 = new Abstraction_Java();
		a1.method1();
		a1.method2();
	}

	private void method2() {
		System.out.println("Method 2");
	}

	private void method1() {
		System.out.println("Method 1");

	}
}
