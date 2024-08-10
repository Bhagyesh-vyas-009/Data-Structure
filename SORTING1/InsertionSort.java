public class InsertionSort 
{
    public static void main(String[] args) {
        int a[]={10,30,40,52,65,78,80,90};
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
                // System.out.println("J= "+j);
            }
            a[j+1]=key;
        }

        System.out.print("Sorted Array : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
