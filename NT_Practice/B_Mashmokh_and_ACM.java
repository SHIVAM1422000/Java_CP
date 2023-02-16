import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
import java.util.logging.LogRecord;

public class B_Mashmokh_and_ACM {
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
                       int k=sc.nextInt();
                       long dp[][]=new long[n+1][k+1];
                    boolean vst[]=new boolean[n+1];

                       for(int i=2;i<=n;i++){
                         for(int j=i;j<=n;j+=i){
                            if(vst[j]) continue;
                            vst[j]=true;
                            for(int s=1;s<=k;s++){
                                if(s==1){
                                    dp[j][s]=1;
                                    continue;
                                }

                                int m=j;
                                while(m>1){
                                    dp[j][s]+=dp[m][s-1];
                                    m/=i;
                                }

                            }
                         }
                       }

                       System.out.println(dp[n][k]);

                      
        
    }
}
