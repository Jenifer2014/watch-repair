package add_numbers;

import java.util.Scanner;

public class calculate_oprator {

	public static void main(String[] args) {
		double n1,n2;
		
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter first number : ");
		n1=scr.nextDouble();
		
		System.out.println("Enter Second number : ");
		n2=scr.nextDouble();
		
		System.out.println("Enter operator(+,-,*,/)  : " ); 
		char operator=scr.next().charAt(0);
		
		scr.close();
		double output = 0;
		
		
		switch(operator)
		{
		case '+' :
			output=n1+n2;
			break;
		case '-' :
			output=n1-n2;
			break;	
		case '*' :
			output=n1*n2;
			break;	
		case '/' :
			output=n1/n2;
			break;	
			
		default :
			System.out.println("Entered wrong operaot");
		}
		
		System.out.println(n1+" "+operator+n2+"  = "+ output+" ");
		
	}

}
