
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_William_the_Vigilant {
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

        int n = sc.nextInt();
        int q = sc.nextInt();
        String str = sc.next();
        char c[] = str.toCharArray();
        Set<Integer> set = new HashSet<>();
        long count = 0;
        int i = 0;
        while (i + 2 < n) {
            String temp = "" + c[i] + c[i + 1] + c[i + 2];
            if (temp.equals("abc")) {
                set.add(i);
                ++count;
                i = i + 3;
            } else {
                ++i;
            }
        }

        while (q-- > 0) {
            // String query = sc.next();
            int pos = sc.nextInt();
            --pos;
            char rep = sc.next().charAt(0);

            if (set.contains(pos)) {
                --count;
                set.remove(pos);
            }

            if (pos - 1 >= 0 && set.contains(pos - 1)) {
                --count;
                set.remove(pos - 1);
            }

            if (pos - 2 >= 0 && set.contains(pos - 2)) {
                --count;
                set.remove(pos - 2);
            }

            c[pos] = rep;

            if (pos + 2 < n) {
                String s = "" + c[pos] + c[pos + 1] + c[pos + 2];
                if (s.equals("abc")) {
                    ++count;
                    set.add(pos);
                }

            }

            if (pos - 1 >= 0 && pos + 1 < n) {
                String s = "" + c[pos - 1] + c[pos] + c[pos + 1];
                if (s.equals("abc")) {
                    ++count;
                    set.add(pos - 1);
                }
            }

            if (pos - 2 >= 0) {
                String s = "" + c[pos - 2] + c[pos - 1] + c[pos];
                if (s.equals("abc")) {
                    ++count;
                    set.add(pos - 2);
                }
            }

            System.out.println(count);

        }

    }
}