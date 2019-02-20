import java.util.*;
import java.io.*;

class Main 
{
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
		    int k=in.nextInt(),count=0;
		    for(int i=k+1;i<=2*k;i++)
		    {
		        if((i*k)%(i-k)==0)
		            count++;
		    }
		    System.out.println(count);
		    for(int i=k+1;i<=2*k;i++)
		    {
		        if((i*k)%(i-k)==0)
		            System.out.println("1/"+k+" = 1/"+(i*k)/(i-k)+" + 1/"+i);
		    }
		}
	}
}
