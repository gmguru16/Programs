import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    while(in.hasNextInt())
	    {
	    int n=in.nextInt();
	    int a[]=new int[n];
	    for(int j=0;j<n;j++)
	    {
	        a[j]=in.nextInt();
	    }
	    int s=in.nextInt();
	    int d=a[0];
	    int one=0,two=0;
	    Arrays.sort(a);
	    for(int i=0;i<n-1;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(a[i]+a[j]==s)
	            {
	                    one=a[i];
	                    two=a[j];
	            }
	        }
	    }
	    System.out.println("Peter should buy books whose prices are "+one+" and "+two+".\n");
	    }
	}
}
