package queue;

public class Program2 {

    int[] queue;
    int size;
    int front,rear;

    Program2(int size)
    {
        queue = new int[size];
        this.size = size;
        front=rear= -1;
    }

    void enqueue(int data)
    {
        if(front==0 && rear == size-1 || front==rear+1)
            System.out.println("Queue is full");
        else
        {
            if(front==-1) {
                front = 0;
            }
            rear = (rear+1)%size;
            queue[rear] = data;
        }
    }

    void dequeue()
    {
        if(front==-1)
            System.out.println("Queue is empty");
        else
        {
            if(front==rear)
            {
                front=rear= -1;
            }
            else
            {
                front = (front+1)%size;
            }
        }
    }

    void printQueue()
    {
        int i = 0;
        for(i=front;i!=rear;i=(i+1)%size)
        {
            System.out.print(queue[i]+"\t");
        }
        System.out.println(queue[i]);
    }

    public static void main(String[] args) {
        Program2 p1 = new Program2(5);
        p1.enqueue(10);
        p1.enqueue(20);
        p1.enqueue(30);
        p1.enqueue(40);
        p1.enqueue(50);
        p1.printQueue();
        p1.dequeue();
        p1.dequeue();
        p1.printQueue();
        p1.enqueue(60);
        p1.enqueue(70);
        p1.printQueue();
    }
}
