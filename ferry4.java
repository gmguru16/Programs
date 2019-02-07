import java.util.*;
import java.io.*;

class Main 
{
	public static void main (String[] args) 
	{
	    Scanner in=new Scanner(System.in).useDelimiter("\\n");
	    int t=in.nextInt();
	    while(t-->0)
	    {
	        String s=in.next();
	        String[] str= s.split("\\s+");
	        int l=Integer.parseInt(str[0]),m=Integer.parseInt(str[1]),tra=0;
	        l*=100;
            Queue<String> side = new LinkedList<>();	       
            for(int i=0;i<m;i++)
                side.add(in.next());
            String r=side.element();
            String s3=r.substring(r.length()-5,r.length());
            int left=0,right=0,h=0,g=0,z=1;
	        while(true)
            { 
                if(side.size()==0)
                    break;
                String s1=side.poll(),s2="00000";
                if(side.size()!=0)
                    s2=side.peek();
	            if(s1.substring(s1.length()-4,s1.length()).equals("left")) 
	            {
	                right=0;
	                g=0;
                    while(s1.substring(s1.length()-4,s1.length()).equals("left") && 
                            left+Integer.parseInt(s1.substring(0,s1.length()-5))<=l  && g==0)
    	            {
    	                g++;
	                    left+=Integer.parseInt(s1.substring(0,s1.length()-5));
    	                
    	            }
    	            if(s2.substring(s2.length()-5,s2.length()).equals("right")||s2.equals("00000"))
    	            {
    	                tra++;
    	                left=0;
    	            }
    	            else if((s2.substring(s2.length()-4,s2.length()).equals("left")&&
    	             !(left+Integer.parseInt(s2.substring(0,s2.length()-5))<=l)))
    	             {
    	                 tra+=2;
    	                 left=0;
    	             }
                }
	            else 
	            {
	                
	                left=0;
	                h=0; 
	                while( s1.substring(s1.length()-5,s1.length()).equals("right") &&
	                        right+Integer.parseInt(s1.substring(0,s1.length()-6))<=l && h==0)
    	            {
    	                h++;
    	                right+=Integer.parseInt(s1.substring(0,s1.length()-6));
    	            }
    	            if(s2.substring(s2.length()-4,s2.length()).equals("left")||s2.equals("00000"))
    	            {
    	                tra++;
    	                right=0;
    	            }
    	            else if((s2.substring(s2.length()-5,s2.length()).equals("right")&&
    	             !(right+Integer.parseInt(s2.substring(0,s2.length()-6))<=l)))
    	             {
    	                 tra+=2;
    	                 right=0;
    	             }
	           }
	           
            }
            if(s3.equals("right"))
	   		    System.out.println(tra+1);
   		    else    
   		        System.out.println(tra);
	   		 
	    }
	}
}
