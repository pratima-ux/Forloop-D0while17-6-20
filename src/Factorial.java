import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no : ");
        int val1 = scanner.nextInt();
        int  b=1;
        for (int i = val1; i >0; i--)
        {
           b=b*i;

        } System.out.print("factorial of " + val1 + "! is " + b);

        }
    }




