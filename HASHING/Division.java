import java.util.Scanner;

class Division
{
    public int findprime(int inputnum)
    {
        if(inputnum%2==0)
            inputnum++;
        while(isPrime(inputnum)==false)
            inputnum+=2;
        return 0;
    }
    public boolean isPrime(int inputnum)
    {
        if(inputnum<=1)
        {
            return false;
        }
        for(int i=2;i<inputnum/2;i++)
        {
            if(inputnum%2==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size=sc.nextInt();
        int arr[]=new int[];
    }
}