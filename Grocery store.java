import java.io.*;
import java.text.*;

class Main
{
	
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("0.00");
		for(int a = 1; a * 4 <= 2000; a ++)
		{
			for(int b = a ; a + b * 3<= 2000; b ++)
			{
				for(int c = b ; a + b + c * 2 <= 2000; c ++)
				{
				    int x=a*b*c,y=1000000,z=a+b+c;
					if(x<=y)
						continue;
					int d = z*y/(x-y);
					if(d>=c && z+d <= 2000 && (z+d)*y == x*d)
					{
						System.out.println( df.format(a/100.0) + " "+  df.format(b/100.0)+ " "+
						        df.format(c/100.0)+ " " +  df.format(d/100.0));
					}
						
				}
			}
		}
	}
}




Question Explanation: https://www.redgreencode.com/equation-solving-is-the-key-to-uva-11236/  (Optimization 3)

