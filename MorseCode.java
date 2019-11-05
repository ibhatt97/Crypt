import java.io.*;
import java.lang.*;
import java.util.*;

public class MorseCode
{
    public static void main()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String s = sc.nextLine();
        s=s.toUpperCase();
        String b = "";
        char x;
        String y = "";
        for(int i=0; i<s.length(); i++)
        {
            x=s.charAt(i);
            switch(x)
            {
                case 'A':   y="._";   break;
                case 'B':   y="_...";   break;
                case 'C':   y="_._.";   break;
                case 'D':   y="_..";   break;
                case 'E':   y=".";   break;
                case 'F':   y=".._.";   break;
                case 'G':   y="__.";   break;
                case 'H':   y="....";   break;
                case 'I':   y="..";   break;
                case 'J':   y=".___";   break;
                case 'K':   y="_._";   break;
                case 'L':   y="._..";   break;
                case 'M':   y="__";   break;
                case 'N':   y="_.";   break;
                case 'O':   y="___";   break;
                case 'P':   y=".__.";   break;
                case 'Q':   y="__._";   break;
                case 'R':   y="._.";   break;
                case 'S':   y="...";   break;
                case 'T':   y="_";   break;
                case 'U':   y=".._";   break;
                case 'V':   y="..._";   break;
                case 'W':   y=".__";   break;
                case 'X':   y="_.._";   break;
                case 'Y':   y="_.__";   break;
                case 'Z':   y="__..";   break;
                case '!':   y="_._.__";   break;
                case '@':   y=".__._.";   break;
                case '#':   y="";   break;    //excluded character
                case '$':   y="";   break;    //excluded character
                case '%':   y="";   break;    //excluded character
                case '^':   y="";   break;    //excluded character
                case '&':   y="._...";   break;
                case '*':   y="";   break;    //excluded character
                case '(':   y="_.__.";   break;
                case ')':   y="_.__._";   break;
                case '[':   y="";   break;    //excluded character
                case ']':   y="";   break;    //excluded character
                case '{':   y="";   break;    //excluded character
                case '}':   y="";   break;    //excluded character
                case '|':   y="";   break;    //excluded character
                case '\\':   y="";   break;    //excluded character
                case ':':   y="___...";   break;
                case ';':   y="";   break;    //excluded character
                case '\'':   y=".____.";   break;
                case '\"':   y="._.._.";   break;
                case '<':   y="";   break;    //excluded character
                case '>':   y="";   break;    //excluded character
                case '?':   y="..__..";   break;
                case '/':   y="_.._.";   break;
                case '+':   y="._._.";   break;
                case '-':   y="";   break;    //excluded character
                case '_':   y="";   break;    //excluded character
                case '`':   y="";   break;    //excluded character
                case '~':   y="";   break;    //excluded character
                case '0':   y="_____";   break;
                case '1':   y=".____";   break;
                case '2':   y="..___";   break;
                case '3':   y="...__";   break;
                case '4':   y="...._";   break;
                case '5':   y=".....";   break;
                case '6':   y="_....";   break;
                case '7':   y="__...";   break;
                case '8':   y="___..";   break;
                case '9':   y="____.";   break;
                case ' ':   y="/";    break;
                default:y="";
            }
            b = b.concat(" ".concat(y));
            y="";
        }
        System.out.println("The now morse code is:\n"+b);
    }
}

The output os expected to be:

Enter a text: Ricky is a good boy
The now morse code is:
._. .. _._. _._ _.__ / .. ... / ._ / __. ___ ___ _.. / _... ___ _.__
