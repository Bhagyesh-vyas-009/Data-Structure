public class CountingSort 
{
    public void countingSort(int arr[], int max) {
        int n = arr.length;
        int c[] = new int[max+1];
        int b[] = new int[n];
        // for (int i = 0; i < max; i++) {
        //     c[i] = 0;
        // }
        for (int j = 0; j < n; j++) {
            c[arr[j]] = c[arr[j]] + 1;
        }
        for (int k = 1; k<c.length; k++) {
            c[k] = c[k] + c[k - 1];
        }

        for (int m = 0; m<b.length; m++) {
            b[--c[arr[m]]] = arr[m];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }

    }

    public static void main(String[] args) {

        int arr[] = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        // 0 1 2 3 4 5 6 7

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        // System.out.println(max);

        CountingSort csort = new CountingSort();
        csort.countingSort(arr, max);
    }
}
