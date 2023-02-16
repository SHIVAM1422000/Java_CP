import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class C_Number_of_Pairs {
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


    // i<=r-j
    // i<=l-1-j

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
                while(t-->0){
                      
                       int n=sc.nextInt();
                       long l=sc.nextLong();
                       long r=sc.nextLong();
                       long arr[]=new long[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextLong();

                       Arrays.sort(arr);
                       long ans=0;
                       for(int i=0;i<n-1;i++){

                           int low=i+1,high=n-1;
                           while(low<=high){
                               int mid=(low+high)/2;
                               if((r-arr[mid])>=arr[i]){
                                  low=mid+1;
                               }else{
                                  high=mid-1;
                               }
                           }


                           int LoW=i+1,HigH=n-1;
                           while(LoW<=HigH){
                            int MID=(LoW+HigH)/2;
                            if((l-1-arr[MID])>=arr[i]){
                                LoW=MID+1;
                            }else{
                                HigH=MID-1;
                            }

                           }
                           

                           if(low!=i && LoW!=i) ans+=(low-LoW);


                       }

                       System.out.println(ans);


               
                 } 
                 /** 
                  * 

                 5 8
                 0 1 2 3 4
                 1 2 3 4 5

                 i=0


                  



                 **/

        
    }
}
