import java.util.*;
import java.io.*;

class Main 
{
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		List<Integer>score=new ArrayList<>();
		int i=0;
		while(i<=20)
		{
		    if(!score.contains(i))
		        score.add(i);
	        if(!score.contains(i+i))
		        score.add(i+i);
	        if(!score.contains(i+i+i))
		        score.add(i+i+i);
		    i++;
		}
		score.add(50);
		Collections.sort(score);
		String ast="";
		for(int j=0;j<70;j++)
		    ast+="*";
	    while(true)
	    {
	        int point=in.nextInt(),per=0,com=0;
	        if(point<=0)
	            break;
            for(int x=0;x<score.size();x++)
            {
                for(int y=0;y<score.size();y++)
                {
                    for(int z=0;z<score.size();z++)
                    {
                        if(score.get(x)+score.get(y)+score.get(z)==point)
                        {
                            per++;
                            if(y>=x&&z>=y)
                                com++;
                        }
                    }
                }
            }
            if(per==0)
                System.out.println("THE SCORE OF "+point+" CANNOT BE MADE WITH THREE DARTS.");
            else
            {
                System.out.println("NUMBER OF COMBINATIONS THAT SCORES "+point+" IS "+com+".");
                System.out.println("NUMBER OF PERMUTATIONS THAT SCORES "+point+" IS "+per+".");
            }
            System.out.println(ast);
	    }
	    System.out.println("END OF OUTPUT");
	}
}
