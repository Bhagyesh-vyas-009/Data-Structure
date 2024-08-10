import java.util.Scanner;

class Node {
    int data;
    Node next;

    // Node prev;
    Node(int data) {
        this.data = data;
        next = null;
    }
}// node class

class LinkedList 
{
    Node head;
    static boolean isNotUnOrdered = true;

    public static LinkedList insertBegin(LinkedList list, int data) 
    {
        Node new_node = new Node(data);
        if (list.head == null) 
        {
            list.head = new_node;
        } 
        else 
        {
            new_node.next = list.head;
            list.head = new_node;
        }
        isNotUnOrdered = false;
        return list;
    }// insert at Begin method

    public static LinkedList insertEnd(LinkedList list, int data) 
    {
        Node new_node = new Node(data);
        if (list.head == null) 
        {
            list.head = new_node;
            // list.head.data = data;
        } 
        else 
        {
            Node save = list.head;
            while (save.next != null) 
            {
                save = save.next;
            }
            save.next = new_node;
            // save.data = data;
        }
        isNotUnOrdered = false;
        return list;
    }// insert at End method

    public static LinkedList insertOrder(LinkedList list, int data) {
        if (isNotUnOrdered) {
            Node new_node = new Node(data);
            if (list.head == null) {
                list.head = new_node;
            }// if list is empty 
            else if (new_node.data <= list.head.data) {
                new_node.next = list.head;
                list.head = new_node;
            }// insert at begining 
            else 
            {
                Node save = list.head;
                while (save.next != null && new_node.data >= save.next.data) {
                    save = save.next;
                }
                new_node.next = save.next;
                save.next = new_node;
            }// insert at end / between 
        } 
        else {
            System.out.println("Cannot insert in linked list.");
        }
        return list;
    }// insert in Order method

    public static LinkedList delete(LinkedList list, int key) {
        Node CN = list.head, prev = null;
        if (CN != null && CN.data == key) {
            list.head = CN.next;
            System.out.println(key + " found and deleted.");
            return list;
        }

        while (CN != null && CN.data != key) {
            prev = CN;
            CN = CN.next;
        }
        if (CN != null) {
            prev.next = CN.next;
            System.out.println(key + " found and deleted");
        }
        if (CN == null) {
            System.out.println(key + " not found in Linked List");
        }
        return list;
    }// delete method

   

    public static void display(LinkedList list) {
        Node currentNode = list.head;
        System.out.println("Linked List: ");
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}

public class SinglyLinkedList{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean flag = true;
        while (flag) {
            System.out.println(" 1. Insert (at end)\n" +
                    " 2. Insert (at Begining)\n" +
                    " 3. Insert (in Order)\n" +
                    " 4. Delete (specific element)\n" +
                    " 5. Display\n" +
                    " 6. Exit\n" +
                    " 7. Test\n");
            System.out.print("Enter your choice: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter element to insert an element at end of linked list: ");
                    int data = sc.nextInt();
                    list = LinkedList.insertEnd(list, data);
                    break;
                case 2:
                    System.out.println("Enter element to insert an elemennt at begining of the linked list: ");
                    data = sc.nextInt();
                    list = LinkedList.insertBegin(list, data);
                    break;
                case 3:
                    if (LinkedList.isNotUnOrdered) {
                        System.out.println("Enter element to insert in order: ");
                        data = sc.nextInt();
                        list = LinkedList.insertOrder(list, data);
                    } else {
                        System.out.println("Insertion was manually performed in list.");
                    }
                    break;
                case 4:
                    System.out.println("enter element to delete: ");
                    int key = sc.nextInt();
                    list = LinkedList.delete(list, key);
                    break;
                case 5:
                    LinkedList.display(list);
                    break;
               
                case 6:
                    flag = false;
                    System.out.println("Completing execution.");
                    break;
                case 7:
                    System.out.println("Enter limit: ");
                    int n = sc.nextInt();
                    int i = 1;
                    while (i <= n) {
                        list = LinkedList.insertOrder(list, i);
                        i++;
                    }
                    System.out.println("insertion completed successfully till: " + --i);
                    break;
                default:
                    flag = false;
                    System.out.println("Enter valid choice.");
                    break;
            }
        }
        // display(list);
        sc.close();
    }
}
