
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 

public class A_Gamer_Hemose{

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
         int n=sc.nextInt(),H=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        //   int one=Integer.MIN_VALUE;
        //   int two=Integer.MIN_VALUE;
        //   for(int i:arr){
        //       if(i>one) one=i;
        //   }
          
        //   for(int i:arr){
        //     if(i>two && i<one) two=i;
        //   }

        Arrays.sort(arr);
        int one=arr[n-1],two=arr[n-2];
        //   System.out.println("one:"+one+" two:"+two);
         
         int total=one+two;
         if(H%total==0){
            System.out.println((2*(H/total)));
         }else if(H%total<=one){
            System.out.println(((2*(H/total))+1));

         }else{
            System.out.println(((2*(H/total))+2));

         }


     }
}
}



