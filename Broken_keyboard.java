import java.io.*;
import java.util.*;

class Main {
	
	
	public static void main (String [] abc) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) 
		{
			List<Character> al=new LinkedList<>();
			int pointer=0;
			for (char c : s.toCharArray())
			{
				if (c=='[') 
				    pointer=0;
				else if (c==']')
                    		    pointer=al.size();
				else 
				    al.add(pointer++,c);
			}
			
			StringBuilder sb=new StringBuilder();
			for (char c : al) sb.append(c);
			System.out.println(sb.toString());
		}
	}
}
