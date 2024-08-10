import java.util.*;
class InsertionSort
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.print("Enter array elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=1; i<arr.length; i++) 
        {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) 
            {
                //Keep swapping
                arr[j+1] = arr[j];
                j--;
            }
                arr[j+1] = current;
        }
            
        

        System.out.println("Sorted Array = ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}