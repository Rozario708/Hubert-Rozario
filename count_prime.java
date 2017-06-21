import java.io.*;
import java.util.*;
public class count_prime
{
    public static void main(String args[])
    {
        int flag=0,count=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
                else
                {
                    flag=0;
                }
            }
            if(flag==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
