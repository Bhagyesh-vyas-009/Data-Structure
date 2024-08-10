import java.util.*;
public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
       
        int[] a = new int[sc.nextInt()];
        int n=a.length;
        System.out.println("Enter array elements in sorted manner : ");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    
        System.out.println("Enter value to delete :");
        int del = sc.nextInt();
     
        for(int i=0;i<n;i++)
        {
            if(a[i]==del)
            {
                if(i==n-1)
                {
                    break;
                }
                    for(int j=i;j<n-1;j++)
                    {
                        a[j]=a[j+1];
                    }
                    
            }
            else{
                continue;
            }

           
        }

        System.out.println("Array after insertion : ");

        for(int i=0;i<n-1;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
