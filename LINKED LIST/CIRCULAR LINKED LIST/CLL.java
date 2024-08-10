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

class CircularLinkedList
{
    static boolean isNotUnOrdered = true;
    Node head;
    Node last;

    public void insertFirst(int data)
    {
        Node new_node=new Node(data);

        if(head==null)
        {
            head=last=new_node;
        }
        else
        {
            new_node.next=head;
            last.next=new_node;
            head=new_node;
        }
        
    }

    public void insertEnd(int data)
    {
        Node new_node=new Node(data);

        if(head==null)
        {
            new_node.next=head;
            head=last=new_node;
        }
        else
        {
            new_node.next = head;
            last.next = new_node;
            last = new_node;
        }
    }

    public void insertOrder(int data)
    {
        Node new_node=new Node(data);
        if(head==null)
        {
            head=last=new_node;
        }
        else 
        {
            if(new_node.data<=head.data)
            {
                new_node.next=head;
                last.next=new_node;
                head=new_node;
            }
            else if(new_node.data>=last.data)
            {
                new_node.next=head;
                last.next=new_node;
                last=new_node;
            }
            else
            {
                Node save=head;

                if(save!=last && new_node.data>=save.next.data)
                {
                    save=save.next;
                }
                new_node.next=save.next;
                save.next=new_node;
            }
        }
    }

    public void delete(int data)
    {
        Node save=head;
        if(save==null)
        {
            return;
        }

        if(head==last)
        {
            head=null;
            last=null;
        }
        if(save.data==data)
        {
            head=head.next;
            last.next=head;
            return;
        }

        do{
            Node prev=save.next;
            if(prev.data==data)
            {
                save.next=prev.next;
                break;
            }
            save=save.next;
        }while(save!=head);

    }

    public void display()
    {
        Node save=head;

        if(head!=null)
        {
            if(head==last)
            {
                System.out.println(save.data);
            }
            else
            {
                do{
                    System.out.println(save.data + " ");
                    save=save.next;
                }while(save!=head);
            }
            System.out.println();
        }    
            
    }

    // public void display() {
    //     Node currentNode = head;
    //     System.out.println("Linked List: ");
    //     if (head != null) {
    //         if (head == last) {
    //             System.out.print(currentNode.data);
    //         } else {

    //             do {
    //                 System.out.print(currentNode.data + " ");
    //                 currentNode = currentNode.next;
    //             } while (currentNode != head);
    //         }
    //         System.out.println();
    //     }
    // }
}

class CLL
{
    public static void main(String[] args) {
        
        CircularLinkedList list =new CircularLinkedList();
        
                Scanner sc=new Scanner(System.in);
        
                System.out.println("Enter choice : ");
        
              
        
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
                            list.insertFirst(data);
                            break;
                        case 2:
                            System.out.println("Enter element to insert an element at end of linked list: ");
                            data = sc.nextInt();
                            list.insertEnd(data);
                            break;
                        case 3:
                            if (CircularLinkedList.isNotUnOrdered) {
                                System.out.println("Enter element to insert in order: ");
                                data = sc.nextInt();
                                list.insertOrder(data);
                            } else {
                                System.out.println("Insertion was manually performed in list.");
                            }
                            break;
                        case 4:
                            System.out.println("Enter Node data to delete: ");
                            int data1 = sc.nextInt();
                            list.delete(data1);
                            System.out.println("Available Linked List is : ");
                            list.display();
                            break;
                        case 5:
                            list.display();
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
