import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_Composite_Coloring {
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
                       HashMap<Integer,Integer> map=new HashMap<>();
                       for(int i=0;i<n;i++){
                        int curr=sc.nextInt();
                        arr[i]=curr;
                        map.put(curr,i);
                    }
                       

                       int ans[]=new int[n];
                       int m=1;
                       int[] prime={2,3,5,7,11,13,17,19,23,29,31};
                       for(int p:prime){
                        boolean flag=false;
                        for(int i=0;i<n;i++){
                            if(arr[i]%p==0 && ans[i]==0){
                                ans[i]=m;
                                flag=true;
                            }
                        }
                        if(flag) ++m;
                       }

                       System.out.println(m-1);
                       for(int i:ans) System.out.print(i+" ");
                       System.out.println();

               
                 } 
        
    }
}
