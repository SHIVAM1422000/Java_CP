import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_Funny_Permutation {
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
                       int temp=n;
                       if(n==3){
                        System.out.println(-1);
                        continue;
                       }

                       if(n==2){
                        System.out.println("2 1");
                        continue;
                       }
                       if(n==5){
                        System.out.println("5 4 1 2 3");
                        continue;
                       }
                       
                       for(int i=0;i<n;i++){
                         arr[i]=temp--;
                       }

                       if(n%2!=0){
                          int mid=(n+1)/2-1;
                          int tm=arr[mid+1];
                          arr[mid+1]=arr[mid];
                          arr[mid]=tm;
                       }

                       for(int i:arr) System.out.print(i+ " ");
                       System.out.println();
               
                 } 
        
    }
}
