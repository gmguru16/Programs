import java.io.*;
import java.util.*;


class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt(),max=0,s=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            if(n>0)  {
            HashMap<Integer,Integer> hs=new HashMap<>();
            int b[]=new int[n];
            b[0]=1;
            hs.put(a[0],0);
            for(int i=1;i<n;i++)
            {
                if(hs.containsKey(a[i]))
                {
                    int e=hs.get(a[i]);
                    for(int j=s;j<=e;j++)
                        hs.remove(a[j]);
                    s=e+1;
                    b[i]=i-s+1;
                }
                else
                    b[i]=b[i-1]+1;
                hs.put(a[i],i);
            }
            for (int i : b)
                max=Math.max(i, max);
            }
            System.out.println(max);
        }
    }
}
