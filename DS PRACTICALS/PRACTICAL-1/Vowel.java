import java.util.*;
class Vowel
{

    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Character :");
        ch=sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.print("Character is Vowel");
        }
        else
        {
              System.out.print("Character is Constant");
        }
    }
}