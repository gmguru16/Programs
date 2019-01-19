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
		    List<Integer>al=new ArrayList<>();
		    for(int i=0;i<n;i++)
		        al.add(in.nextInt());
	        System.out.println((Collections.max(al)-Collections.min(al))*2);
		    
		}
    }
}
