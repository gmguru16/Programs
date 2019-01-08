import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
public static void main (String[] args) throws IOException
{
	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(in.readLine()); 
	    for(int l=0;l<t;l++)
	    {
	        String s=in.readLine();
    	    s= s.replaceAll("\\p{Punct}","");
    	    s=s.replaceAll("\\s","");
        	int x = (int) Math.sqrt(s.length()),k=0;
        	if(x*x!=s.length())
        	{
        	    System.out.println("Case #"+(l+1)+":\nNo magic :(");
        	    continue;
        	}
        	char s2[][]=new char[x][x];
        	for(int i=0;i<x;i++)
        	{
        	    for(int j=0;j<x;j++)
        	    {
        	        s2[i][j]=s.charAt(k++);
        	    }
        	}
            String a="";
            for(int i=0;i<x;i++)
            {
                for(int j=0;j<x;j++)
                {
                    a=a+""+s2[i][j];
                }
            }
           if(!a.equals(s))
           {
               System.out.println("Case #"+(l+1)+":\nNo magic :(");
               continue;
           }
           a="";
           for(int i=0;i<x;i++)
            {
                for(int j=0;j<x;j++)
                {
                    a=a+""+s2[j][i];
                }
            }
           if(!a.equals(s))
           {
               System.out.println("Case #"+(l+1)+":\nNo magic :(");
               continue;
           }
           a="";
           for(int i=x-1;i>=0;i--)
            {
                for(int j=x-1;j>=0;j--)
                {
                    a=a+""+s2[i][j];
                }
            }
            if(!a.equals(s))
            {
                System.out.println("Case #"+(l+1)+":\nNo magic :(");
                continue;
            }
            a="";
            for(int i=x-1;i>=0;i--)
            {
                for(int j=x-1;j>=0;j--)
                {
                    a=a+""+s2[j][i];
                }
            }
            if(!a.equals(s))
            {
                System.out.print("Case #"+(l+1)+":\nNo magic :(");
                continue;
            }
            System.out.println("Case #"+(l+1)+":\n"+x);
	    }
}
}

