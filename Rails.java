import java.io.*;
import java.util.*;

class Main 
{
    public static void main (String[] args) 
    {
        Scanner in=new Scanner(System.in);
        while(in.hasNext())
        {
            int n=in.nextInt();
            if(n==0)
                break;
             boolean b=true;
             while(b)
             {
                 Stack<Integer> s=new Stack<>();
                 int k=0;
                 for(int i=0;i<n;i++)
                 {
                     int a=in.nextInt();
                     if(a==0)
                     {
                         b=false;
                         break;
                     }
                     while(k<n && k!=a)
                     {
                         if(s.size()>0 && s.peek()==a)
                            break;
                         k++;
                         s.push(k);
                     }
                     if(s.peek()==a)
                        s.pop();
                 }
                 if(b)
                 {
                     if(s.size()==0)
                        System.out.println("Yes");
                     else
                        System.out.println("No");
                 }
             }
             System.out.println();
        }
    }
}
