import java.util.*;
public class no_of_Char
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(c[i]))
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}


