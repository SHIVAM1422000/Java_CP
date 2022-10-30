import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class C_Stripes {
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
                      
                    boolean flag=false;
                    char arr[][]=new char[8][8];
                    for(int i=0;i<8;i++){
                       String curr=sc.next();
                       arr[i]=curr.toCharArray();
                    }

                    int max=0;
                    char ans=' ';
                    for(int j=0;j<8;j++){
                        int count=0;
                         for(int i=0;i<8;i++){
                            if(arr[i][j]=='B') ++count;
                         }
                         if(count>max){
                            max=count;
                            ans='B';
                         }

                    }

                    for(int i=0;i<8;i++){
                        int count=0;
                         for(int j=0;j<8;j++){
                            if(arr[i][j]=='R') ++count;
                         }
                         if(count>max){
                            max=count;
                            ans='R';
                         }

                    }

                    System.out.println(ans);


                    
               
                 } 
        
    }
}
