//Power of n using recursion

import java.util.*;
class Rpow
{
    public static void main(String[] args)
    {
        int n,p;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        n=sc.nextInt();

        
        System.out.print("Enter power : ");
        p=sc.nextInt();

        int res=Powofn(n,p);
        System.out.print("Result = "+res);
    }

    public static int Powofn(int n,int p)
    {
        if(p==0)
        {
            return 1;
        }

        return (n*Powofn(n,p-1));
    }

}