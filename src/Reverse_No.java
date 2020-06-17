import java.util.Scanner;
public class Reverse_No
{
    public static void main(String[] args) {//main method

        Scanner scanner = new Scanner(System.in);    //Created scanner object
        System.out.println("Please enter no : ");     //prompting user for input no
        int num = scanner.nextInt();
        int storage,mod,reverse=0;

            storage=num;
        if (num>10000 && num<100000) {
            while (storage > 0) {
                mod = storage % 10;
                reverse = (reverse * 10) + mod;
                storage = storage / 10;

            }
            System.out.print(reverse);
        }
    else
        {
        System.out.println("Only 5 digits allowed ");
        }
}}
