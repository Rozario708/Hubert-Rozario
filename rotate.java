import java.io.*;
import java.util.*;
public class rotate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        {
          ar[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=k+1;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        for(int i=0;i<=k;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}



