import java.io.*;
import java.util.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt(),m=t;
		while(t-->0)
		{
		    int n=in.nextInt(),j=0,c=0;
		    String s[]=new String[n],str;
		    ArrayList<String>s2=new ArrayList<>();
		    for(int i=0;i<n;i++)
		    	s[i]=in.next();
		    while(!(str=in.next()).equals("END"))
		    {
		    	s2.add(str);
		    	j++;
		    }
		    if(t!=(m-1))
		    	System.out.println();
		    for(int i=0;i<j;i++)
		    {
		        System.out.println("Anagrams for: "+s2.get(i));
		        for(int k=0;k<n;k++)
		        {
		            
		            if(anagram(s2.get(i),s[k]))
		            {
		                ++c;
		                System.out.println("  "+c+") "+s[k]);
		            }
		            
		        }
		        if(c==0)
		        System.out.println("No anagrams for: "+s2.get(i));
		        c=0;
		    }
		}
	}
	public static boolean anagram(String a,String b)
    	{
        	char c[]=a.toCharArray();
        	char d[]=b.toCharArray();
        	Arrays.sort(c);
        	Arrays.sort(d);
        	if(c.length!=d.length)
        	return false;
        	for(int i=0;i<c.length;i++)
        	{
            		if(c[i]!=d[i])
            		return false;
        	}
        	return true;
    	}
}

