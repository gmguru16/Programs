import java.util.*;
import java.io.*;

class Main 
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=in.readLine())!=null)
		{
		    int t=Integer.parseInt(s);
            Stack<Integer> st=new Stack<>();
			Queue<Integer> q=new LinkedList<>(); 
			PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); 
            boolean pqOK=true,stOK=true,qOK=true;
            for(int i=0;i<t;i++)  
            {
                String str=in.readLine();
    		    int a=Integer.parseInt(str.substring(0,1)),b=Integer.parseInt(str.substring(2));
    		    if(a==1)
    		    {
    		        if (stOK)
    		            st.push(b);
    				if (qOK) 
    				    q.offer(b);
    				if (pqOK)
    				    pq.offer(b);
    		    }
    		    else if (a==2)
    		    {
					if (stOK && (st.size()==0 || !st.pop().equals(b)))
					    stOK=false;
					if (qOK && (q.size()==0 || !q.poll().equals(b))) 
					    qOK=false;
					if (pqOK && (pq.size()==0 || !pq.poll().equals(b)))
					    pqOK=false;
				}
            }
            
			if (!stOK && !qOK && !pqOK) 
			    System.out.println("impossible");
			else if ((stOK && qOK) || (stOK && pqOK) || (qOK && pqOK)) 
			    System.out.println("not sure");
			else if (stOK) 
			    System.out.println("stack");
			else if (qOK)
			    System.out.println("queue");
			else if (pqOK) 
			    System.out.println("priority queue");
		    
		}
	}
}
