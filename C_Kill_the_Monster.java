
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C_Kill_the_Monster {
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
            long ch = sc.nextInt(), ca = sc.nextInt();
            long mh = sc.nextInt(), ma = sc.nextInt();
            long c = sc.nextInt(), aao = sc.nextInt(), hao = sc.nextInt();

            // ch += (c * hao);

            boolean flag = false;

            // ca += (c * aao);
            for (int i = 0; i <= c; i++) {
                long tch = ch + (i * hao);
                long tca = ca + ((c - i) * aao);

                long Tcm = mh / tca;
                long Tmc = tch / ma;
                if (mh % tca != 0)
                    ++Tcm;
                if (tch % ma != 0)
                    ++Tmc;

                // System.out.println("Tcm:" + Tcm + " Tmc:" + Tmc);
                if (Tcm <= Tmc) {
                    flag = true;
                    // System.out.println("YES");
                    break;
                }
                // System.out.println("no success..!!");

            }

            if (!flag)
                System.out.println("NO");
            else
                System.out.println("YES");

        }

    }
}