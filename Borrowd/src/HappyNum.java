import java.util.Scanner;


public class HappyNum
{
    public static int isHappy(int num)
    {
        int rem = 0; 
        int sum = 0;
        
        while (num > 0 )
        {
            rem = num % 10;
            sum = sum + (rem * rem );
            num = num /10;
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter non zero positive no. ");
        
        int num = sc.nextInt();
        int result = num;
        while(result != 1 && result != 4)
        {
            result = isHappy(result);
        }
        
        if(result == 1)
        {
            System.out.println(num + " is a happy number. ");
        }
        else if (result == 4)
        {
            System.out.println(num + " is NOT a happy number. ");
        }
    }
}