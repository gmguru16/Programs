
Conversation opened. 1 read message.

Skip to content
Using Gmail with screen readers
End now Vacation Settings

Search

Search mail

Compose
Labels
Inbox
1
Starred
Snoozed
Sent
Drafts
1
More
 
Hangouts
Something's not right.
We're having trouble connecting to Google. We'll keep trying...

This may be caused by network or proxy issues. Learn more. Please try accessing Hangouts directly.
Errors: 301

More
14 of 95


Print all
In new window
Booklet Printing
Inbox
x

Bhuvana Bhuvi
Attachments
Fri, Jan 4, 4:15 PM (4 days ago)

to Naveen, me, kali


Attachments area
Reply
Reply all
Forward

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 

class Booklet
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
Booklet.java
Open with
Displaying Booklet.java.
