import java.util.*;
class RFact
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter Number :");
			num=sc.nextInt();

			int f= factorial(num);
			System.out.print("Factorial of "+num +" = "+f);
	}
	public  static int factorial(int num)
	{
		if(num==1)
		{	
			return 1;
		}
		return num * factorial(num-1);
	}
}