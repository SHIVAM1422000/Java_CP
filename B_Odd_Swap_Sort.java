
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_Odd_Swap_Sort {
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
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            /**
             * boolean isSorted = true;
             * for (int i = 0; i < arr.length - 1; i++) {
             * if (arr[i] <= arr[i + 1]) {
             * continue;
             * } else {
             * isSorted = false;
             * break;
             * }
             * }
             * 
             * if (isSorted) {
             * System.out.println("Yes");
             * continue;
             * }
             * 
             * if (n == 1) {
             * System.out.println("Yes");
             * continue;
             * }
             * 
             * if (n == 2) {
             * // int i = 0;
             * if ((arr[0] % 2 == 0 && arr[1] % 2 == 0) || (arr[0] % 2 != 0 && arr[1] % 2 !=
             * 0))
             * System.out.println("No");
             * else
             * System.out.println("Yes");
             * 
             * continue;
             * }
             */

            boolean audi = true;
            int e = -1, o = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    if (arr[i] >= e) {
                        e = arr[i];
                    } else {
                        audi = false;
                        break;
                    }
                } else {
                    if (arr[i] >= o) {
                        o = arr[i];
                    } else {
                        audi = false;
                        break;
                    }
                }
            }

            if (audi == false) {
                System.out.println("No");
                continue;
            }

            // boolean flag = true;
            // for (int i = 0; i < n - 1; i++) {

            // if (arr[i] <= arr[i + 1]) {
            // continue;
            // } else if ((arr[i] % 2 == 0 && arr[i + 1] % 2 != 0) || (arr[i] % 2 != 0 &&
            // arr[i + 1] % 2 == 0)) {
            // int temp = arr[i];
            // arr[i] = arr[i + 1];
            // arr[i + 1] = temp;
            // } else {
            // flag = false;
            // break;
            // }
            // }

            if (audi)
                System.out.println("Yes");
            else
                System.out.println("No");

        }

    }
}