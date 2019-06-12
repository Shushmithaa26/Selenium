package coreJava;

import java.io.File;
import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner mahesh = new Scanner(System.in);//system.in = console area
		
		int a;
		int b;
		int c;
		
		System.out.println("Enter a & b values.....");
		
		a = mahesh.nextInt();//when user enter any number from console the first value will go to a, second value will go to b
		b = mahesh.nextInt();
		
		c= a+b;
		
		System.out.println(c);
		
	}

}
