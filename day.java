import java.io.*;
import java.util.*;
public class day
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String day=sc.next();
        switch(day)
        {
            case "sunday":
                {
                    System.out.println("False");
                    break;
                }
            case "monday":
                {
                    System.out.println("True");
                    break;    
                }
                case "tuesday":
                    {
                        System.out.println("true");
                        break;
                    }
                case "wednesday":
                    {
                System.out.println("true");
                break;
                    }
                case "thursday":
                    {
                System.out.println("true");
                break;
                    }
                case "friday":
                    {
                System.out.println("true");
                break;
                    }
                case "saturday":
                    {
                System.out.println("true");
                break;
                    }
                    default:
                    {
                        System.out.println("****");
                    }
        }
    }
}
