
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_Make_AP {
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
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            /**
             * x1=(a+c)/(2*b);
             * x2=(((2*b)-c)/a;
             * x3=((2*b)-a)/c;
             * 
             */

            if ((a + c) % (2 * b) == 0 && (a + c) != 0) {
                System.out.println("YES");
            } else if (((2 * b) - c) % a == 0 && ((2 * b) - c) > 0) {
                System.out.println("YES");
            } else if (((2 * b) - a) % c == 0 && ((2 * b) - a) > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}