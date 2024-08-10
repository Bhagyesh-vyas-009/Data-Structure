import java.util.*;
class Powofn
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n,p,res=1;

        System.out.print("Enter number :");
        n=sc.nextInt();

        System.out.print("Enter power :");
        p=sc.nextInt();

        for(int i=1;i<=p;i++)
        {
            res=res*n;
        }

        System.out.print("Result = " +res);

    }
}