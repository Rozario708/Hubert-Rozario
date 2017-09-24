import java.io.*;
import java.util.*;
public class fibonacci1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=-1,m=1,i=1,fib=0;
        while(i<=a)
        {
            fib=n+m;
            n=m;
            m=fib;
            System.out.println(fib);
            i++;
        }
    }
}





