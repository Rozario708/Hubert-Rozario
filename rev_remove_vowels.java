import java.util.*;
import java.io.*;
public class rev_remove_vowels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer();
        String s1=s.replaceAll("[aeiouAEIOU]","");
        sb.append(s1);
        sb.reverse();
        System.out.println(sb);
        
    }
}
