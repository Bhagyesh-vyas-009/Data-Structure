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

class QueueLL
{
    Node head;
    Node last;
    public Node Enqueue(int data)
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

    public Node dequeue()
    {
        if(head==null)
        {
            return null;
        }
        else
        {
            Node save=head;
            head=head.next;
            save.next=null;
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

public class QLL{
    public static void main(String[] args) {
        QueueLL qll=new QueueLL();
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("\n1.EnQueue in Linked List \n2.Pop in Linked List \n3.Display \n4.Exit\n");
            System.out.print("Enter your choice: ");
            switch (sc.nextInt()) 
            {
                case 1:
                    System.out.println("Enter element to insert in  the linked list: ");
                    int data = sc.nextInt();
                    qll.Enqueue(data);
                    break;
                case 2:
                    Node val=qll.dequeue();
                    System.out.println(val+" is deleted successfully");
                    break;
                case 3:
                   qll.display();
                    break;
                case 4:
                System.exit(0);
            }     
        }   
    }        
}