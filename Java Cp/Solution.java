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

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
                while(t-->0){
                      
                       long n=sc.nextLong();
                       long k=sc.nextLong();

                       long f=(long)Math.ceil((double)(n*1.0)/(double)k);
                       k=k*f;

                       long r=k/n;
                       if(k%n==0){
                         System.out.println(r);
                       }else{
                         System.out.println(r+1);
                       }
               
                 } 
        
    }
}
