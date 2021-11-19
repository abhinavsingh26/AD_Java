import java.util.Scanner;

class Pangram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        str = str.toLowerCase();
        
        boolean allLetterPresent = true;
 
        // Loop over each character itself
        for (char ch = 'a'; ch <= 'z'; ch++) 
        {
            if (!str.contains(String.valueOf(ch))) 
            {
                allLetterPresent = false;
                break;
            }
        }
        if (allLetterPresent)
        {
            System.out.println("fully loaded!");
        }
        else
        {
            System.out.println("NO");
        }
    }
}