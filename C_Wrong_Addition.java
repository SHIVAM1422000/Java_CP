
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C_Wrong_Addition {
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

            String a = sc.next();
            String r = sc.next();
            boolean flag = true;
            int i = a.length() - 1, j = r.length() - 1;
            String b = "";

            while (i >= 0 && j >= 0) {

                if (a.charAt(i) > r.charAt(j)) {

                    if (j - 1 < 0) {
                        flag = false;
                        break;
                    }
                    int temp = (10 * (r.charAt(j - 1) - '0')) + (r.charAt(j) - '0');
                    if (temp < 10 || temp > 18) {
                        flag = false;
                        break;
                    }

                    int curr = temp - (a.charAt(i) - '0');
                    b = curr + b;
                    j = j - 2;
                    i--;

                } else {
                    b = (r.charAt(j) - a.charAt(i)) + b;
                    --i;
                    --j;
                }
            }

            if (flag == false || i >= 0) {
                System.out.println(-1);
                continue;
            }

            while (j >= 0) {
                b = r.charAt(j) + b;
                --j;
            }

            int z = 0;
            while (z < b.length()) {

                if (b.charAt(z++) == '0')
                    continue;
                else
                    break;

            }

            if (--z >= 0)
                b = b.substring(z);

            System.out.println(b);

        }

    }
}