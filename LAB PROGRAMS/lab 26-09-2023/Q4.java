import java.util.*;

public class Q4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int r1,c1,r2,c2;

        System.out.print("Enter number of rows in first matrix : ");
        r1=sc.nextInt();

        System.out.print("Enter number of columns in first matrix : ");
        c1=sc.nextInt();

        System.out.print("Enter number of rows in second matrix : ");
        r2=sc.nextInt();

        System.out.print("Enter number of columns in second matrix : ");
        c2=sc.nextInt();

        if(q==m)
        {
            int a[][]=new int[r1][c1];
            int b[][]=new int[r2][n];
            int c[][]=new int[r1][c2];

            System.out.println("Enter elements in first matrix :");
            
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }

            System.out.println("Enter elements in second matrix :");
            
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
        
        
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c2;k++)
                    {
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            }

            System.out.println("Matrix after Adition : ");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(c[i][j]+" ");

                }
                System.out.println("");
            }

        }
        else
        {
            System.out.println("Matrix multiplication not possible");
        }


    }
}
    

