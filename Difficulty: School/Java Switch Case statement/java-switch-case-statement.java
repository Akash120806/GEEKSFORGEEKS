//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int choice = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            List<Double> arr = new ArrayList<Double>();
            for(int i = 0;i < choice;i++)
                arr.add(Double.parseDouble(a[i]));
            
            Solution ob = new Solution();
            if(choice == 1)
                System.out.println(String.format("%.2f", ob.switchCase(choice, arr)));
            else
                System.out.println((int)ob.switchCase(choice, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static double switchCase(int choice, List<Double> arr){
     //   Scanner s=new Scanner(System.in);
    //    int choice=sc.nextInt();
    
        
      //  int choice=sc.nextInt();
      // int choice=1;

      
        switch(choice) {
            case 1:
                double R=arr.get(0);
                double ar = Math.PI * R * R; // or 22.0/7 * R * R
                return ar;
             //   break;
            case 2:
                double L=arr.get(0);;
                double B=arr.get(1);;
                double wi = L*B; // or 22.0/7 * R * R
                return wi;// code here
        }
    
        return 12.00;
    }
}