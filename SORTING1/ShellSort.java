public class ShellSort {
    
    public static void main(String[] args) {
        int arr[]={19,2,56,7,9,1,233};
        int n=arr.length;
        for(int gap=n/2;gap>=1;gap=gap/2)
        {
            for(int j=gap;j<n;j++)
            {
                for(int i=j-gap;i>=0;i=i-gap)
                {
                    if(arr[i+gap]>arr[i])
                    {
                        break;
                    }
                    else{
                        int temp=arr[i+gap];
                        arr[i+gap]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
