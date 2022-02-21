
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Fun_with_Even_Subarrays {
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

            int last = arr[n - 1];
            int i = n - 2;
            int ans = 0;
            while (i >= 0) {

                if (arr[i] != last) {
                    ++ans;
                    int subarrayLengthToTheRightOfCurrentElement = n - i - 1;
                    int lengthOfTheSubarrayToBeSelected = 2 * subarrayLengthToTheRightOfCurrentElement;
                    i = n - lengthOfTheSubarrayToBeSelected;

                }

                --i;

            }

            System.out.println(ans);

        }

    }
}