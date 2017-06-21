import java.io.*;
import java.util.*;
public class power
{
    public static void main(String args[])
    {
        int a=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        double p=Math.pow(n,k);
        System.out.println(p);
    }
}
