import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_Interesting_drink {
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

    public static int sol(long arr[],long lim) {
         int low=0,high=arr.length-1;
         while(low<=high){
             int mid=(low+high)/2;
             if(arr[mid]<=lim){
                low=mid+1;
             }else{
                high=mid-1;
             }
         }

         return low;

    }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();

                      
                       int n=sc.nextInt();
                       long arr[]=new long[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextLong();
                       Arrays.sort(arr);

                       long q=sc.nextLong();
                       while(q-->0){
                           
                             long lim=sc.nextLong();
                             System.out.println(sol(arr,lim));
                         
                       }
               

        
    }
}
