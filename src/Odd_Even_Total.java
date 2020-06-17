import java.util.Scanner;

public class Odd_Even_Total {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 digits : ");
        int a = scanner.nextInt();
        int even = 0;
        int odd = 0;
        if (a>10000 && a<100000)
        {
           while (a >= 1) {
               int z = a % 10;                   //5
               int y = z % 2;                      //1

            if (y == 0)
            {
                even = even+z;

            } else                     //the is false
                {
                odd = odd+z;               //odd=0 +1
                }
             a=a/10;       //
        }
        System.out.println("Even" + even);
        System.out.println("Odd " + odd);
    }else{
            System.out.println("Only 5 digits allowed ");
}}}