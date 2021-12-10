
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 

public class B_Sifid_and_Strange_Subsequences{

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

public static void main(String[] args){
    FastReader sc = new FastReader();
     int t=sc.nextInt();
     while(t-->0){
          
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++) arr[i]=sc.nextInt();
          Arrays.sort(arr);
          if(n<=1){
           System.out.println(1);
          }else{
            int ans=1;
            int min=Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                min=Math.min(min,(arr[i]-arr[i-1]));
                if(min>=arr[i]){
                   ans=Math.max(i+1,ans); 
                }
                // System.out.println("For "+i+" min:"+min+" ans:"+ans);
            }
            System.out.println(ans);
          }

          
     }
}
}



