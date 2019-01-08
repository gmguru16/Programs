import java.util.*;

public class Main {
    public static void main (String[] args) 
    {
        Scanner in=new Scanner(System.in);
        HashMap<String, ArrayList<String>> map=new HashMap<String, ArrayList<String>>();
        while (true) 
        {
            String s=in.next();
            
            if (s.equals("#"))
                break;
                
            char[] str=s.toUpperCase().toCharArray();
            Arrays.sort(str);
            String sort="";
            for (int i=0;i<str.length;++i) 
                sort+=str[i];
              
            if (map.containsKey(sort)) 
            {
                ArrayList<String> l=map.get(sort);
                l.add(s);
                map.put(sort,l);
            }
            else
            {
                ArrayList<String> l=new ArrayList<>();
                l.add(s);
                map.put(sort,l);
            }
        }
        ArrayList<String> word=new ArrayList<>();
        for (ArrayList<String> strList : map.values()) 
        {
            if (strList.size()==1)
                word.add(strList.get(0));
        }
        Collections.sort(word);
        for (String str : word)
           System.out.println(str);
    }
}
