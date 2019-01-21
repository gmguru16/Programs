import java.io.*;
import java.util.*;

class Main 
{
	public static void main (String[] args) throws IOException
	{
	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(in.readLine());
	    while(t-->0)
	    {
	        String s=in.readLine();
	        int h=Integer.parseInt(s.substring(0,2));
	        int m=Integer.parseInt(s.substring(3));
	        
	        m=(60-m)%60;
	        h=12-h;
	        if(m!=0)
	            --h;
            h=(h+12)%12;
            if(h==0)
                h=12;
            System.out.printf("%02d:%02d\n", h, m);
	    }
	}
}
