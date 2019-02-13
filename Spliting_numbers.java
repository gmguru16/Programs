import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            int n = in.nextInt();
            if (n == 0) 
                break;
            String s = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
            String a = "",b = "";
            boolean first = false;
            for (int i = 0; i < s.length(); i++) 
            {
                if (s.charAt(i) == '1')
                {
                    if (first)
                    {
                        a += "0";
                        b += "1";
                    } 
                    else 
                    {
                        a += "1";
                        b += "0";
                    }
                    first = !first;
                } 
                else 
                {
                    a += "0";
                    b += "0";
                }
            }
            System.out.println(Integer.parseInt(new StringBuilder(a).reverse().toString(), 2)+" "
            +Integer.parseInt(new StringBuilder(b).reverse().toString(), 2));
        }
    }
}
