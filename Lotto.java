import java.util.*;
import java.io.*;

class Main 
{
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int x=0;
		while(in.hasNext())
		{
		    int n=in.nextInt();
		    if(n==0)
		        break;
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		        a[i]=in.nextInt();
	        if(x!=0)
	            System.out.println();
	        for(int i=0;i<n;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                for(int k=j+1;k<n;k++)
	                {
	                    for(int l=k+1;l<n;l++)
                        {
                            for(int m=l+1;m<n;m++)
	                        {
	                            for(int o=m+1;o<n;o++)
	                                System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" "+
	                                        a[m]+" "+a[o]);
	                        }
                        }
	                }
	            }
	        }
	        
	        x++;
		}
	}
}
