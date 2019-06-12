package coreJava;

public class String_Sample {
	public static void main(String[] args) {
		String name = "Selenium";
		System.out.println(name);

		String name1;
		name1 = "Automation Tool";
		System.out.println(name1);

		// concatinating
		System.out.println(name + " " + name1);

		String abc = "abc123";
		String xyz = "ABC123";
		// validate abc & xyz strings are equal or not?
		if (abc.equals(xyz)) {
			System.out.println("Both the Strings are equal");
		} else {
			System.out.println("Both the Strings are NOT equal");
		}
		
		
		if (abc.equalsIgnoreCase(xyz)) {
			System.out.println("Both the Strings are equal");
		} else {
			System.out.println("Both the Strings are NOT equal");
		}
		
		String bcd = "Chandra sekhar raju uvndi";
		if (bcd.contains("raju")) {
			System.out.println("name contains RAJU text");
		}else {
			System.out.println("name doesn't contains RAJU text");
			
		}
		

	}

}
