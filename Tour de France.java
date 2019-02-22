import java.util.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt())
		{
			int f=in.nextInt();
			if(f==0)
			  break;
			int r=in.nextInt();
			int front[]=new int[f],rear[]=new int[r];
			for(int i=0;i<f;i++)
			    front[i]=in.nextInt();
			for(int j=0;j<r;j++)
			    rear[j]=in.nextInt();
			List<Double>ratio=new ArrayList<>();
			for(int i=0;i<f;i++)
			{
				for(int j=0;j<r;j++)
					ratio.add(rear[j]*1.0/front[i]);
			}
			Collections.sort(ratio);
			double res =-1;
			for (int i=0;i<ratio.size()-1;i++) 
				res=Math.max(res,ratio.get(i+1)/ratio.get(i));
			System.out.printf("%.2f\n",res);
		}
	}
}
