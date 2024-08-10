import java.util.*;
public class Smallposi
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int n;
        int s=0; 
        int index=0;
        System.out.print("Enter number of elements : ");
        n=sc.nextInt();

        System.out.print(" Enter Elements  : ");
        for(int i=0;i<n;i++)
        {
            
            a[i]=sc.nextInt();
            s=a[0];
            if(a[i]<s)
            {
                // s=i;
                s=a[i];
                index=i;
            }
            
        }
        
        System.out.println("Positon of Smallest number = "+index);
        // System.out.println("Positon of Smallest number = "+s);
    }
}