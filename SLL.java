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

class LinkedList
{
    Node head;

    public static Node insertBeg(int data,Node head)
    {
        Node new_node=new Node(data);

        if(head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }

        return head;
    }

 public static Node insertEnd(int data,Node head)
    {
        Node new_node=new Node(data);

        if(head==null)
        {
            head=new_node;
        }

       
        else 
        {

	Node save=head;

	while(save.next!=null)
	{
		save=save.next;
	}
            	save.next=new_node;
        }

        return head;
    }


}
public class SLL {
    public static void main(String[] args) 
    {
       LinkedList list=new LinkedList();   
        list.insetBeg(50,null);
    }
    
}