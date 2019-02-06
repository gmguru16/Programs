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
            int left=0,right=0;
	        while(m-->0)
            {
	           
                String s1=side.peek();
                
                //System.out.println("-----");
	            if(s1.substring(s1.length()-4,s1.length())=="left") 
	            {
	                right=0;
                    while(s1.substring(s1.length()-4,s1.length())=="left" && 
                            left+Integer.parseInt(s1.substring(0,s1.length()-5))<l)
    	            {
    	                left+=Integer.parseInt(s1.substring(0,s1.length()-5));
	                    side.remove();
	                    break;
    	            }
	                tra++;
	               
                }
	            else 
	            {
	                left=0;
	                while(s1.substring(s1.length()-5,s1.length())=="right" &&
	                        right+Integer.parseInt(s1.substring(0,s1.length()-6))<l)
    	            {
    	                right+=Integer.parseInt(s1.substring(0,s1.length()-6));
	                    side.remove();
	                    break;
    	            }
	                tra++;
	                
	           }
            }
	   		System.out.println(tra);
	   		 
	    }
	}
}
