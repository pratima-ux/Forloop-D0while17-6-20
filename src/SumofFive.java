import java.util.Scanner;

public class SumofFive
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no : ");
        int a =scanner.nextInt();
        int z;
        int y=0;
        while(a>0)
        {
            z=a%10;
            y=z+y;
            a=a/10;

    }
        System.out.println("total of all digits are : " + y);
}}
