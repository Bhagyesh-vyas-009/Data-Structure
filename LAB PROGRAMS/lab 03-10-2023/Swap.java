import java.util.*;
class Swap
{
   static int a;
   static int b;

    public static void swap()
    {
        a=a^b;
        b=b^a;
        a=a^b;
        

        // int temp=a;
        // a=b;
        // b=temp;

        // System.out.println("Using swap A= "+a+" B= "+b);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        a=sc.nextInt();

        
        System.out.print("Enter number 2 : ");
        b=sc.nextInt();

        

        swap();

        System.out.println("A = "+a+" B = "+b);

    }
}