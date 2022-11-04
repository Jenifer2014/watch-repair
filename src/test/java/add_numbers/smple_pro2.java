package add_numbers;

import java.util.Scanner;

public class smple_pro2 {

	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter  the first value:");
		
		int no=scr.nextInt();
		System.out.println("Enter  the second value:");
		int no1=scr.nextInt();
		
		int sum=no+no1;
		System.out.println(sum);
		System.out.println("Enter  String value:");
		String st=scr.next();
		
	}

}
