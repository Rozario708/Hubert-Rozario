import java.io.*;
import java.util.*;
public class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        String s=sc.nextLine();
        sb.append(s);
        System.out.println(s);
        sb.reverse();
        System.out.println(sb);
        
    }
}
