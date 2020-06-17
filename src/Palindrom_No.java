import java.util.Scanner;

public class Palindrom_No
{
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);    //Created scanner object
        System.out.println("Please enter no : ");     //prompting user for input no
        int num = scanner.nextInt();
        int storage,mod,reverse=0;
        storage=num;
        while (storage>0)
        {
            mod=storage%10;
            reverse=(reverse*10)+mod;
            storage=storage/10;

        }
        if (num==reverse)
        {
            System.out.println( reverse + " Is a Palindrome no ");
        }
        else
        {
            System.out.println(reverse +" Is not a Palindrome no ");
        }
    }
}