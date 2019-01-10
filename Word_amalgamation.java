import java.io.*;
import java.util.*;

class  Main 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String dw= "";
        List<String> hs=new ArrayList<>();
        Map<String, ArrayList<String>> map=new HashMap<String, ArrayList<String>>();
        while ((dw=in.readLine()) != null)
        {
            if ("XXXXXX".equals(dw))
                break;
            char[] cha=dw.toCharArray();
            Arrays.sort(cha);
            String sort=new String(cha);
            if (map.containsKey(sort)) 
            {
                ArrayList<String> l=map.get(sort);
                l.add(dw);
                Collections.sort(l);
                map.put(sort,l);
            }
            else
            {
                ArrayList<String> l=new ArrayList<>();
                l.add(dw);
                map.put(sort,l);
            }
            
        }
        while ((dw=in.readLine()) != null)
        {
            
            if ("XXXXXX".equals(dw)) 
                break;
            char[] cha=dw.toCharArray();
            Arrays.sort(cha);
            String sort=new String(cha);
            if (map.containsKey(sort)) 
            {
                List<String> al=new ArrayList<>();
                al.addAll(map.get(sort));
                for(int i=0;i<al.size();i++)
                    System.out.println(al.get(i));
                System.out.println("******");
            }
            else
            {
                System.out.println("NOT A VALID WORD");
                System.out.println("******");        
            }
        
        }
    }
}
