import java.io.*;
import java.lang.*;
import java.util.*;

public class Numeralcode
{
    public static String ASCII_to_Binary(int n)
    {
        String s="";
        int a = n, rem;
        while(a>0)
        {
            rem = a%2;
            a=a/2;
            s=rem+""+s;
        }
        return s;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: " );
        String s= sc.nextLine();
        int x[]=new int[s.length()];
        String b[]=new String[s.length()];
        String bx = new String();
        for(int i=0; i<s.length(); i++)
        {
            x[i]=((int)s.charAt(i));
            b[i]=ASCII_to_Binary(x[i]);
            bx = bx+b[i];
        }
        System.out.println("Output: "+bx);
    }
}
