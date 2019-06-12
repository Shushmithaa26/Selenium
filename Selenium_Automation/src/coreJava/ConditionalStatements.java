package coreJava;

public class ConditionalStatements {
	// if
	// if-else
	// if - else-if
	// nested if
	public static void main(String[] args) {
		int a = 90;
		int b = 900;
		
		if (a>b) {
			System.out.println("a is large number");
		}
		else if (b>a) {
			System.out.println("b is large number");
		} 
		else {
			System.out.println("a & b numbers are equal");
		}

		
		//nested if: if condition withre it into another if conditon
		
		if (b>a) {
			if (a<100) {
				System.out.println(" a value comes under 0 - 100 range");
			}
			if (a>=100 && a<=1000 ) {
				System.out.println(" a value comes under 100 - 1000 range");
			}
		}
		
		
	}
}
