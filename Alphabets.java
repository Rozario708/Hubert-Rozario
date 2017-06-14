import java.io.*;
import java.util.*;
public class Alphabets
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("not an Alphabet");
        }
    }
}
