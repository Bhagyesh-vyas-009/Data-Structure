//Valid Invalid String like abcba aca abbcbba

import java.util.Stack;
import java.util.Scanner;
class Q1
{
    public static void main(String[] args)
    {
        Stack<Character> s=new Stack<Character>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s1=sc.next();
        boolean flag=true;
        boolean ans=true;
        int i=0;
        s.push(s1.charAt(i));
        
        while(flag)
        {
            i++;
            if(s1.charAt(i)=='c')
            {
                flag=false;
                i++;
                break;

            }
            else
            {
                s.push(s1.charAt(i));
            }
            
        }
        flag=true;
    
        while(flag)
        {
            
            if(s1.length()==i)
            {
                flag=false;
                i++;
                break;

            }
            else
            {
                if(s1.charAt(i)!=s.pop())
                {
                    flag=false;
                    ans=false;
                    break;
                }
            }
            i++;
        }
        System.out.println((!ans)?"String is Invalid":"String is Valid");
    }
}