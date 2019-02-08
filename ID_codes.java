import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()) != null)
        {
            if (s.equals("#")) 
                break;
            
            boolean ada = false;
            int a[] = new int[s.length()];
            for (int i = 0; i < s.length(); i++) 
                a[i] = s.charAt(i) - 'a';
            
            while (permutation(a)) 
            {
                ada = true;
                for (int i = 0; i < a.length; i++) 
                    System.out.print((char) (a[i] + 'a'));
                
                System.out.println();
                break;
            }
            if (!ada) 
                System.out.println("No Successor");
            
        }
    }

    static boolean permutation(int[] b) 
    {
        for (int i= b.length - 2;i>=0;--i)
        {
            if (b[i]<b[i+1]) 
            {
                for (int j=b.length-1;;--j) 
                {
                    if (b[j]>b[i])
                    {
                        int t = b[i];
                        b[i] = b[j];
                        b[j] = t;
                        for (++i, j= b.length-1;i<j; ++i, --j) 
                        {
                            t = b[i];
                            b[i] = b[j];
                            b[j] = t;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()) != null)
        {
            if (s.equals("#")) 
                break;
            
            boolean ada = false;
            int a[] = new int[s.length()];
            for (int i = 0; i < s.length(); i++) 
                a[i] = s.charAt(i) - 'a';
            
            while (permutation(a)) 
            {
                ada = true;
                for (int i = 0; i < a.length; i++) 
                    System.out.print((char) (a[i] + 'a'));
                
                System.out.println();
                break;
            }
            if (!ada) 
                System.out.println("No Successor");
            
        }
    }

    static boolean permutation(int[] b) 
    {
        for (int i= b.length - 2;i>=0;--i)
        {
            if (b[i]<b[i+1]) 
            {
                for (int j=b.length-1;;--j) 
                {
                    if (b[j]>b[i])
                    {
                        int t = b[i];
                        b[i] = b[j];
                        b[j] = t;
                        for (++i, j= b.length-1;i<j; ++i, --j) 
                        {
                            t = b[i];
                            b[i] = b[j];
                            b[j] = t;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
