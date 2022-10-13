import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class C_Minimize_the_Thickness {
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
                      
                       int n=sc.nextInt();
                       int arr[]=new int[n];
                       int sum[]=new int[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
                       sum[0]=arr[0];
                       for(int i=1;i<n;i++) sum[i]=arr[i]+sum[i-1];


                       int ans=n;
                       for(int i=0;i<n;i++){
                         int cs=sum[i],cl=i+1,l=i;
                         int ts=0;
                        //  System.out.println("For Index i: "  + i + " cs: " + cs);
                         for(int j=i+1;j<n;j++){
                             ts+=arr[j];
                             if(ts==cs){
                                int len=(j-l);
                                // System.out.println("Matched  idx: " + j +  " last: " + l +" len: " + len);
                                ts=0; l=j; cl=Math.max(cl,len);
                             }
                             if(l==n-1){
                                // System.out.println("Currently at req index, cl:"+cl);
                                 ans=Math.min(ans,cl);
                             }
                         }


                       }

                       System.out.println(ans);
               
                 } 
        
    }
}

