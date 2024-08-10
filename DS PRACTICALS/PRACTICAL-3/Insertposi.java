import java.util.Scanner;

public class Insertposi 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] a = new int[n+1];
        System.out.println("Enter elements: ");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter position to replace: ");
        int pos = sc.nextInt();
        System.out.println("Enter value to replace:");
        int rep = sc.nextInt();
        
     
        for(int i=(n-1);i>=(pos-1);i--)
        {
            a[i+1]=a[i];
    
        }
        a[pos-1]=rep;
        System.out.println("Array after insertion : ");
        for(int i=0;i<=n;i++)
        {
            System.out.print(a[i]+" ");
        }
     
    }
}
