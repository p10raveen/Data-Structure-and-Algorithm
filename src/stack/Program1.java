package stack;

public class Program1 {

    int[] stack;
    int top;
    int size;

    Program1(int size)
    {
        stack = new int[size];
        this.size = size;
        top = -1;
    }

    void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            top++;
            stack[top] = data;
        }
    }

    void printStack()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(stack[i]+"\t");
        }
        System.out.println();
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top--;
        }
    }

    int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return stack[top];
        }
    }


    public static void main(String[] args)
    {
        Program1 p1 = new Program1(5);
        p1.push(10);
        p1.push(20);
        p1.push(30);
        p1.push(40);
        p1.push(50);
        p1.printStack();
        p1.pop();
        p1.printStack();
        System.out.println("Peek Value of Stack is "+p1.peek());
    }
}
