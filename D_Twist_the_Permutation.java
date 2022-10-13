import java.io.*;
import java.util.*;

public class D_Twist_the_Permutation {
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

    /** 
   s     e 
   1 2 3 4 
   2 3 4 1
   3 4 1 2

   **/

    public static int[] rotate(int arr[],int s,int e,int t){
         int len=e-s+1;
         t=t%len;
         int temp[]=new int[arr.length];
         int idx=0;
         int bp=s+t;

         for(int j=bp;j<=e;j++){
            temp[idx++]=arr[j];
         }

         for(int j=0;j<bp;j++){
            temp[idx++]=arr[j];
         }

        for(int j=e+1;j<arr.length;j++) temp[idx++]=arr[j]; 

        
         return temp;

    }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
                while(t-->0){
                      
                       int n=sc.nextInt();
                       int arr[]=new int[n];
                       int temp[]=new int[n];
                       int ans[]=new int[n];
                       for(int i=0;i<n;i++){
                        temp[i]=i+1;
                        arr[i]=sc.nextInt();
                       }


                


                    for(int i=n-1;i>=0;i--)
                    {
                        //find the ith index in arr
                        int j=0;
                        for(;j<i;j++){
                            if(arr[j]==i+1) break;
                        }

                        if(i==j) continue;
                        //rotate array by (i+1)-(i-j)= j+1 times left
                        arr=rotate(arr, 0 , i,  j+1);
                        ans[i]=j+1;
                      
                    }
                     
                   

                    for(int i:ans) System.out.print(i+" ");
                    System.out.println();


               
                 } 
        
    }
}
