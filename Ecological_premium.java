import java.io.*;
import java.util.*;

class  Main 
{
    public static void main(String[] args) throws IOException
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            long sum,tot=0;
            long a[]=new long[3];
            while(n-->0)
            {
                sum=0;
                for(int i=0;i<3;i++)
                    a[i]=in.nextInt();
                sum=a[0]*a[2];
                tot+=sum;
            }
            System.out.println(tot);
        }
        
        
    }
}
