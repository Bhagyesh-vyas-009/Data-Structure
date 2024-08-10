class SelctionSort2 {
    public static void main(String[] args) {
        int a[]={4,7,2,1,6};

        for(int i=0;i<a.length;i++)
        {
            int smallest=i;

            for(int j=i+1;j<a.length;j++)
            {
                if(a[smallest]>a[j])
                {
                    smallest=j;
                }
            } 
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
