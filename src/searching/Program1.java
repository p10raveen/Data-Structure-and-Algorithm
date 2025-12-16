package searching;

public class Program1 {
    public static void main(String[] args) {
        int[] arr = {2,4,0,1,9,5};
        int x = 10;

        int result = linearSearch(arr,x);

        if(result==-1)
            System.out.println("Element not Found");
        else
            System.out.println("Element Found at "+result+" index");
    }

    private static int linearSearch(int[] arr, int x) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }

        return -1;
    }
}
