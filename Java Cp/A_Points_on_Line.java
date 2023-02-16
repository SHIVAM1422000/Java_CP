import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class A_Points_on_Line {
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

                      
                       int n=sc.nextInt();
                       long d=sc.nextLong();
                       int arr[]=new int[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
                       long ans=0;
                       int low=0;
                       for(int i=0;i<n;i++){
                              while((arr[i]-arr[low])>d){
                                 ++low;
                              }
                              int num=i-low;
                              long pairs=(num*(num-1))/2;
                              ans+=pairs; 
                       }


                       System.out.println(ans);
               

        
    }
}
