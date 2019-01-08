import java.util.Scanner;
class Main
{
public static void main(String[] args)
{

    int a,b;
Scanner in=new Scanner(System.in);
int T=in.nextInt();
while(T-->0)
{
 a=in.nextInt();
 b=in.nextInt();
if(a>b)
System.out.println(">");
else if(a<b)
System.out.println("<");
else
System.out.println("=");


}
}
}
