
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_Balanced_Array {
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
            // for (int i = 0; i < n; i++) {
            // arr[i] = sc.nextInt();
            // }

            if (n % 4 == 0) {
                System.out.println("YES");
                long es = 0;
                int r = n / 2;
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 1; i <= r; i++) {
                    arr.add(2 * i);
                    es += (2 * i);
                }

                for (int i = 1; i < r; i++) {
                    arr.add((2 * i) - 1);
                    es -= ((2 * i) - 1);
                }

                arr.add((int) es);

                for (int j : arr)
                    System.out.print(j + " ");

                System.out.println();

            } else {
                System.out.println("NO");
            }

        }

    }
}