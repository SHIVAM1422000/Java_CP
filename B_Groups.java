import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_Groups {
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
            int arr[][] = new int[n][5];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            boolean flag = false;
            // select the days
            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 5; j++) {

                    int a = 0, b = 0, c = 0;

                    for (int k = 0; k < n; k++) {

                        if (arr[k][i] == 1)
                            ++a;
                        if (arr[k][j] == 1)
                            ++b;
                        if (arr[k][i] == 1 && arr[k][j] == 1)
                            ++c;

                    }

                    int req = n / 2;
                    int oa = a - c, ob = b - c;

                    for (int e = 0; e <= c; e++) {
                        if ((oa + e) == req && (ob + c - e) == req) {
                            // System.out.println("YES");
                            flag = true;
                            break;
                        }
                    }

                    if (flag == true)
                        break;

                }
                if (flag == true)
                    break;

            }

            if (flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
}
