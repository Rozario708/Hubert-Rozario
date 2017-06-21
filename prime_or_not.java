import java.io.*;
import java.util.*;
public class prime_or_not
{
    public static void main(String args[])
    {
        int m,flag=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        m=n/2;
        for(int i=2;i<=m;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not a prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("prime");
        }
    }
}
