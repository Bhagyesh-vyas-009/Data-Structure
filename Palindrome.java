import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rv=0,ri,temp=0;

        System.out.print("Enter Number :");
        n=sc.nextInt();

        temp=n;

        while(n>0)
        {
            ri=n%10;
            rv=rv*10+ri;
            n=n/10;
        }

        if(temp==rv)
        {
            System.out.print("Number is Palindrome");
        }
        else
        {
            System.out.print("Number is not Palindrome");
        }
        
    }

}