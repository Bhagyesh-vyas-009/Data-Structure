import java.util.*;

class Arrpri
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int arr[]=new int[10];
        System.out.print("Enter number of elements : ");
        n=sc.nextInt();
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}