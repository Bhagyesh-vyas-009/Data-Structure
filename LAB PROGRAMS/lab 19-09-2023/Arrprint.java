import java.util.*;
class Arrprint
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int n;
        System.out.print("Enter number of elements : ");
        n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
         System.out.println("Elements are : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
}