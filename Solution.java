import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class Solution {
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


    static long ans(long n,long curr,long max){
        if(n%32768==0) return curr;
        if(curr>max) return Long.MAX_VALUE;
        long a = ans(n+1, curr +1 , max);
        long b = ans(2*n , curr+1, max);
        long t=Math.min(a,b);
         return t; 
    }


    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
                while(t-->0){
                      
                       int n=sc.nextInt();
                       long arr[]=new long[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextLong();
                       for(long curr:arr){
                            System.out.println(ans(curr,0,(32768-curr)) +" ");
                       }
               
                 } 
        
    }
}
