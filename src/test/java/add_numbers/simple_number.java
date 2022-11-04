package add_numbers;

public class simple_number {
	int num =30;
	int num1=5;
	
	public void Sum()
	{
		int sum=num+num1;
		System.out.println("Addition of 2 numbers: "+sum);
	}
	public void Sub()
	{
		int sub=num-num1;
		System.out.println("Subrations of 2 numbers: "+sub);
	}
	
	public void Mul()
	{
		int mul=num*num1;
		System.out.println("Multiplication of 2 numbers: "+mul);
	}
	public void div()
	{
		int div1=num/num1;
		System.out.println("Divisions of 2 numbers: "+div1);
	}
	
	public static void main(String[] args) {
		
		simple_number sn=new simple_number();
		sn.Sum();
		sn.Sub();
		sn.Mul();
		sn.div();
	}

}
