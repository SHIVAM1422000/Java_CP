
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_BerSU_Ball {
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
        // int t = sc.nextInt();
        // while (t-- > 0) {
        int n = sc.nextInt();
        int boys[] = new int[n];
        for (int i = 0; i < n; i++) {
            boys[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int girls[] = new int[m];
        for (int i = 0; i < m; i++) {
            girls[i] = sc.nextInt();
        }

        Arrays.sort(boys);
        Arrays.sort(girls);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Math.abs(boys[i] - girls[j]) <= 1) {
                    ++ans;
                    girls[j] = 1000;
                    break;
                }
            }
        }

        System.out.println(ans);

        // }

    }
}