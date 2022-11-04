package add_numbers;

import java.util.Scanner;

public class two_number_usingscanner {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("Enter Firt Value");
		int n1=src.nextInt();
		
		
		
		System.out.println("Enter sencond Value");
		int n2=src.nextInt();
		
		
		src.close();
		System.out.println("  ");
		
		int sum=n1+n2;
		System.out.println(sum);

	}

}
