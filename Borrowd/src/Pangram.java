import java.util.Scanner;

public class Pangram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       // String str = " The quick brown fox jumps over the lazy dog";
       // str = str.toLowerCase();
        
        boolean[] alphaList = new boolean[100];
        int index  = 0;
        int flag = 1;
        
        for (int i = 0; i < str.length(); i++ )
        {
        	if (str.charAt(i) >= 'A' && str.charAt(i)  <= 'Z')
        	{
        		index = str.charAt(i) - 'A';
        	}
        	else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
        	{
        		index = str.charAt(i) - 'a';
        	}
        	alphaList[index] = true;
        }
        
        for (int i = 0; i  <= 25; i++) 
        {
            if (alphaList[i] == false) 
            	flag = 0;
        }
     
        if (flag == 1)
        {
            System.out.println("fully loaded!");
        }
        else
        {
            System.out.println("NO");
        }
    }
}