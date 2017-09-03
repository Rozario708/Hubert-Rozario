import java.io.*;
import java.util.*;
public class factorial1
{
    public static void main(String args[])
    {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}


