import java.util.Scanner;

public class Armstrong_no {
    public static void main(String[] args) {//main method


        Scanner scanner = new Scanner(System.in);    //Created scanner object
        System.out.println("Please enter no : ");     //prompting user for input no
        int num = scanner.nextInt();
        int p, mod, arm = 0;
        p=num;
        for (int i=num; i>= 0; i++)
             i=i/10;

        {
            mod=num%10;
            arm=arm+(mod*mod*mod);
            num=num/10;

        }
            if (arm==p)
            {
                System.out.println("Its a Armstrong no");
            }
            else
            {
                System.out.println("Its not a Armstrong no");
            }
        }
    }

