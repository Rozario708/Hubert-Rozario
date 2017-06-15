import java.io.*;
import java.util.*;
public class noofdigi
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0)
        {
            int r=a%10;
            count++;
            a=a/10;
        }
        if(count>0)
        {
            System.out.print(count);
        }
        
    }
}
