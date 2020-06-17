import java.util.Scanner;

public class Prime_No
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter no to check if its Prime no or not");
        int n=scanner.nextInt();
        int m=0,flag=0;

        m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+" is not prime number");
        }
        else
            {
            for(int i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            { System.out.println(n+" is prime number");
            }
    }
}
}
