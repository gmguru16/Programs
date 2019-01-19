import java.io.*;
import java.util.*;
import java.lang.*;

class Main 
{
    public static boolean anagram(String a,String b)
    {
        a=a.replaceAll("\\s+","");
        b=b.replaceAll("\\s+","");
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(c.length!=d.length)
        return false;
        for(int l=0;l<c.length;l++)
        {
            if(c[l]!=d[l])
            return false;
        }
        return true;
    }
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in).useDelimiter("\\n");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
		    ArrayList<String>t=new ArrayList<>();
		    String s;int c=0;
		    while(in.hasNext())
		    {
		        s=in.next();
		        if(!(s.equals("")))
		        {
		        	t.add(s);
		        	c++;
		        }
		        else if(c!=0)
		        	break;
		    }
		    if(i>0)
		    System.out.println();
		    Collections.sort(t);
		    for(int j=0;j<t.size();j++)
		    {
		        for(int k=j+1;k<t.size();k++)
		        {
		            if(anagram(t.get(j),t.get(k)))
		            	System.out.println(t.get(j)+" = "+t.get(k));
		        }
		    }
		}
	}
}

