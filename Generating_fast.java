import java.util.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        StringBuffer bf = new StringBuffer("");
        sc.nextLine();
        for (int i =0; i<t ; i++) 
        {
         if (i>0)
         bf.append("\n");
         char [] a =sc.nextLine().toCharArray();
         Arrays.sort(a);
         Arrays.asList(a);
         do
         {
            bf.append(new String(a)+"\n");
         }while(permutation(a));
        }
    System.out.println(bf); 
      
    }
    public static boolean permutation(char a[])
    {
       for(int i = a.length-2, j; i >= 0; i--)
       {
        if (a[i+1] > a[i])
        {
                for(j = a.length-1; a[j] <= a[i]; j--);
                    swap(a, i, j);
                for(j = 1; j <= (a.length-i)/2; j++)
                    swap(a, i+j, a.length-j);
                return true;
         }
        }
         return false;
   }
   public static void swap(char a[], int i, int j)
   {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
   }
}
