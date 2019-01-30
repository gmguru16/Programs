import java.io.*;
import java.util.*;

class Main 
{
	public static void main (String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    int t=1;
	    while(true)
	    {
	        String s=in.next();
	        if(s.equals("end"))
	            break;
            char a[]=new char[26];
            int res=0;
            for(int i=0;i<s.length();i++)
            {
                char temp=s.charAt(i);
                int j=0;
                for(;j<res;j++)
                {
                    if(a[j]>=temp)
                    {
                        a[j]=temp;
                        break;
                    }
                }
                if(j==res)
                {
                    a[res]=temp;
                    res++;
                }
            }
	    System.out.println("Case "+t+": "+res);
	    t++;
	    }
	}
}
