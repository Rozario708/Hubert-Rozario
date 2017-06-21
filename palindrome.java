import java.io.*;
import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        int r,rev=0;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        while(n>0)
        {
            rev=rev*10;
            rev=rev+(n%10);
            n=n/10;
        }
        if(rev==t)
        {
            System.out.println("it is a paliandrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}
