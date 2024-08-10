import java.util.*;

class Stack
{
    int number[];
    int top;
    int limit;

    

    
    public Stack(int size)
    {
        top =-1;
        limit =size;
        number=new int[size];
    }

    // check stack is full?
    boolean isFull()
    {
        return top >=limit-1;
    }

    boolean isEmpty()
    {
        return top==-1;
    }

    // insert an element
    void push(int num)
    {
        if(isFull())
            System.out.println("Stack is full");
        else
        {
            top=top+1;
            number[top]=num;

            System.out.println("Top = "+top);
        }

    }
    // popping out the element that is at the top of stack
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return 0;
        }

        else
        {
            int temp=number[top];
            top=top-1;
            // System.out.println("Element at "+ temp + "popped out is : "+ number[temp]);
            System.out.println("Top = "+top);
            return temp;
        }
    }
    int peep(int i)
    {
    
        if(top-i+1 <=0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int tmp=number[top-i+1];
            System.out.println("ith element :  "+tmp);  
            return  tmp;
        }
        //System.out.println("Top most element in Stack ="+number[top]);

    }

    void change(int i,int val)
    {
        if(top-i+1 <= 0)
        {
            System.out.println("Stack Underflow");
        }
        else{
            
            number[top-i+1]=val;  
            System.out.println("Value changed Successfully");
        }   
    }

    

    void print()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("Elements in Stack:-");
                for(int i=top;i>=0;i--)
                {
                    System.out.println(number[i]);
                }
            
                System.out.println("Top = "+top);
        }
    }
}
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in); 
        boolean flag=true;      
        int size,option,element;
        char chr;
        
        System.out.print("Enter the maximum size that a stack can have = ");
        size=sc.nextInt();
        Stack obj= new Stack(size);

        while(flag)
        {
            System.out.println("Please press any number from the following operations:-"
                    + "\n 1. Insert an element "
                    + "\n 2. Pop an element"
                    + "\n 3. ith element of the stack"
                    + "\n 4. change element of the stack"
                    + "\n 5. Display the elements of the stack"
                    + "\n 6. Exit");
            
                    option=sc.nextInt();

            switch(option)
            {
                case 1:
                    System.out.print("Please enter the element to insert = ");
                    element=sc.nextInt();
                    obj.push(element);
                    break;
                case 2:
                    int tmp=obj.pop();
                    int temp=obj.top;
                    System.out.println("Element at "+ temp + "popped out is : "+ tmp);
                    System.out.println(tmp);
                    break;
                case 3:
                    System.out.print("Enter Index : ");
                    int i=sc.nextInt();
                    obj.peep(i);
                    break;
                case 4:
                    System.out.print("Enter Index : ");
                    int ind=sc.nextInt();
                    System.out.print("Enter value to be change : ");
                    int val=sc.nextInt();
                    
                    obj.change(ind,val);
                    break;
                case 5:
                    obj.print();
                    break;
                case 6:
                    System.out.println("Exit...");
                    flag = false;
                    break;
                default:
                    System.out.println("Choose wrong option ");

            }  
        }
    }
}
