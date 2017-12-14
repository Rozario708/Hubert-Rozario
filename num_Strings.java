import java.util.*;
public class num_Strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0,count1=0;
        char ar[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(ar[i]))
            {
                count1++;
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
