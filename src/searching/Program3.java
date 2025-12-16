package searching;

public class Program3 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        //          ---------------
        //           0 1 2 3 4 5 6

        int x = 4;

        int result = binarySearch(arr,x,0,arr.length-1);

        if(result==-1)
            System.out.println("Element not Found");
        else
            System.out.println("Element Found at "+result+" index");
    }

    private static int binarySearch(int[] arr, int x, int low, int high) {
        if(low <= high)
        {
            int mid = low +(high-low)/2;

            if(arr[mid] == x)
            {
                return mid;
            }

            if(arr[mid] < x)
            {
                return binarySearch(arr,x,mid+1,high);
            }
            else
            {
                return binarySearch(arr,x,low,mid-1);
            }
        }
        return -1;
    }


}
