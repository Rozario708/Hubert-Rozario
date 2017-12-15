import java.util.*;
public class exit_when_k
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a="";
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(c[i]!='k' && c[i]!='K')
            {
                a=a+Character.toString(c[i]);
            }
            else
            {
                break;
            }
        }
        System.out.println(a);
    }
}
