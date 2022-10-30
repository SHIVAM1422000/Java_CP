import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class C_Save_the_Magazines {
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
                        String bits=sc.next();
                       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
                       boolean b[]=new boolean[n];


                       long ans=0;
                       for(int i=0;i<n;i++){
                        if(bits.charAt(i)=='1'){
                                     b[i-1]=true;
                        }
                    }


                       for(int i=0;i<n;i++){

                          if(b[i] && i-1>=0 && !b[i-1] && arr[i-1]>=arr[i]){
                                  b[i-1]=true;
                                  b[i]=false;
                                  ans+=arr[i-1];
                          }
    
                       }





                       System.out.println(ans);
               
                 } 
        
    }
}
