import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while (tc-- > 0) {
            int n = in.nextInt(),t = in.nextInt(),m = in.nextInt();
            Queue<Car> q = new ArrayDeque<Car>();
            for (int i = 0; i < m; i++) {
                int arr=in.nextInt();
                String side=in.next();
                q.add(new Car(i, arr, side));
            }
            boolean l=true;
            int time=0;
            int result[]=new int[m];
            while (!q.isEmpty()) {
                Car c=q.peek();
                int x=c.arr;
                if (c.side==l)
                {
                    int load=0;
                    Queue<Car>q2=new ArrayDeque<Car>();
                    while (!q.isEmpty())
                    {
                        c=q.poll();
                        if (c.arr<=time && c.side==l && load<n)
                        {
                            result[c.lno]=time+t;
                            load++;
                        } 
                        else
                            q2.add(c);
                        
                    }
                    q.addAll(q2);
                    if (load > 0)
                    {
                        l= !l;
                        time += t;
                    } 
                    else 
                        time = x;
                    
                } 
                else 
                {
                    int load = 0;
                    Queue<Car> q2 = new ArrayDeque<Car>();
                    while (!q.isEmpty())
                    {
                        c= q.poll();
                        if (c.arr <= time && c.side == l && load < n) 
                        {
                            result[c.lno] = time + t;
                            load++;
                        } 
                        else 
                            q2.add(c);
                        
                    }
                    q.addAll(q2);
                    l = !l;
                    if (x > time) 
                        x -= time;
                     else 
                        x = 0;
                    
                    time += x + t;
                }
            }
            for (int i = 0; i < m; i++) 
                System.out.println(result[i]);
            
            if (tc > 0) 
                System.out.println();
            
        }
    }

    static class Car 
    {

        int arr, lno;
        boolean side;

        public Car(int i, int arr, String side)
        {
            lno= i;
            this.arr = arr;
            this.side =side.equals("left") ? true : false;
        }
    }
}
