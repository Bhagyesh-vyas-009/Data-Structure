class InsertionSort1 {
    public static void main(String[] args) {
        int a[]={4,7,2,1,6};

        for(int i=0;i<a.length;i++)
        {
            int current=a[i];
            int j=i-1;

            while(j>=0 && a[j]>current)
            {
                a[j+1]=a[j];
                j--;
            }

            a[j+1]=current;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
