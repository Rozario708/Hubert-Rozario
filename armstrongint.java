import java.io.*;
import java.util.*;
public class armstrongint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int l=sc.nextInt();
        int arm=0;
        int n=0;
        int a;
        for(int i=f;i<l;i++)
        {
            n=i;
            String s=String.valueOf(n);
            int len=s.length();
            while(n>0)
            {
                a=n%10;
                arm+=Math.pow(a,len);
                n=n/10;
            }
            if(arm==i)
            {
                System.out.println(i);
            }
            arm=0;
        }
        
    }
}
