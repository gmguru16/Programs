import java.util.*;
import java.lang.*;
import java.io.*;

 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int t=in.nextInt(), x = 1;
        while(x<=t)
        {
            int n=in.nextInt();
            int a[] = new int[n+1];
            for(int i = 1; i <= n; i++)
                a[i]=in.nextInt();
            int k = 0, temp;
            for(int i = 1; i <= n; i++) 
            {
                if(a[i]-a[i-1] > k)
                    k = a[i]-a[i-1];
            }
            temp = k;
            for(int i = 1; i <= n; i++)
            {
                if(a[i]-a[i-1] == k)
                    k--;
                else if(a[i]-a[i-1] > k) 
                {
                temp++;
                break;
                }
            }
            System.out.println("Case "+x+": "+temp);  
            x++;
        }
	}
}
