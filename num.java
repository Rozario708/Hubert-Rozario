import java.io.*;
import java.util.*;
public class pos
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>0)
        {
            System.out.println("pos");
        }
        else if(n<0)
        {
            System.out.println("neg");
        }
        else
        {
            System.out.println("zero");
        }
    }
    
}
