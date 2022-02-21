
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_Not_Sitting {
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
            int m = sc.nextInt();

            int arr[] = new int[n * m];
            int idx = 0;

            // arr stores distance of Tina with respect to every block i,j
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[idx++] = Math.max(i, n - i - 1) + Math.max(j, m - j - 1);
                }
            }

            // Sorting this array as when k is less then rahul will be closer to Tinal and
            // hence the overall distance b/w
            // them would be less. As the k increases the distance might increase b/w Tina &
            // Rahul
            Arrays.sort(arr);

            for (int i : arr)
                System.out.print(i + " ");
            System.out.println();

        }

    }
}