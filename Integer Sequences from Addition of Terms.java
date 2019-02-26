import java.util.*;
import java.io.*;

class Main 
{
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    long x=0,y=2;
		    long a[]=new long[n+1];
		    List<Long>al=new ArrayList<>();
		    for(int i=0;i<n+1;i++)
		        a[i]=in.nextLong();
	        long d=in.nextLong(),k=in.nextLong(),e=d;
	        while(al.size()<k)
	        {
	            x++;
	            for(int i=1;i<=d;i++)
                {
                    if(al.size()<k)
                        al.add(x);
                }
                d=e*y;
                y++;
                
	        }
	        long z=al.get((int)k-1);
	        long re=a[0];
	        long temp=z;
	        for(int i=1;i<n+1;i++)
	        {
	            re+=(a[i]*z);
	            z*=temp;
	        }
	        System.out.println(re);
		}
	}
}
