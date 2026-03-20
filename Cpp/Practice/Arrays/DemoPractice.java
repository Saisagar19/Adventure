import java.util.*;

public class DemoPractice
{
    public static ArrayList<Integer> inputCommaSeparated()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        Scanner ss = new Scanner(input).useDelimiter(",");
        while(ss.hasNextInt())
        {
            arr.add(ss.nextInt());
        }
        System.out.println();
        return arr;
    }
    public static ArrayList<Integer> spaceSeparated()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        Scanner ss = new Scanner(input);
        while(ss.hasNextInt())
        {
            arr.add(ss.nextInt());
        }
        System.out.println();
        return arr;
    }


    public static void main(String[] args)
    {
        // System.out.println("Hello comma");
        // ArrayList<Integer> arr1 = inputCommaSeparated();
        // System.out.println(" 1,2,3,4,5");
        // for(int num : arr1)
        // {
        //     System.out.print(num + " ");
        // }
        // System.out.println();

        System.out.println("Hello space");
        ArrayList<Integer> arr2 = spaceSeparated();
        for(int num : arr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

