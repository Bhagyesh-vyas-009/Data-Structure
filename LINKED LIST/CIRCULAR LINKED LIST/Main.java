import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    static boolean isNotUnOrdered = true;
    Node first;// begining reference of linked list
    Node last;

    public LinkedList insertBegin(LinkedList list, int data) {
        isNotUnOrdered = false;
        Node new_node = new Node(data);
        if (list.first == null) {
            list.first = list.last = new_node;
        } else {
            new_node.next = list.first;
            list.last.next = new_node;
            list.first = new_node;
        }
        return list;
    }// insert at Begin

    public LinkedList insertEnd(LinkedList list, int data) {
        isNotUnOrdered = false;
        Node New = new Node(data);
        if (list.first == null) {
            New.next = first;
            list.first = list.last = New;
        } else {
            New.next = list.first;
            list.last.next = New;
            list.last = New;
        }
        return list;
    }// insert at End

    public LinkedList insertOrd(LinkedList list, int data) {
        Node New = new Node(data);
        if (isNotUnOrdered) {
            if (list.first == null) {
                list.first = list.last = New;
            } else {
                if (New.data <= list.first.data) {
                    New.next = list.first;
                    list.last.next = New;
                    list.first = New;
                } else if (New.data >= list.last.data) {
                    New.next = list.first;
                    list.last.next = New;
                    list.last = New;
                } else {
                    Node save = list.first;
                    while (save != last && New.data >= save.next.data) {
                        save = save.next;
                    }
                    New.next = save.next;
                    save.next = New;
                }
            }
        }
        return list;
    }// insert in Order

    public LinkedList delete(LinkedList list, int data) {
        if (list.first == null) {
            System.out.println("list is empty");
            return list;
        } else {
            Node save = list.first;
            Node pred = null;
            while (save.data != data && save != list.last) {
                pred = save;
                save = save.next;
            }
            if (save.data != data) {
                System.out.println("Node not found");
                return list;
            } else {
                if (list.first == list.last) {
                    list.first = list.last = null;
                    // System.out.println("case 1");
                } else if (save.data == list.first.data) {
                    list.first = list.first.next;
                    list.last.next = list.first;
                    // System.out.println("case 2");
                } else {
                    pred.next = save.next;
                    if (save.data == list.last.data) {
                        list.last = pred;
                    }
                    // System.out.println("case 3");
                }
            }
        }
        return list;
    }

    public void display(LinkedList list) {
        Node currentNode = list.first;
        System.out.println("Linked List: ");
        if (list.first != null) {
            if (list.first == list.last) {
                System.out.print(currentNode.data);
            } else {

                do {
                    System.out.print(currentNode.data + " ");
                    currentNode = currentNode.next;
                } while (currentNode != list.first);
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean flag = true;
        while (flag) {
            System.out.println("1. Insert (at Begining)\n"+
                    " 2. Insert (at End)\n" +
                    " 3. Insert (in Order)\n" +
                    " 4. Delete (specific element)\n" +
                    " 5. Display\n" +
                    " 6. Exit");
            System.out.println("Enter yout choice: ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter element to insert an element at begining of the linkedlist: ");
                    list = list.insertBegin(list, sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter value to insert an element at end of linkedlist: ");
                    list = list.insertEnd(list, sc.nextInt());
                    break;
                case 3:
                    if (LinkedList.isNotUnOrdered) {
                        System.out.println("enter element to insert in order: ");
                        list = list.insertOrd(list, sc.nextInt());
                    } else {
                        System.out.println("manual Insertion was performed");
                    }
                    break;
                case 4:
                    System.out.println("Enter element to delete: ");
                    list = list.delete(list, sc.nextInt());
                    break;
                case 5:
                    list.display(list);
                    break;
                case 6:
                    flag = false;
                    System.out.println("Execution Completed.");
                    break;
                default:
                    flag = false;
                    System.out.println("Enter valid choice.");
                    break;
            }
        }
        sc.close();
    }
}
