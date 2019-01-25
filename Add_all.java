import java.io.*;
import java.util.*;

class Main 
{
	public static void main (String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    while(in.hasNext())
	    {
	        int n=in.nextInt();
	        if(n==0)
	            break;
            Queue<Long> q=new PriorityQueue<>();
            for(int i=0;i<n;i++)
                q.offer(in.nextLong());
            long res=0;
            while(!q.isEmpty() && n>1)
            {
                long i=q.poll()+q.poll();
                res+=i;
                q.offer(i);
                n--;
            }
		System.out.println(res);
	    }
	}
}
