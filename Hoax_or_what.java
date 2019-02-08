import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=in.readLine()).equals("0"))
        {
            int n=Integer.parseInt(s);
            long c=0;
            TreeMap<Integer,Integer> m=new TreeMap<>();
            for(int i=0;i<n;i++)
            {
                StringTokenizer st=new StringTokenizer(in.readLine());
                int k=Integer.parseInt(st.nextToken());
                for(int j=0;j<k;j++)
                {
                    int p=Integer.parseInt(st.nextToken());
                    m.put(p,m.getOrDefault(p,0)+1);
                }
                int high=m.lastKey();
                if(m.get(high)==1)
                    m.remove(high);
                else
                    m.put(high,m.get(high)-1);
                
                int low=m.firstKey();
                if(m.get(low)==1)
                    m.remove(low);
                else
                    m.put(low,m.get(low)-1);
                c+=(high-low);
            }
            System.out.println(c);
        }
    }
}
