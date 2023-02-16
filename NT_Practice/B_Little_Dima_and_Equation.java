import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_Little_Dima_and_Equation {
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

    public static long gsum(long n) {
        long sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        ArrayList<Long> arr = new ArrayList<>();
        long lim = 1000000000;
        for (long i = b; i>0 && i < lim; i += b) {
            if ((i - c) % b == 0) {
                long sum = gsum(i);
                long rhs=(long) Math.pow(sum, a);
                long lhs=(i-c)/b;

                // System.out.println("Curr:" + curr);
                if (lhs == rhs) {
                    System.out.println("Matched..!!: " + i);
                    
                    arr.add(i);
                    // System.out.println(arr.size());
                }

            }
        }

        System.out.println(arr.size());

        if(arr.size()>0){
            for (long i : arr)
            System.out.print(i + " ");
            System.out.println();
        }

    }
}
