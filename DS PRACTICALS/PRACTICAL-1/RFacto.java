import java.util.*;
class RFacto
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter Number : ");
        n=sc.nextInt();

        int f=Factorial(n);

        System.out.print("Factorial of "+n+" = "+f);
    }

    public static int Factorial(int n)
    {
            if(n==1)
            {
                return 1;
            }
            return n*Factorial(n-1);
    }
}