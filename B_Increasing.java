import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_Increasing {
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
                       for(int i=0;i<n;i++) arr[i]=sc.nextInt();

                       Arrays.sort(arr);
                       boolean flag=true;
                       for(int i=1;i<n;i++){
                         if(arr[i]>arr[i-1]) continue;
                         else {
                             flag=false;
                             break;
                         }
                       }


                       if(flag){
                        System.out.println("YES");
                       }else{
                        System.out.println("NO");
                       }
               
                 } 
        
    }
}
