import java.io.*;
import java.util.*;
class Codechef {
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt(),b=in.nextInt(),a=in.nextInt(),bb=1,ac=0,re=0;
		    List<Integer> al=new ArrayList<>();
		    List<Integer> bob=new ArrayList<>();
		    List<Integer> alice=new ArrayList<>();
		    for(int i=0;i<n;i++)
		        al.add(in.nextInt());
	        for(int i=0;i<al.size();i++)
	        {
	            if(al.get(i)%b==0)
	                bob.add(al.get(i));
                if(al.get(i)%a==0)
                    alice.add(al.get(i));
	        }
	        Collections.sort(bob, Collections.reverseOrder());
	        Collections.sort(alice, Collections.reverseOrder());
	        for(int i=0;i<bob.size();i++)
	        {
	            for(int j=0;j<alice.size();j++)
	            {
	                if(bob.get(0)==alice.get(j))
	                    alice.remove(alice.get(j));
	            }
	        }
	        while(bb==1||ac==1)
	        {
	            if(bb==1)
	            {
	                bb=0;
	                ac=1;
	                if(bob.size()!=0)
	                    bob.remove(bob.get(0));
	            }
	            else if(ac==1)
	            {
	                ac=0;
	                bb=1;
	                if(alice.size()!=0)
	                    alice.remove(alice.get(0));
	            }
	            if(bob.size()==0||alice.size()==0)
	            {
	                bb=0;
	                ac=0;
	            }
	            
	        }
	        if(alice.size()==0||b==a)
	            System.out.println("BOB");
            else if(bob.size()==0) 
                System.out.println("ALICE");
		}
	}
}
