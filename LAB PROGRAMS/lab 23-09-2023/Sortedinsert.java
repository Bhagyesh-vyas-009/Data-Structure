import java.util.*;

public class Sortedinsert 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
       
        int[] a = new int[(sc.nextInt()+1)];
        int n=a.length;
        System.out.println("Enter array elements in sorted manner : ");

        for(int i=0;i<n-1;i++)
        {
            a[i]=sc.nextInt();
        }
    
        System.out.println("Enter value to insert:");
        int ins = sc.nextInt();
     
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<ins && a[i+1]>ins)
            {
                    for(int j=n-2;j>=i+1;j--)
                    {
                        a[j+1]=a[j];
                    }
                    a[i+1]=ins;
            }
            else{
                continue;
            }

           
        }

        System.out.println("Array after insertion : ");

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
