
import java.io.*;
import java.util.*;

class Main
{
    public static void main(String [] args) 
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
            boolean count=false;
            for(int i=-22;i<=22 && !count ;i++)
            {
                for(int j=-100;j<=100&& !count;j++)
                {
                    if(i!=j && i*i+j*j<=c)
                    {
                        int p=a-i-j;
                        if(i!=p && j!=p && i*j*p==b && i*i+j*j+p*p==c)
                        {
                            System.out.println(i+" "+j+" "+p);
                            count=true;
                        }
                    }
                }
            }
            if(!count)
                System.out.println("No solution.");
            
        }
    }
}
