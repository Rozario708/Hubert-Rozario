import java.io.*;
import java.util.*;
public class hcf_gcd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=0;
        int min=Math.min(a,b);
        for(int i=min;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
                System.out.println(hcf);
                break;
            }
        }
    }
}

