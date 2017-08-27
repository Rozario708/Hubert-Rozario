import java.io.*;
import java.util.*;
public class armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar=0,aa=0,a=sc.nextInt();
        int t;
        t=a;
        while(a>0)
        {
            
            ar=a%10;
            aa+=Math.pow(ar,3);
            a=a/10;
            
        }
        if(t==aa)
        {
            System.out.println(" true");
        }else{System.out.println("false");}
    
    }
}




