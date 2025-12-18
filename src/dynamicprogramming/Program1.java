package dynamicprogramming;

public class Program1 {

    static int fib(int num)
    {
        int a = 0, b = 1, c = 0;
        for(int i=2;i<=num;i++)
        {
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        //0 1 1 2 3 5 8 11
        //            _
        System.out.println(Program1.fib(6));
    }
}
