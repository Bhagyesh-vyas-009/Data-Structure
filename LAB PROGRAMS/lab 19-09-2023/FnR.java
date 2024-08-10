import java.util.*;
public class FnR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int[] a = new int[sc.nextInt()];
        System.out.println("Enter elements of array: ");
        for(int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter number to replace: ");
        int num = sc.nextInt();
        System.out.println("Enter the number you want to replace with: ");
        int rep = sc.nextInt();
        for(int i = 0;i<a.length;i++){
            if(num == a[i]){
                a[i]=rep;
                // System.out.println("Number has been replaced");
            }
        
            System.out.println(a[i]);
        }
    }
}
