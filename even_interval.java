import java.io.*;
import java.util.*;
public class even_interval
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
