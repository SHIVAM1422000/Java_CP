
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C_Delete_Two_Elements {
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
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long sum = 0;
            for (long i : arr)
                sum += i;

            if ((2 * sum) % n != 0) {
                System.out.println(0);
            } else {

                long req = ((2 * sum) / n);

                HashMap<Long, Integer> map = new HashMap<>();
                for (long i : arr) {
                    if (map.containsKey(i)) {
                        map.put(i, map.get(i) + 1);
                    } else {
                        map.put(i, 1);
                    }
                }

                long ans = 0;
                for (long i : arr) {

                    long treq = req - i;
                    if (map.containsKey(treq)) {
                        ans += map.get(req - i);
                        if (treq == i)
                            ans -= 1;

                    }
                }

                System.out.println(ans / 2);

            }

        }

    }
}