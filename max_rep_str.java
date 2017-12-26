import java.util.*;
public class max_rep_str
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=0;
        String ans="";
        String ar[]=s.split(" ");
        for(int i=0;i<ar.length;i++)
        {
            char c[]=ar[i].toCharArray();
            for(int j=0;j<ar[i].length();j++)
            {
                int count=0;
                for(int k=1;k<ar[i].length();k++)
                {
                    if(c[j]==c[k])
                    {
                        count++;
                    }
                }
                if(count>max)
                {
                ans=(ar[i]);
                max=count;  
                }
            }  
        }
        System.out.println(ans);
    }
}


