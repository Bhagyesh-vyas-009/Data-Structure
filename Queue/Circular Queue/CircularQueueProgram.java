import java.util.Scanner;

class CircularQueue 
{
    int[] Q;
    int Front=-1;
    int Rear=-1;

    

    public void enqueue(int[] Queue, int Front, int Rear, int value) 
    {
        int size = Queue.length;
        if (Front == -1 && Rear == -1) {
            this.Front = this.Rear = 0;
            Queue[this.Rear] = value;
        } 
        else if (this.Front == 0 && this.Rear == size - 1 && (this.Rear + 1) % size == this.Front) 
        {
            System.out.println("Queue Overflow.");
        }
        else if (this.Rear == size - 1 && this.Front != 0) 
        {
            this.Rear = 0;
            Queue[this.Rear] = value;
        }
        else if(this.Rear+1==this.Front){
            
        System.out.println("Value of Front = "+this.Front);
        System.out.println("Value of Rear = "+this.Rear);
            System.out.println("Queue overflow else if");
        }
        else 
        {
            // if (this.Front <= this.Rear) 
            // {
                // }
            
                this.Rear++;
            Queue[this.Rear] = value;
        }//if else
    }// enqueue

    public int dequeue(int[] Queue, int Front, int Rear) 
    {
        int value;
        if (this.Front == -1) {
            System.out.println("Queue Underflow");
            return 0;
        }
        else 
        {
            value = Queue[this.Front];
            if (this.Front == this.Rear) {
                Queue[Front] = -1;
                this.Front = this.Rear = -1;
            }
            else if (this.Front == Queue.length) 
            {
                this.Front = 1;
            } 
            else 
            {
                Queue[Front] = -1;
                this.Front += 1;
            }
            System.out.println("value dequeued is: "+value);
            return value;
        }//if else
    }//dequeue

    public void display(int[] Queue,int Front, int Rear)
    {
        System.out.println("Value of Front = "+Front);
        System.out.println("Value of Rear = "+Rear);

        for (int i = this.Front; i < Queue.length; i++)
        {
            System.out.println(Queue[i]);
        }
        for (int i = 0; i <this.Front; i++)
        {
            System.out.println(Queue[i]);
            // System.out.println("asdf");
        }
        // for (int i = 0; i < Queue.length; i++) 
        // {
        //     System.out.println(Queue[i]);
        // }//for loop
    }//display

    public void Start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue: ");
        Q = new int[sc.nextInt()];
        int value;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter Operation to Perform: ");
            System.out.println(" 1. Enqueue\n 2. Dequeue\n 3. Display\n 4. Exit");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Enter Value to Enqueue: ");
                    value = sc.nextInt();
                    enqueue(Q, Front, Rear, value);
                    break;
                case 2:
                    value = dequeue(Q, Front, Rear);
                    // System.out.println("Value dequeued: "+value);
                    break;
                case 3:
                    display(Q,Front,Rear);
                    break;
                case 4:
                    flag = false;
                    System.out.println("Completing Execution.");
                    break;
                default:
                    System.out.println("Invalid option entered stopping execution of program.");
                    flag = false;
                    break;
            }// switch
        } // while
        sc.close();
    }//start
}//class

public class CircularQueueProgram
{
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.Start();
    }//main
}//class