
// Working p0rogram with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_Minor_Reduction {
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
            String str = sc.next();

            int n = str.length();
            int i = n - 2;
            while (i >= 0) {
                int te = str.charAt(i) - '0' + str.charAt(i + 1) - '0';

                if (te > 9) {
                    String ans = str.substring(0, i) + te + str.substring(i + 2, n);
                    System.out.println(ans);
                    break;
                }

                if (i == 0) {
                    String ans = "" + te + str.substring(i + 2, n);
                    System.out.println(ans);
                    // break;
                }

                --i;

            }

        }

    }
}