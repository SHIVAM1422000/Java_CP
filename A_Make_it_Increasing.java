import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class A_Make_it_Increasing{
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
                       long arr[]=new long[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextLong();
         long ans=Long.MAX_VALUE;
 
                       for(int i=0;i<n;i++){
                            
                            long temp[]=new long[n];
                            long count=0;
                            for(int j=i-1;j>=0;j--){
                                  long t=(temp[j+1]/arr[j]) + 1;
                                  temp[j]= t * arr[j];
                                  count+=t;
                            }


                            for(int j=i+1;j<n;j++){
                                    long t=(temp[j-1]/arr[j])+1;
                                    temp[j]=t*arr[j];
                                    count+=t;
                            }

ans=Math.min(ans,count);
                             
                             
                       }


                       System.out.println(ans);
               

        
    }
}
