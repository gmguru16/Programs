Ques. Link: https://www.hackerrank.com/contests/palindrome-1/challenges/palindrome-index/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s)
    {
        for(int i=0,j=s.length()-1;i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
                if(Palindrome(s,i))
                    return i;
                else if(Palindrome(s,j))
                    return j;
        
        }
        return -1;
    }
    
    static boolean Palindrome(String s, int k)
    {  char[] c=s.toCharArray();
       ArrayList <Character> ch=new ArrayList<Character>();
     for(int i=0;i<c.length;i++)
     {
         ch.add(c[i]);
     }ch.remove(k);
        for(int i=0,j=ch.size()-1;i<j;i++,j--)
            if(ch.get(i)!=ch.get(j))
                return false;
        return true;
    }

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
