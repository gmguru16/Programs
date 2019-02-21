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
		    List<String> com=new ArrayList<>();
		    int a[][]=new int[n][2];
		    for(int i=0;i<n;i++)
		    {
		        com.add(in.next());
		        a[i][0]=in.nextInt();
		        a[i][1]=in.nextInt();
		        
		    }
		    
		    int m=in.nextInt();
		    while(m-->0)
		    {
		        int x=in.nextInt(),count=0,z=-1;
		        for(int i=0;i<n;i++)
		        {
		            int f=0;
		            if(x>=a[i][0]&&x<=a[i][1])
		            {
		                count++;
	                    if(count==1&&f==0)
	                    {   
	                        z=i;
	                        f=1;
	                    }
                        else if(f==0&&count>1)
                            z=-1;
		            }
		        }
		        if(z!=-1)
		            System.out.println(com.get(z));
	            else
	                System.out.println("UNDETERMINED");
		    }
		    if(t>0)
		        System.out.println();
		}
	}
}
