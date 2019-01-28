
import java.io.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args) throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            StringTokenizer st=new StringTokenizer(in.readLine());
            int m=Integer.parseInt(st.nextToken());
            int n=Integer.parseInt(st.nextToken());
            if(n==0 &&m==0)
                break;
            Set<Integer> ts=new TreeSet<>();
            for(int i=0;i<m;i++)
                ts.add(Integer.parseInt(in.readLine()));
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(ts.contains(Integer.parseInt(in.readLine())))
                    count++;
            }
            System.out.println(count);
        }
        
    }
}
