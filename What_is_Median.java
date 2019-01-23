import java.util.*;
import java.io.*;

class Main
{
     public static void main (String[] args)
     {
         Scanner in=new Scanner(System.in);
         int n=0;
         List<Integer>al=new ArrayList<>();
         while(in.hasNext())
         {
             n=in.nextInt();
             al.add(n);
             Collections.sort(al);
             int res=((al.size()>1 && al.size()%2==0) ? (al.get((al.size()-1)/2)+
                    al.get(al.size()/2))/2 : (al.get((al.size()-1)/2)));
             System.out.println(res);
         }
        
     }
}
