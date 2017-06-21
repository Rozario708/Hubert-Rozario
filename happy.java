import java.io.*;
import java.util.*;
public class happy
{
    public static void main(String args[])
    {
        int s=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int r=n%10;
            s=s+(r*r);
            n=n/10;
            if(n==0)
            {
                if(s%10==s)
                {
                    break;
                }
                else
                {
                    n=s;
                    s=0;
                }
            }
        }
            if(s==1)
            {
                System.out.println("Happy Number");
            }
            else
            {
                System.out.println("Not Happy Number");
            }
        
    }
}
