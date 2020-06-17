import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Pos_Nag
    {
     public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 no : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int pos=0;
        int neg=0;
        int zero=0; int i;

        for (i=a;i<=b;i++)   // prints a to z no

            {
                if (i==0)
            {
                zero++;
            }
            else if (i<0)
            {
               neg++;
            }
            else
            {
                pos++;
            }



            }
         System.out.println("zero no" +zero);
         System.out.println("negetive no: " +neg);
         System.out.println("Positive no"+ pos);
    }
}