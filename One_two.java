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
		    String s=in.next();
		    if(s.length()==3)
		    {
		        if((s.charAt(0)=='o' && s.charAt(1)=='n')||(s.charAt(0)=='o' && s.charAt(2)=='e')|| (s.charAt(1)=='n' && s.charAt(2)=='e'))
		            System.out.println("1");
                else
                    System.out.println("2");
		    }
		    else
    		    System.out.println("3");
		}
    }
}
