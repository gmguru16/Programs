import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
	public static void main (String[] args)
	 {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt(),k=0;
	    while(t-->0)
	    {
	        int n=in.nextInt();
	        ArrayList a1=new ArrayList<Integer>(n);
	        for(int i=0;i<n;i++)
	        {
	            a1.add(in.nextInt());
	        }
	        k++;
	        System.out.println("Case "+k+": "+Collections.max(a1));
	    }
	 }
}

