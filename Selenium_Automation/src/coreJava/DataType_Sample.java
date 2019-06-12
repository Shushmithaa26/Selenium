package coreJava;

public class DataType_Sample {
	public static void test1() {
			//boolean ae = true;	
		byte a = 87;// 127
		short c = 12;

		int b = 23;
		int g = 252345;

		long d = 345243;

		long e = a + b;
		long f = b + d;

		int h = b + g;

		System.out.println(f);

	}
	public static void test2() {
	
		char abc = 'r';
		char xyz = 'e';
		//char m = abc+xyz;
		System.out.println(abc+xyz);//215
		System.out.println(abc);//r
	}
	public static void test3() {
		boolean  a = true;
		boolean b = false;
		
		System.out.println(a);
		System.out.println(b);
		//when evere if condition has 'true' then only system will go to IF block 
		if (a) {
			System.out.println("if block has executed");
		} else {
			System.out.println("else block has executed");
		}
		
	}
	
	
	public static void main(String[] args) {
		// to store number: byte , short, int, long
		// Decimal values storage: float, double
		// Boolean: true or false
		// char: to store single charecter
//		int b = 23432;
//		 double a = 127.021;
//		 boolean test = true;
//		 char abc = 'a';

		//to comment/uncomment multi lines use 'cntl+Shift+C'
		//to comment single line put '//' infront of the line
		test1();
		test2();
		test3();
		
		
		
	}
}
