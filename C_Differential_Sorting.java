
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C_Differential_Sorting {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
             int arr[]=new int[n];
             for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
    }


   boolean isDec=true;
   for(int i=1;i<n;i++){
       if(arr[i]>=arr[i-1]){
           continue;
       }else{
           isDec=false;
           break;
       }
   }

   if(isDec) {
       System.out.println(0);
       continue;
   }


   long rep=arr[n-2]-arr[n-1];
   if(rep<=arr[n-2] && arr[n-2]<=arr[n-1]){
      System.out.println(n-2);
      for(int i=1;i<=n-2;i++){
          arr[i-1]=(int)rep;
        System.out.println((i)+" "+(n-1)+" "+n);
      }


     
   }else{
    System.out.println(-1);
    // continue;
   }
   






        }

    }
}