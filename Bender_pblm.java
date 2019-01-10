import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[]args)throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null && !s.equals("0")) {			
			int L=Integer.parseInt(s);
			String curr="+x";
			HashMap<String,String> map=new HashMap<>();
			map.put("+x+x", "+x");
			map.put("+x-x", "+x");
			map.put("+x+y", "+y");
			map.put("+x-y", "-y");
			map.put("+x+z", "+z");
			map.put("+x-z", "-z");
			
			map.put("-x+x", "-x");
			map.put("-x-x", "+x");
			map.put("-x+y", "-y");
			map.put("-x-y", "+y");
			map.put("-x+z", "-z");
			map.put("-x-z", "+z");
			
			map.put("+y+x", "+y");
			map.put("+y-x", "-y");
			map.put("+y+y", "-x");
			map.put("+y-y", "+x");
			map.put("+y+z", "+y");
			map.put("+y-z", "+y");
			
			map.put("-y+x", "-y");
			map.put("-y-x", "+y");
			map.put("-y+y", "+x");
			map.put("-y-y", "-x");
			map.put("-y+z", "-y");
			map.put("-y-z", "-y");
			
			map.put("+z+x", "+z");
			map.put("+z-x", "-z");
			map.put("+z+y", "+z");
			map.put("+z-y", "+z");
			map.put("+z+z", "-x");
			map.put("+z-z", "+x");
			
			map.put("-z+x", "-z");
			map.put("-z-x", "+z");
			map.put("-z+y", "-z");
			map.put("-z-y", "-z");
			map.put("-z+z", "+x");
			map.put("-z-z", "-x");
			
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			for (int i=0;i<L-1;i++) {
				String op=st.nextToken();
				if (!op.equals("No")) {
					curr=map.get(curr+op);
				}
			}
			
			System.out.println(curr);
		}
	}
}
