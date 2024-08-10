import java.util.*;

class PrimeFunction
{
    void pfunction(int n)
    {
        boolean flag=false;

        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.print(n+" is Composite");
                flag=true;
                break;
            }
            
            
        }
        if(flag==false)
        {
            System.out.print(n+" is Prime");
        }
    }
}

public class PrimeDemo 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        PrimeFunction p=new PrimeFunction();

        System.out.print("Enter number : ");

        int num=sc.nextInt();

        

        p.pfunction(num);

    }
   

}
