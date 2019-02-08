import java.io.*;
import java.util.*;

class Main 
{
	public static void main (String[] args) throws IOException
	{
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    for(int j=0;j<t;j++)
	    {
	        int a[]=new int[3];
			PriorityQueue<Integer> greenq=new PriorityQueue<>(Collections.reverseOrder()); 
			PriorityQueue<Integer> blueq=new PriorityQueue<>(Collections.reverseOrder());
			for(int v=0;v<3;v++)
                a[v]=in.nextInt();
            for(int i=0;i<a[1];i++)
                greenq.add(in.nextInt());
            for(int i=0;i<a[2];i++)
                blueq.add(in.nextInt());
            while(true)
            {
                if (greenq.isEmpty() && blueq.isEmpty()) 
                {
                    System.out.println("green and blue died");
                    break;
                }
                else if (greenq.isEmpty()) 
                {
                    System.out.println("blue wins");
                    while (!blueq.isEmpty()) 
                        System.out.println(blueq.poll());
                    break;
                }
                else if (blueq.isEmpty()) 
                {
                    System.out.println("green wins");
                    while (!greenq.isEmpty()) 
                        System.out.println(greenq.poll());
                    break;
                }
                else
                {
                    int count = 0;
                    List<Integer> g = new ArrayList<>();
                    List<Integer> b = new ArrayList<>();
                    
                    while (!greenq.isEmpty() && !blueq.isEmpty() && count < a[0])
                    {
                        int m = greenq.poll();
                        int n = blueq.poll();
                        if (m>n) 
                            g.add(m-n);
                        else if (n>m)
                            b.add(n-m);
                        count++;
                    }
                    greenq.addAll(g);
                    blueq.addAll(b);
                       
                }
            }
            if(j+1<t)
		        System.out.println();
		  
	    }
	}
}
