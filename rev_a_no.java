import java.util.*;
public class rev_a_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String last="",rev="";
        while(a>0)
        {
           last=Integer.toString(a%10);
           rev=rev+last;
           a=a/10;
        }
        System.out.println(rev);
    }
}
