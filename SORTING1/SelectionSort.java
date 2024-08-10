import java.util.*;
class SelectionSort
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // int arr[]={10,2,3,5,1};

        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int smallest;
        for(int i=0;i<n-1;i++)
        {
            smallest=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }  
        
        System.out.print("Sorted Array : ");
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}