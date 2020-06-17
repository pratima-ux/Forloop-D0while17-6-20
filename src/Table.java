import java.util.Scanner;

public class Table
{
    public static void main(String[] args)           //main method
    {
        Scanner scanner = new Scanner(System.in);    //Created scanner object
        System.out.println("Please enter no : ");     //prompting user for input no
        int a =scanner.nextInt();
    for (int i = 1; i <= 10; i++)                     // For loop
         {
        System.out.println(a+" * "+ i + " = " + i*a);    // printout result using concatination
         }
    }
}
