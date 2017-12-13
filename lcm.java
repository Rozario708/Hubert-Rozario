import java.io.*;
import java.util.*;
public class lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int lcm=0;
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        for(int i=1;i<=min;i++)
        {
            int m=max*i;
            if(m%min==0)
            {
                lcm=m;
                break;
            }
        }
        System.out.println(lcm);
    }
}
