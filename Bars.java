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
		    int len=in.nextInt();
		    int n=in.nextInt(),a[]=new int[1001];
		    a[0]=1;
		    for(int i=0;i<n;i++)
		    {
		        int l=in.nextInt();
		        for(int j=len-l;j>=0;j--)
		        {
		            if(a[j]==1)
		                a[j+l]=1;
		        }
		    }
		    if(a[len]==1)
		        System.out.println("YES");
	        else 
	            System.out.println("NO");
		}
	}
}
