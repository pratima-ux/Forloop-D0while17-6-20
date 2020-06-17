import java.util.Scanner;

public class First_Last_add {
    public static void main(String[] args)      //main method
    {
        Scanner scanner = new Scanner(System.in);    //Created scanner method
        System.out.print("Please enter any 5 digits : "); //prompting user to put 5 digits
        int a = scanner.nextInt();   //variable
        if (a > 10000 && a < 100000)
        {
            int z = a / 10000;              //get the first digit deviding by 10000
            int y = a % 10;                 //Get the last digit module by 10
            int x = y + z;                  //store total of z and y in int x
            System.out.println(" (First digit " + z + ") + (" + " Last digit " + y + ") =" + x);
            //print out the total by using concatination
        } else
            {
              System.out.println("Please enter only 5 digits ");
            }
    }
}