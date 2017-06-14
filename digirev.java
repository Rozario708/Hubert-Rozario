import java.io.*;
import java.util.*;
public class digirev
{
    public static void main(String args[])
    {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        StringBuffer sb=new StringBuffer();
        String s=String.valueOf(a);
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
        
    }
}
