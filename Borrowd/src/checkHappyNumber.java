import java.util.Scanner;


public class checkHappyNumber
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter non zero positive no. ");
        //--------------------------------------------------------------------------------------
        int num = sc.nextInt();
        int rem = 0; 
        int sum = 0;
        int count = 0;
      //----------------------------------------------------------------------------------------   
        	do
            {
                rem = num % 10;
                sum = sum + (rem * rem );
                num = num /10;
                count++;
                sum = num;
            }while (num >= 1 && count < 11 );
        
        
        if(sum == 1)
        {
            System.out.println(num + " is a happy number. ");
        }
        else
        {
            System.out.println(num + " is NOT a happy number. ");
        }
    }
}