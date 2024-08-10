import java.util.*;
class BinarySearch
{
    public static int BinarySearchEle(int a[],int key)
    {
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
    
            if(a[mid]==key)
            {
                return mid;
            }
            else if(key<a[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter Sorted array : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        // int a[]={1,5,6,7,20};

        System.out.print("Enter key to serach in array : ");
        int key=sc.nextInt();

        // int key=20;

        int result=BinarySearchEle(a, key);
        System.out.print((result!=-1)?"Element found at index no : "+result:"Element not found");
    }
}