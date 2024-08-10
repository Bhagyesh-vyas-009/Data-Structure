import java.util.*;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

class STLL
{
    Node head;
    Node last;

    public Node insertEnd(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            head=last=new_node;
        }
        else
        {
            last.next=new_node;
            last=new_node;
        }
        return head;
    }

    public Node delete()
    {
        if(head==null)
        {
            // System.out.println("Linked List is Empty");
            return null;
        }
        else if(head==last)
        {
            Node save=last;
            head=last=null;
            return save;
        }
        else
        {
            Node save=head;
            while(save.next!=last)
            {
                save=save.next;
            }
            last=save;
            save.next=null;
            last.next=null;
            return save;
        }
    }

        public void display()
        {
            Node save=head;
            while(save!=null)
            {
                System.out.println(save.data+ " ");
                save=save.next;
            }
        }
}

public class StackLL
{
    public static void main(String[] args) 
    {
        STLL sll=new STLL();
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("1.Push in Linked List \n2.Pop in Linked List \n3.Display \n4.Exit");
            System.out.print("Enter your choice: ");
            switch (sc.nextInt()) 
            {
                case 1:
                    System.out.println("Enter element to insert in  the linked list: ");
                    int data = sc.nextInt();
                    sll.insertEnd(data);
                    break;
                case 2:
                    sll.delete();
                    break;
                case 3:
                   sll.display();
                    break;
                case 4:
                System.exit(0);
            }     
        }   
    }
}

        // sll.insertEnd(10);
        // sll.insertEnd(20);
        // sll.insertEnd(30);
        // sll.insertEnd(40);
        // sll.display();
        // sll.delete();
        // sll.display();

