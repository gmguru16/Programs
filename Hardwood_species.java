import java.io.*;
import java.util.*;

class Main
{
	public static void main (String[] args) throws IOException
	{
	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(in.readLine());
	    in.readLine();
	    for(int n=0;n<t;n++)
	    {
	        Map<String,Integer> tm=new TreeMap<>();
	        String s;
	        int size=0;
	        while((s=in.readLine())!=null)
	        {
	        if(s.length()==0)
	            break;
	        if(tm.containsKey(s))
	            tm.put(s,tm.get(s)+1);
	        else
	            tm.put(s,1);
            size++;
    	    }
	        for(String i : tm.keySet())
		        System.out.printf("%s %.4f\n",i,tm.get(i)*100.0/size);
	        if(n<t-1)
	            System.out.println();
	    }
	}
}
