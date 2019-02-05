import java.io.*;
import java.util.*;

class Main 
{
	public static void main (String[] args) 
	{
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    for(int j=0;j<t;j++)
	    {
	        int a[]=new int[3];
	        List<Integer> green=new ArrayList<>();
	        List<Integer> blue=new ArrayList<>();
	        for(int i=0;i<3;i++)
	            a[i]=in.nextInt();
            for(int i=0;i<a[1];i++)
                green.add(in.nextInt());
            for(int i=0;i<a[2];i++)
                blue.add(in.nextInt());
            Collections.sort(green,Collections.reverseOrder());
            Collections.sort(blue,Collections.reverseOrder());
            while(green.size()!=0 && blue.size()!=0)
            {
                if(green.get(0)>blue.get(0))
                {
                    int x=green.get(0)-blue.get(0);
                    green.remove(0);
                    blue.remove(0);
                    if(green.contains(x))
                        green.add(green.indexOf(x),x);
                    else
                    {
                        green.add(x);
                        Collections.sort(green,Collections.reverseOrder());
                    }
                }
                else if(green.get(0)<blue.get(0))
                {
                    int x=blue.get(0)-green.get(0);
                    green.remove(0);
                    blue.remove(0);
                    if(green.contains(x))
                        blue.add(blue.indexOf(x),x);
                    else
                    {
                        blue.add(x);
                        Collections.sort(blue,Collections.reverseOrder());
                    }
                }
                else
                {
                    green.remove(0);
                    blue.remove(0);
                }
            }
            if(blue.size()==0 && green.size()==0)
            	System.out.println("green and blue died");
	    else if(green.size()!=0 && blue.size()==0)
	    {
		    System.out.println("green wins");
		    for(int i=0;i<green.size();i++)
		   	System.out.println(green.get(i));
	    }
            else if(green.size()==0 && blue.size()!=0)
	    {
		    System.out.println("blue wins");
		    for(int i=0;i<blue.size();i++)
		   	System.out.println(blue.get(i));
	    }
            if(j+1<t)
		System.out.println();
	    }
	}
}
