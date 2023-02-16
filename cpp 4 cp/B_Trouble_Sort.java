import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_Trouble_Sort {
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
                       int ty[]=new int[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
                       for(int i=0;i<n;i++) ty[i]=sc.nextInt();

 
                       int zero=0,one=0;
                       for(int i:ty){
                        if(i==0) ++zero;
                        else ++one;
                       }

                       if(one>0 && zero>0){
                         System.out.println("Yes");
                       }else{
                           boolean flag=true;
                           for(int i=1;i<n;i++){
                            if(arr[i]>=arr[i-1]) continue;
                            flag=false;
                            break;
                           }
                           if(flag){
                            System.out.println("Yes");
                           }else{
                            System.out.println("No");
                           }

                       }

               
                 } 
        
    }
}
