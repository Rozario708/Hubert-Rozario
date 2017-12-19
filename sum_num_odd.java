import java.util.*;
public class sum_num_odd
{
    public static void main(String args[])
    {
        int num=0,sum=0;
        for(int i=1;i<=45;i++)
        {
            if(i>=1&&i<=15)
            {
                num=num+i;
            }
            if(i>=15&&i<=45)
            {
                if(i%2==1)
                {
                    sum=sum+i;
                }
                
            }
        }
        System.out.println(num);
        System.out.println(sum);
    }
}
