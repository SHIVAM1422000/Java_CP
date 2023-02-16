import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.StringTokenizer;

public class C_Dolce_Vita {
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
                       long budget=sc.nextLong();
                       long adj[]=new long[n];
                       for(int i=0;i<n;i++){
                        adj[i]=sc.nextLong();
                       } 
                       
                       Arrays.sort(adj);
                       long sum=0;
                       for(int i=0;i<n;i++){
                         sum+=adj[i];
                       } 
                 
                       long ans=0,day=0;
                       for(int i=n-1;i>=0;i--){
                               //if sum exceeds budget remove the max one
                               if(sum>budget){
                                 sum-=(adj[i]+day);
                                 continue;
                               }

                               long curr_days=1+((budget-sum)/(i+1));
                                   ans+=(curr_days*(i+1));
                                   day+=curr_days;
                                   sum+=(curr_days*(i+1));
                                   sum-=(adj[i]+day);
                       }

                        System.out.println(ans);
                        
                           
                       }
                      
               
                 } 
        
    }


/** 

1
2
3
4
5
6
7

**/



