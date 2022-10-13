import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_Inflation {
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
                       int k=sc.nextInt();
                       long arr[]=new long[n];
                       for(int i=0;i<n;i++) arr[i]=sc. nextLong();
                    long sum=arr[0];
                    long ans=0;
                    double req=(k*1.0)/100;
                    System.out.println("Required Ration:"  + req);
                    System.out.println();
                    for(int i=1;i<n;i++){
                        System.out.println("Current Index: "  + i +", Current Sum: " + sum);
                        double ratio=(arr[i]*1.0)/sum;
                        System.out.println("Current Ratio: " + ratio);
                        if(ratio>req){
                             System.out.println("Ratio Needs To Be Tweaked");
                             double temp=(arr[i]*1.0)/req;
                             long change=(long)Math.ceil(temp);
                             System.out.println("New Sum: " + change + " sigma: "  + (change-sum));
                             ans+=(change-sum);
                             sum=change;
                             double cr=(arr[i]*1.0)/sum;
                             System.out.println("Change Ratio: " + cr);
                        }else{
                            System.out.println("Ratio Satisfied");
                            sum+=arr[i];
                        }
                        System.out.println();
                    }

                    System.out.println(ans);
               
                 } 
        
    }
}
