import java.util.*;

public class searchingAlgo
{
    public static void display(int arr[])
    {
        Arrays.sort(arr);
        for(int i= 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void acceptArray(int arr[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Elements: ");
        for(int i = 0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public static int LinearSearch(int arr[], int target)
    {
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int arr[], int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of An Array: ");
        int size  = sc.nextInt();
        int arr[] = new int[size];
        acceptArray(arr);
        display(arr);
        System.out.println("\nEnter Target Element: ");
        int target = sc.nextInt();
        
        // int index = LinearSearch(arr, target);
        // System.out.println("index of an Element: " + index);
        int element = BinarySearch(arr, target);
        System.out.println("index of an Array: " + element);
        sc.close();

     } 
}