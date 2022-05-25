import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MoveNegativeToOneSide {
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

                       int i=0,j=arr.length-1;
                       while(i<j){
                       
                        if(arr[i]<0 && arr[j]<0){
                             ++i;
                        }else if(arr[i]>0 && arr[j]>0){
                            --j;
                        }else if(arr[i]<0 && arr[j]>0){
                            ++i;
                            --j;
                        }else{
                            //arr[i]>0 && arr[j]<0
                            //we need to swap
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[i]=temp;
                            ++i; --j;
                        }
                          

                       }

                       for(int k:arr) 
                         System.out.print(k+" ");
               
                 } 
        
    }
}
