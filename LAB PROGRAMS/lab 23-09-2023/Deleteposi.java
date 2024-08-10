import java.util.Scanner;

public class Deleteposi 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements: ");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter position to replace to delete element : ");
        int pos = sc.nextInt();
    
     
        for(int i=pos;i<=n-1;i++)
        {
            a[i-1]=a[i];
    
        }
        System.out.println("Array after deletion : ");
        for(int i=0;i<n-1;i++)
        {
            System.out.print(a[i]+" ");
        }
   
    }
}
