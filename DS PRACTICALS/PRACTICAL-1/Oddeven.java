// Odd even using bitwise Operator
class Oddeven
{
	public static void main(String[] args)
	{
		int n=3;
		if((n & 1)==0)
		{
			System.out.print("Even");
		}
		else
		{
			System.out.print("Odd");
		}
	}
}