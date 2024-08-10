import java.util.*;

class Stackpush
{
    int top;
    int[] stack;
    int size;

    public Stackpush(int size)
    {
        top =-1;

        stack=new int[size];
    }
    
    void push(int element)
    {
        if(top>=size)
        {
            System.out.println("Stack Overflow");
        }
        else{
            top=top+1;
            stack[top]=element;
        }
    }
    public static void main(String[] args) 
    {
        int size,element,top=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of stack : ");
        size=sc.nextInt();

        System.out.print("Enter element to be pushed in stack : ");
        element=sc.nextInt();

        Stackpush obj= new Stackpush(size);

        obj.push(element);

        
    }
}