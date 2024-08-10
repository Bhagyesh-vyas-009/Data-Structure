import java.util.*;

public class Q3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array1: ");
       
        int[] a = new int[sc.nextInt()];
        System.out.println("Enter elements of array1 : ");

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        
       System.out.println("Enter size of array2: ");
        int[] b = new int[sc.nextInt()];
        System.out.println("Enter elements of array2 : ");

        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
       
 
        int[] c = new int[((a.length) + (b.length))];
        int i=0;

            for(int j=0;j<a.length;j++)
            {
                c[i]=a[j];
                i++;
            }
            for(int k=0;k<b.length;k++)
            {
                c[i]=b[k];
                i++;
            }
        System.out.println("Merged Array : ");
            for(i=0;i<c.length;i++)
            {
                System.out.println(c[i]);
            }

    }    
}
