import java.io.*;
import java.util.*;

class  Main 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String s;
        int i=1;
        while(!(s=in.nextLine()).equals("*"))
        {
            if(s.equals("Hajj"))
                System.out.println("Case "+i+": Hajj-e-Akbar");
            if(s.equals("Umrah")) 
                System.out.println("Case "+i+": Hajj-e-Asghar");
            i++;
        }
    }
}
