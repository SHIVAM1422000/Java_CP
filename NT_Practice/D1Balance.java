import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class D1Balance {
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
        // Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        HashMap<Long,Long> map = new HashMap<>();
        Set<Long> set=new HashSet<>();
        while (q-- > 0) {

            String str = sc.next();
            long n = sc.nextLong();
            
            if (str.charAt(0) == '+') {
                    set.add(n);
            } else {

                long curr=map.getOrDefault(n, n);
                while(set.contains(curr)) curr+=n;
                System.out.println(curr);
                map.put(n, curr);
            }


        }

    }
}
