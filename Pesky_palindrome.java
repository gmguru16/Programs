import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[]args)throws IOException 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
		    String s=in.next();
		    Set<String> hs=new HashSet<>();
		    for(int i=0;i<s.length();i++)
		    {
        		for(int j=i+1;j<=s.length();j++)
        		{
        			StringBuilder s1=new StringBuilder(s.substring(i,j));
        			StringBuilder s2=new StringBuilder(s.substring(i,j));
        			if(s1.toString().equals(s2.reverse().toString()))
        				hs.add(s1.toString());
        		}
        	}
        	System.out.println("The string '"+s+"' contains "+hs.size()+" palindromes.");
        }
		
	}
}
