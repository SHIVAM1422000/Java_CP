import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_Permutation_Value {
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
                       int ans[]=new int[n];


                       if(n==1){
                        System.out.println("1");
                        continue;
                       }else if(n==2){
                        System.out.println("2 1");
                        continue;

                       }else if(n==3){
                        System.out.println("2 3 1");
                        continue;
                       }else if(n==4){
                        System.out.println("2 4 3 1");
                        continue;
                       }else{


                        int idx=0;
                        for(int i=n;i>=1;i--){
                                   ans[idx++]=i;
                                   ans[0]=2;
                                   ans[n-2]=n;
                        }

                        

                        for(int i:ans) System.out.print(i+" ");
                        System.out.println();
                          

                       }

                     
               
                 } 
        
    }
}
