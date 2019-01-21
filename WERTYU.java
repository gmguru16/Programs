import java.io.*;
import java.util.*;

class  Main 
{
    public static void main(String[] args) throws IOException
    {
        Scanner in=new Scanner(System.in).useDelimiter("\\n");
        while(in.hasNext())
        {
            String s=in.nextLine();
            String keys="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
            int l=s.length();
            for(int i=0;i<l;i++)
            {
                if(s.charAt(i)==' ')
                    System.out.print(" ");
                else    
                    System.out.print(keys.charAt(keys.indexOf(s.charAt(i))-1));
            }
            System.out.println();
        }
        
        
    }
}
