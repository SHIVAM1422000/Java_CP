import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class C_Registration_system {
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
        HashMap<String,Integer> map=new HashMap<>();
                while(t-->0){
                      
                    String s=sc.next();
                    if(map.containsKey(s)){
                         int temp=map.get(s);
                         map.put(s,temp+1);
                         String curr=s+temp;
                         System.out.println(curr);
                    }else{
                         System.out.println("OK");
                         map.put(s, 1);
                    }
               
                 } 
        
    }
}
