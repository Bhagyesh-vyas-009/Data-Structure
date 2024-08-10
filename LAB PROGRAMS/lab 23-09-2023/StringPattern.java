import java.util.*;
public class StringPattern 
{
  public static void main(String[] args) 
  {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String: ");
    String strs = sc.nextLine();
    char[] str = strs.toCharArray();

    for(int i=0;i<strs.length();i++)
    {
      for(int j=strs.length()-1;j>=i;j--)
      {
        System.out.print(" ");
      }

      for(int j=0;j<=i;j++)
      {
        System.out.print(str[j]+" ");
      }

        System.out.println();
    }
  }
}
