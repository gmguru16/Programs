import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
	public static void main (String[] args)
	 {
	 Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T-->0)
		{
		int n=in.nextInt();
			int b=in.nextInt();
			int h=in.nextInt();
			int w=in.nextInt();
			int m=Integer.MAX_VALUE,f=0,s=b;
			for(int i=0;i<h;i++)
			{
				int p=in.nextInt();
				int[] a=new int[w];
				for(int j=0;j<w;j++)
				{
					a[j]=in.nextInt();
					if(a[j]>=n)
					m=n*p;
					if(m<=b&&s>m)
					{
						s=m;
						f=1;
					}
				}
			}
			if(f==0||s==0)
			System.out.println("stay home");
			else
			System.out.println(s);
		}
	 }
}
