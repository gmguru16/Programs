			/*-------------------- Wrong Code ----------------------*/
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
	        List<Integer> green=new ArrayList<>(a[1]);
	        List<Integer> blue=new ArrayList<>(a[2]);
			PriorityQueue<Integer> greenq=new PriorityQueue<>(Collections.reverseOrder()); 
			PriorityQueue<Integer> blueq=new PriorityQueue<>(Collections.reverseOrder());
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
                    greenq.add(green.get(0)-blue.get(0));
                    green.remove(0);
                    blue.remove(0);
                }
                else if(green.get(0)<blue.get(0))
                {
                    blueq.add(blue.get(0)-green.get(0));
                    green.remove(0);
                    blue.remove(0);
                }
                else
                {
                    green.remove(0);
                    blue.remove(0);
                }
            }
            if(blue.size()!=0)
            {
                for(int i=0;i<blue.size();i++)
                    blueq.add(blue.get(i));
            }
            else if(green.size()!=0)
            {
                for(int i=0;i<green.size();i++)
                    greenq.add(green.get(i));
            }
            while(greenq.size()!=0 && blueq.size()!=0)
            {
                if(greenq.peek()>blueq.peek())
                    greenq.add(greenq.poll()-blueq.poll());
                else if(greenq.peek()<blueq.peek())
                    blueq.add(blueq.poll()-greenq.poll());
                else
                {
                    greenq.poll();
                    blueq.poll();
                }
            }
            
            if(blueq.size()==0 && greenq.size()==0)
            	System.out.println("green and blue died");
    	    else if(greenq.size()!=0 && blueq.size()==0)
    	    {
		        System.out.println("green wins");
		        Object[] g = greenq.toArray();
		        Arrays.sort(g,Collections.reverseOrder());
                for ( int i = 0; i<g.length; i++ ) 
                    System.out.println(g[i]) ; 
	        }
            else if(greenq.size()==0 && blueq.size()!=0)
	        {
		        System.out.println("blue wins");
		        Object[] g = blueq.toArray();
		        Arrays.sort(g,Collections.reverseOrder());
		        for ( int i = 0; i<g.length; i++ ) 
                    System.out.println(g[i]) ; 
	        }   
            if(j+1<t)
		        System.out.println();
		  
	    }
	}
}
