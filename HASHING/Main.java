import java.util.Scanner;
public class Main {
    static int[] array;
    private int findPrime(int inpNum) {
        if (inpNum % 2 == 0)
            inpNum++;
        while (isprime(inpNum) == false) {
            inpNum += 2;
        }
        return inpNum;
    }

    private boolean isprime(int inpNum) {
        if (inpNum <= 1) {
            return false;
        }
        for (int i = 2; i <inpNum/2; i++) {
            if (inpNum % i == 0) {
                return false;
            }
        }
        return true;
    }
    private void hashMethod(int value,int inpNum){
        array[value%inpNum]=value;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array: ");
        array = new int[m.findPrime(sc.nextInt())];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < array.length; i++)
            m.hashMethod(sc.nextInt(),array.length);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
        System.out.println("enter element to search: ");
            int num = sc.nextInt();
            int i = array[num%array.length];
        System.out.println("index of element is "+num%array.length+"\n number is" +i);
        sc.close();
    }
}