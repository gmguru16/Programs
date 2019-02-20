import java.util.*;
import java.io.*;

class Main 
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int cases=1;
	    while(true)
	    {
	        int n=Integer.parseInt(in.readLine());
	        if(n==0)
	            break;
	        System.out.println("Case "+cases+":");
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=Integer.parseInt(in.readLine());
            List<Integer>b=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                   b.add(a[i]+a[j]);
            }
            Collections.sort(b);
            int m=Integer.parseInt(in.readLine());
            for(int i=0;i<m;i++)
            {
                int x=Integer.parseInt(in.readLine());
                int min=Integer.MAX_VALUE,res=-1;
                for(int j=0;j<b.size();j++)
                {
                    int dif=Math.abs(x-b.get(j));
                    if(dif<min)
                    {
                        min=dif;
                        res=b.get(j);
                    }
                }
                System.out.println("Closest sum to "+x+" is "+res+".");
            }
            cases++;
	    }
	}
}
