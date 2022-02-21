
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_Mirror_in_the_String {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            
            int n = sc.nextInt();
            String str=sc.next();

if(str.length()>=2 && str.charAt(0)==str.charAt(1)){
    System.out.println(""+str.charAt(0)+str.charAt(0));
    continue;
}

            StringBuilder s=new StringBuilder();
            s.append(str.charAt(0));
            for(int i=1;i<str.length();i++){
                if(str.charAt(i)<=s.charAt(s.length()-1)){
                    s.append(str.charAt(i));
                }else{
                    break;
                }
            }



         
            int l=s.length();
            for(int i=l-1;i>=0;i--){
                s.append(s.charAt(i));
            }


         System.out.println(s);








        }

    }
}