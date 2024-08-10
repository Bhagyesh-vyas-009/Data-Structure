import java.util.*;
class Vovel
{
	public static void main(String[] args)
	{
		char ch;
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter Character :");
			ch=sc.next().charAt(0);

			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch==' ')
			{
				System.out.print("Vowel");
			}
			else
			{
				System.out.print("Constant");
			}
		
	}
}