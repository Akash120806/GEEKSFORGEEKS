//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(s));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String s) {
           int n=s.length();
           
           char[] st=s.toCharArray();
           for(int i=s.length()-1;i>=n/2;i--){
               
               char ch=st[i];
               st[i]=st[n-i-1];
               st[n-i-1]=ch;

               

         // System.out.print(ch);
            // System.out.print(rv);
            
        }
        return new String(st);
        
        // code here
    }
}