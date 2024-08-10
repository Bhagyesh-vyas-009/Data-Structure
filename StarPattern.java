/*

*****
 ***
  *
*/

import java.util.*;

class StarPattern 
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int n;

            System.out.print("Enter number of rows : ");
            n=sc.nextInt();

            for(int i=0;i<=n-1;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=0;k<=n-1-i;k++)
                {
                    System.out.print("*"+" "); 
                }
                 System.out.println(" ");
            }
            
    }
}