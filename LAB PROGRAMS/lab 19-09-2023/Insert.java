import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int[] a = new int[(sc.nextInt()+1)];
        System.out.println("Enter elements: ");
        for(int i=0;i<a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter position to replace: ");
        int pos = (sc.nextInt()-1);
        System.out.println("Enter value to replace:");
        int rep = sc.nextInt();
        
        a[pos]=rep;
        for(int i=0;i<a.length-1;i++){
            
            
            System.out.println(a[i]);    
        }
    }
}
