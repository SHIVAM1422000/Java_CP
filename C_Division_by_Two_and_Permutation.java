
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C_Division_by_Two_and_Permutation {
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
            // int arr[] = new int[n];
            int f[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                while (temp > n) {
                    temp = temp / 2;
                }
                f[temp]++;
            }

            boolean flag = true;
            for (int i = n; i > 0; i--) {
                if (f[i] == 0) {
                    flag = false;
                    break;
                }
                if (f[i] > 1)
                    f[i / 2] += (f[i] - 1);
            }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
}