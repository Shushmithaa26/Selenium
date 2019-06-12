package coreJava;

public class PrintNumbers {

	public static void main(String[] args) {
		// print 1 to 5 numbers

		int i = 7;
		
		while (i < 6) {
			System.out.println(i);
			i++;
		}
		System.out.println("out  side while loop");

		
		
		do {
			System.out.println(i);
			i++;
		} while (i < 6);
		System.out.println("out  side do while loop");
	}

}
