import java.util.*;


class Queue1 
 {
  int limit;
  int q1[];
  int front, rear;

  Queue1(int size) {
    limit=size;
    q1 = new int[size];
    front = -1;
    rear = -1;
  }

  // check if the queue is full
  boolean isFull() {
    if (front == 0 && rear == limit - 1) {
      return true;
    }
    return false;
  }

  // check if the queue is empty or not
  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  // insert elements to the queue
  void enQueue(int num) 
  {

    // if queue is full
    if (isFull()) {
      System.out.println("Queue is full");
    }
    else {
      if (front == -1) 
      {
        
        front = 0;
      }

      rear=rear+1;
      // insert element at the rear
      q1[rear] = num;
      System.out.println("Inserted element = " + num);
    }
  }

  // delete element from the queue
  int deQueue() 
  {
    int element;

    // check if queue is empty
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    }
    else {
      // remove element from the front of queue
      element = q1[front];

      // if the queue has only one element
      if (front >= rear) {
        front = -1;
        rear = -1;
      }
      else {
        // mark next element as the front
        front++;
      }
      System.out.println( element + " Deleted");
      return (element);
    }
  }

  // display elements of the queue
  void display() 
  {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    }
    else {
      // display the front of the queue
     

      // display element of the queue
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++)
        System.out.print(q1[i] + "  ");

        System.out.println("\nFront index-> " + front);
      // display the rear of the queue
      System.out.println("\nRear index-> " + rear);
    }
  }
 }

 class Queue2
 {

 
  public static void main(String[] args) 
  {

    Scanner sc =new Scanner(System.in) ;
    int size,option,element;
    char chr;

    System.out.print("Enter the maximum size that a queue can have = ");
    size=sc.nextInt();

    Queue1 q= new Queue1(size);
    do{
        System.out.println("Please press any number from the following operations:-"
                + "\n 1. Enque an element "
                + "\n 2. Dequeue an element"
                + "\n 3. Display the elements of the queue"
                + "\n ");
        option=sc.nextInt();

        switch(option)
        {
            case 1:
                System.out.print("Please enter the element to insert = ");
                element=sc.nextInt();
                q.enQueue(element);
                break;
            case 2:
                q.deQueue();
                break;
            case 3:
                q.display();
                break;
           
            default:
                System.out.println("Choose wrong option ");

        }
        System.out.println("Want to continue? y or n ");
        chr=sc.next().charAt(0);
    }while(chr=='y'||chr=='Y');


// create an object of Queue class
    /*Queue1 q = new Queue1();

    // try to delete element from the queue
    // currently queue is empty
    // so deletion is not possible
    q.deQueue();

    // insert elements to the queue
    for(int i = 1; i < 6; i ++) {
      q.enQueue(i);
    }

    // 6th element can't be added to queue because queue is full
    q.enQueue(6);

    q.display();

    // deQueue removes element entered first i.e. 1
    q.deQueue();

    // Now we have just 4 elements
    q.display();

    */

  }
}