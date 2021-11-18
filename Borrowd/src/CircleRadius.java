import java.util.Scanner;

public class CircleRadius
{
    
    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        float area = (float) (3.14 * rad * rad) ;
        System.out.println(area);
    }
}