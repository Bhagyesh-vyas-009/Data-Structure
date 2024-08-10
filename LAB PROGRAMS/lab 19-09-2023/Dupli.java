import java.util.*;
public class Dupli {

    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length : ");
        int a[]=new int[sc.nextInt()];
        int n=a.length;
        boolean f=false;

        System.out.println(" Enter Elements  : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int x=0;x<a.length;)
        {
            for(int i=x+1;i<a.length;i++)
            {
                if(a[x]==a[i])
                {
                    System.out.println("Duplicate found index ="+(i) );
                    f=true;
                    break;
                }
            }
            x++;
        }
        if(!f)
        {
            System.out.println("Not contains duplicate value");
        }
    }
}
