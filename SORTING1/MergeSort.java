
class MergeSort 
{
    public static void mergeArray(int arr[],int low,int mid,int high)
    {
        int mergearr[]=new int[high-low+1];
        int idx1=low;
        int idx2=mid+1;
        int i=0;

        while(idx1<=mid && idx2<=high)
        {
            if(arr[idx1]<=arr[idx2])
            {
                mergearr[i]=arr[idx1];
                i++; idx1++;
            }else{
                mergearr[i]=arr[idx2];
                i++;idx2++;
            }
        }

        while(idx1<=mid){
            mergearr[i]=arr[idx1];
            i++;idx1++;
        }
        while(idx2<=high)
        {
            mergearr[i]=arr[idx2];
            i++;idx2++;
        }

        // for(int x=0,j=low;i<mergearr.length;x++,j++)
        // {
        //     arr[j]=mergearr[x];
        // }

        for(int j=0;j<mergearr.length;j++)
        {
            System.out.print(mergearr[j]+" ");
        }
    }
    
    public static void mSort(int arr[],int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        if(low<=high)
        {
            int mid=(low+high)/2;
            mSort(arr, low, mid);
            mSort(arr, mid+1, high);
            mergeArray(arr,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int arr[]={62,1,23,2,3};
        MergeSort m=new MergeSort();

        // int low=0,high=arr.length-1;

        mSort(arr,0,arr.length-1);


        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
    }   
}
