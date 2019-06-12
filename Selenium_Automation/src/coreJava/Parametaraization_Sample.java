package coreJava;

public class Parametaraization_Sample {

	// add two numbers
	public static void add() {
		int a = 90;
		int b = 80;
		int c;

		c = a + b;

		System.out.println(c);
	}

	public static void add(int a, int b) {
		// int a =90;
		// int b =80;
		int c;

		c = a + b;

		System.out.println(c);
	}

	public static void main(String[] args) {
		add();
		add(87, 96);
		add(23, 51);

	}

}
