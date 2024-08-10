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
    static boolean isNotUnOrdered = true;

    public  Node insertBeg(int data)
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
            System.out.println("else null insbeg");
        }
        return head;
    }

    public  Node insertEnd(int data)
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

    }// insert at end 

    public Node insertOrder(int data)
    {
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
        } else if(new_node.data<=head.data){
            new_node.next=head;
            head=new_node;
        } else {
            Node save=head;
            while(save.next!=null && new_node.data>=save.next.data)
                save=save.next;
            new_node.next=save.next;
            save.next=new_node;
        }
        return head;
    }


    public Node deleteNode(int data)
    {
        // if(head==null){
        //     System.out.println("List is empty");
        //     return head;
        // }
        // else{
        //     Node save=head;
        //     while(save.next!=null && save.data!=data) 
        //     {
        //         save=save.next;
        //     }
        //     System.out.println(save.data);
        // }
        // return head;
        Node save = head, prev = null;
        if (save != null && save.data == data) {
            head = save.next;
            System.out.println(data + " found and deleted.");
            return head;
        }

        while (save != null && save.data != data) {
            prev = save;
            save = save.next;
        }
        if (save != null) {
            prev.next = save.next;
            System.out.println(data + " found and deleted");
        }
        if (save == null) {
            System.out.println(data + " not found in Linked List");
        }
        return head;
    } 



    public void Display()
    {
        Node currentNode = head;
        System.out.println("Linked List: ");
        while (currentNode != null) 
        {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

}
public class LL {
    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter choice : ");

       LinkedList list=new LinkedList();   
        // list.insertBeg(50);
        // list.insertEnd(100);

        // list.insertOrder(5);
        // list.insertOrder(4);
        // list.insertOrder(15);
        // list.insertOrder(6);
        // list.Display();
        // list.deleteNode(6);
        // list.Display();

        boolean flag = true;
        while (flag) {
            System.out.println(" 1. Insert (at Begining)\n" +
                    " 2. Insert (at end)\n" +
                    " 3. Insert (in Order)\n" +
                    " 4. Delete (specific element)\n" +
                    " 5. Display\n" +
                    " 6. Exit\n");
            System.out.print("Enter your choice: ");
            switch (sc.nextInt()) {
               
                case 1:
                    System.out.println("Enter element to insert an elemennt at begining of the linked list: ");
                    int data = sc.nextInt();
                    list.insertBeg(data);
                    break;
                case 2:
                    System.out.println("Enter element to insert an element at end of linked list: ");
                    data = sc.nextInt();
                    list.insertEnd(data);
                    break;
                case 3:
                    if (LinkedList.isNotUnOrdered) {
                        System.out.println("Enter element to insert in order: ");
                        data = sc.nextInt();
                        list.insertOrder(data);
                    } else {
                        System.out.println("Insertion was manually performed in list.");
                    }
                    break;
                case 4:
                    System.out.println("enter element to delete: ");
                    int key = sc.nextInt();
                    list.deleteNode(key);
                    System.out.println("Available Linked List is : ");
                    list.Display();
                    break;
                case 5:
                    list.Display();
                    break;
               
                case 6:
                    flag = false;
                    System.out.println("Exited Sucessfully................");
                    break;
               
                default:
                    flag = false;
                    System.out.println("Enter valid choice.");
                    break;
            }
        }
    }   
    
}