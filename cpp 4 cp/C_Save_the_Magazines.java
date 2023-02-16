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
                       String s=sc.next();     
                       int arr[]=new int[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
                       char box[]=s.toCharArray();

                       int i=0;
                       long ans=0;

                       if(i==0 && box[i]=='1')
                       {
                        ans+=arr[i];
                        ++i;
                       } 

                       while(i<n){

                         if(box[i]=='0'){

                            int min=arr[i],j=i+1;
                            long sum=arr[i];
                            while(j<n && box[j]=='1'){
                                 min=Math.min(min,arr[j]);
                                 sum+=arr[j];
                                 ++j;
                            }

                            i=j;
                            ans+=(sum-min);

                         }else{
                              ans+=arr[i];
                              ++i;
                         }


                       }

                       System.out.println(ans);

               
                 } 
        
    }
}
