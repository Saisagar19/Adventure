import java.util.*;

public class armStrong {

    public static int powerOfn(int num, int power)
    {
        int res = 1;
        for(int i = 0; i < power; i++)
        {
            res = num * res;
        }
        return res;
    }

    public static int isArmstrong(int num)
    {
        int digitCount=0;
        int sum = 0;
        int temp = num;
        while(num>0)
        {
            num /= 10;
            digitCount++;
        }
        while(temp > 0)
        {
            int rem = temp%10;
            int res = powerOfn(rem, digitCount);
            sum = sum + res;
            temp /= 10;
        }
        
        return sum;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int arm = isArmstrong(num);
        if(arm == num)
        {
            System.out.println(num + " is a ArmStrong Number");
        }
        else{
            System.out.println("Not a ArmStrong Number");
        }
    }
    
}
