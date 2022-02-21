
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class D_Palindromes_Coloring {
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
            int k = sc.nextInt();
            String str = sc.next();
            /**
             * int arr[] = new int[n];
             * for (int i = 0; i < n; i++) {
             * arr[i] = sc.nextInt();
             * }
             * 
             */

            long f[] = new long[26];
            for (int i = 0; i < str.length(); i++)
                f[str.charAt(i) - 'a']++;
            long totalPairs = 0;
            for (long i : f)
                totalPairs += (i / 2);

            int max = n / k;

            while (max > 0) {

                long reqPairs = (max / 2) * k;
                if (totalPairs >= reqPairs) {
                    System.out.println(max);
                    break;
                }

                --max;
            }

        }

    }
}