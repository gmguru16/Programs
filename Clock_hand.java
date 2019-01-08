import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
	public static void main (String[] args)
	 {
	    Scanner in=new Scanner(System.in);
	    String s=in.nextLine();
	    while(!s.equals("0:00"))
	    {
	        String c[]=s.split(":");
	        double h=Integer.parseInt(c[0]);
	        double m=Integer.parseInt(c[1]);
	        double a =Math.abs((30*h + m/2.0) - 6*m);
	        if(a>180)
	            a=360-a;
            System.out.printf("%.3f\n",a);
            s=in.nextLine();
	    }
	 }
}
