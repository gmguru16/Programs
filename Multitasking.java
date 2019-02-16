import java.util.*;
import java.io.*;

class Main 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        while (true) 
        {
            int n = in.nextInt();
            int m = in.nextInt();
            if (n + m == 0) 
                break;
            int[][] sch = new int[n + m][3];
            for (int i = 0; i < n; i++) 
            {
                sch[i][0] = in.nextInt();
                sch[i][1] = in.nextInt();
            }
            for (int i = n; i < n + m; i++)
            {
                sch[i][0] = in.nextInt();
                sch[i][1] = in.nextInt();
                sch[i][2] = in.nextInt();
            }
            boolean conflict = false;
            boolean[] arr = new boolean[1000001];
            for (int i = 0; i < n && !conflict; i++)
            {
                int a = sch[i][0];
                int b = sch[i][1];
                for (int j = a; j < b; j++)
                {
                    if (arr[j]) 
                    {
                        conflict = true;
                        break;
                    }
                    arr[j] = true;
                }
            }
            if (!conflict)
            {
                for (int i = n; i < n + m; i++)
                {
                    int a = sch[i][0];
                    int b = sch[i][1];
                    int c = sch[i][2];
                    while (a < 1000001) 
                    {
                        for (int j = a; j < b && j < 1000001; j++) 
                        {
                            if (arr[j])
                            {
                                conflict = true;
                                break;
                            }
                            arr[j] = true;
                        }
                        a += c;
                        b += c;
                    }
                }
            }
            if (conflict) 
                System.out.println("CONFLICT");
            else 
                System.out.println("NO CONFLICT");
        }
    }
}
