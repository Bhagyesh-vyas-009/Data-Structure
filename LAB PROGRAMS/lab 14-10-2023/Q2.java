/*2. wap to determine if an input character string in the form of aibi,i>=1,number of a should be number of be
    i.aabb
    ii.aabb
    iii.aaabbb
*/

import java.util.Stack;
import java.util.Scanner;
public class Q2 
{
    public static void main(String[] args) 
    {
        Stack<Character> s=new Stack<Character>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String str=sc.next();
        int counta=0;
        int countb=0;
        int i=0;
        while(i<str.length())
        {
            if(str.charAt(i)=='a')
            {
                s.push(str.charAt(i));
                counta++;
            }
            else if(str.charAt(i)=='b')
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
                countb++;
            }
            i++;
        }
        
        System.out.println(((s.isEmpty()) && (counta==countb))?"String is Valid":"String is Invalid ");
        
    }
}
