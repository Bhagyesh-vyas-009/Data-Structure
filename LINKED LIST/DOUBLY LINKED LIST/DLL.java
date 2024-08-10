import java.util.*;

class Node 
{
    Node prev;
    Node next;
    int data;
    Node(int data) 
    {
        next = prev = null;
        this.data = data;
    }
}

class DOUBLYLL 
{
    Node head = null;
    Node last = null;

    static boolean isNotUnOrdered = true;

    public void insertFirst(int data)
    {
        Node new_node=new Node(data);

        if(head==null)
        {
            head=new_node;
            last=new_node;
        }
        else
        {
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
        }
    }   

    public void insertLast(int data)
    {
        Node new_node=new Node(data);

        if(head==null)
        {
            head=new_node;
            last=new_node;
        }
        else
        {
            last.next=new_node;
            new_node.prev=last;
            last=new_node;
        }
    }

    public void insertOrder(int data)
    {
        Node new_node=new Node(data);
        if(isNotUnOrdered)
        {
            if(head==null)
            {
                head=last=new_node;
            }
            else
            {
                if(new_node.data<=head.data)
                {
                    new_node.next=head;
                    head.prev=new_node;
                    head=new_node;
                }
                else if(new_node.data>=last.data)
                {
                    last.next=new_node;
                    new_node.prev=last;
                    last=new_node;
                }
                else if (head.data < new_node.data && last.data >= new_node.data) 
                {
                    Node save=head;
                    while (save.next != null && save.data != data) {
                        save = save.next;
                    }
                    new_node.prev = save;
                    new_node.next = save.next;
                    save.next = new_node;
                    new_node.next.prev = new_node;
                }

            }
        }
    }

    public void delete(int data)
    {
        if(head==null)
        {
            System.out.println("Linked List is empty");
        }
        else
        {
            if(head.data==data)
            {
                head=head.next;
                head.prev.next=null;
                head.prev=null;
            }
            else if(last.data==data)
            {
                last=last.prev;
                last.next.prev=null;
                last.next=null;
            }
            else if(head.data!=data && last.data!=data)
            {
                Node save=head;
                while(save !=null && save.data!=data)
                {
                    save=save.next;
                }
                Node prev=save;
                prev=save.next;
                save.next.next=null;
                save.next.prev = null;
                save.next = prev;
                prev.prev = save;

            }
        }
    }

    public void display() 
    {
        Node save = head;
        Node last = null;
        while (save != null) {
            System.out.print(save.data + "\n");
            last = save;
            save = save.next;
        }
    }
}

class DLL
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        DOUBLYLL dll = new DOUBLYLL();
        boolean flag = true;
        while (flag) {
            System.out.println( " 1. Insert (at Begining)\n"  +
                    " 2. Insert(at end)\n" +
                    " 3. Insert (in Order)\n" +
                    " 4. Delete (specific element)\n" +
                    " 5. Display\n" +
                    " 6. Exit\n");
            System.out.println("Enter your choice: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter element to insert at begining of the linked list:");
                    int data=sc.nextInt();
                    dll.insertFirst(data);
                    break;
                case 2:
                    System.out.println("Enter element to insert at end of the linked list: ");
                    int data1=sc.nextInt();
                    dll.insertLast(data1);
                    break;
                
                case 3:
                    if (DOUBLYLL.isNotUnOrdered) {
                        System.out.println("Enter element to insert in order: ");
                        dll.insertOrder(sc.nextInt());
                    } else {
                        System.out.println("Manual Insertion was performed in Linked List.");
                    }
                    break;
                case 4:
                    System.out.println("Enter element to delete: ");
                    int data2=sc.nextInt();
                    dll.delete(data2);
                    break;
                case 5:
                    dll.display();
                    break;
                case 6:
                    flag = false;
                    System.out.println("Execution has been completed");
                    break;
                default:
                    flag = false;
                    System.out.println("Enter valid choice");
            }
        }
        sc.close();
    }
}
