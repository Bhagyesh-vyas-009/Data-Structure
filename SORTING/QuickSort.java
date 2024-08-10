import java.util.*;
class QuickSort
{
    public static int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;

                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap pivot
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void quickSort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pivx=partition(arr,low,high);

            quickSort(arr, low, pivx-1);
            quickSort(arr, pivx+1,high);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        QuickSort q=new QuickSort();
        System.out.print("Enter size of an array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.print("Enter array elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        quickSort(arr, 0, n-1);
        System.out.println("Sorted Array = ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}