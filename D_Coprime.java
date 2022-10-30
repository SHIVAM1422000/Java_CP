import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class  D_Coprime {
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


   public static int gcd(int a,int b){
     if(b>a) return gcd(b,a);
     if (b == 0) return a;
     return gcd(b, a % b);
   }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
                while(t-->0){
                      
                       int n=sc.nextInt();
                       int arr[]=new int[n+1];
                       
                       HashMap<Integer,Integer> map=new HashMap<>();
                       for(int i=1;i<=n;i++){
                         int temp=sc.nextInt();
                         arr[i]=temp;
                         map.put(temp, i);
                       }


                       long ans=-1;
                       for(int i=1;i<=1000;i++){
                        for(int j=1;j<=1000;j++){

                            int g=gcd(i,j);
                            if(g==1 && map.containsKey(i) && map.containsKey(j)){
                                long temp=map.get(i)+map.get(j);
                                ans=Math.max(ans,temp);
                            }

                        }
                       }

                       System.out.println(ans);
                   

               
                 } 
        
    }
}
