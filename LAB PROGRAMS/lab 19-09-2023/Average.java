import java.util.*;
public class Average 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int n,sum=0;
        double avg=0;
        System.out.print("Enter number of elements : ");
        n=sc.nextInt();

        System.out.print(" Enter Elements  : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            avg=sum/n;
        }
        System.out.println("Average  of elements: "+avg);
    }    
}
