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
	        int n=in.nextInt(),count=0;
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=in.nextInt();
	            if(i>0)
	            {
	                for(int j=0;j<i;j++)
	                {
	                    if(a[j]<=a[i])
	                        count++;
	                }
	                    
	            }
	        }
	        System.out.println(count);
	    }
	
	}
}
