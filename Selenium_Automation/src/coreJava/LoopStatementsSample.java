package coreJava;

public class LoopStatementsSample {

	public static void main(String[] args) {

		// for loop
		// Nested for loop
		// while loop

		// Do-While loop
		
		//To print 1-10 numbers
		//For(initilize the value; check the condition; incriment/decriment the value)
		for (int i = 1; i<11; i++) {			
			System.out.println(i);
		}//for loop end

		//nested for loop: loop with in the loop 
		//column, row
		for (int i = 0; i <7; i++) {//row
			
			for (int j = 0; j <2; j++) {//column
				System.out.println(j+","+i);// 0, 0   1,0     0, 1   1,1   
			}//j for loop end
			
		}//i for loop end
		
		
		System.out.println("*******************");
		//while loop
		int i=1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		
		
		//initially won't do any validation, directly go inside the do loop, then only will check the condition
		//do-while
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		
	}

}
