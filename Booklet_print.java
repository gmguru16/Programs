import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner in= new Scanner(System.in);
		double t=in.nextInt();
		int sheet,last,i,j;
		boolean f;
		while(t!=0)
		{
			if(t==1)
			{
			System.out.print("Printing order for 1 pages:\n");
			System.out.print("Sheet 1, front: Blank, 1\n");
			t=in.nextInt();
			}
			else
			{
				sheet=(int)Math.ceil(t/4.0);
				last=sheet*4;
				
				i=1;
				
				System.out.print("Printing order for "+(int)t+" pages:\n");
				
				for(j=1;j<=sheet;j++)
				{
					System.out.print("Sheet "+j+", front: ");
				if(last>t){
					System.out.print("Blank, ");
				}else{
					System.out.print(last+", ");
				}
				
				System.out.print(i+"\n");
				last--;
				i++;
				
				System.out.print("Sheet "+j+", back : ");
				System.out.print(i+", ");
				if(last>t){
					System.out.print("Blank\n");
				}else{
					System.out.print(last+"\n");
				}
				last--;
				i++;
			}
			t=in.nextInt();
				}
				
			}
		}
	}
