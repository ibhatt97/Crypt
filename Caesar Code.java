import java.io.*;
import java.lang.*;
import java.util.*;

public class Encode1
{
    public static void main()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String s = sc.nextLine();
        System.out.print("Enter no of shifts: ");
        int n = sc.nextInt(); //between -25 and 25
        char x[] = new char[s.length()];
        for(int i = 0; i<s.length(); i++)
        {
            x[i]=s.charAt(i);
            if(x[i]!=' ' && Character.isLetter(x[i]))
            {
                if(Character.isUpperCase(x[i]))
                {
                    if(x[i]!='Z'&& n<26)
                    {
                        x[i]=(char)(((int)x[i])+n);
                    }
                    else
                    {
                        x[i] = (char)(n+64);
                    }
                }
                else
                {
                    if(x[i]!='z'&& n<26)
                    {
                        x[i]=(char)(((int)x[i])+n);
                    }
                    else
                    {
                        x[i] = (char)(n+96);
                    }
                }
            }
        }
        for(int j = 0; j<s.length(); j++)
        {
            System.out.print(x[j]);
        }
    }
}
