
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 

public class B_The_Great_Hero{

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

public static void main(String[] args){
    FastReader sc = new FastReader();
     int t=sc.nextInt();
     while(t-->0){

         int A=sc.nextInt(),B=sc.nextInt(),n=sc.nextInt();
         boolean flag=true;
         int a[][]=new int[n][2];
         Arrays.sort(a,new Comparator<int[]>() {
             public int compare(int one[],int two[]){
                 return one[0]-two[0];
             }
         });

        //atack power:-
         for(int i=0;i<n;i++) a[i][0]=sc.nextInt();
         //health left:-
         for(int i=0;i<n;i++) a[i][1]=sc.nextInt();

         for(int i=0;i<n-1;i++){
           
            if(B<=0){
               System.out.println("NO");
               return;
            }

            if(a[i][1]%A==0){
                 int nn=(a[i][1]/A);
                 B=B-(nn*a[i][0]); 
            }else{
                int nn=(a[i][1]/A)+1;
                B=B-(nn*a[i][0]); 
            }                

         }


         if(a[n-1][1]<=0) flag=false;
         else flag=true;

      


         if(flag) System.out.println("YES");
         else System.out.println("NO");



     }
}
}



