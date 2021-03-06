
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Kalindrome_Array {
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

    public static boolean isPal2(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j])
                return false;
            ++i;
            --j;
        }
        return true;
    }

    public static boolean isPal(ArrayList<Integer> arr) {
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) != arr.get(j))
                return false;
            ++i;
            --j;
        }
        return true;
    }

    public static boolean check(int arr[], int x) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : arr)
            if (i != x)
                temp.add(i);
        return isPal(temp);

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

            if (n == 1 || n == 2 || isPal2(arr)) {
                System.out.println("YES");
                continue;
            }

            boolean flag = false;

            int i = 0, j = n - 1;
            while (i < j) {
                if (arr[i] != arr[j]) {
                    flag = check(arr, arr[i]) || check(arr, arr[j]);
                    break;
                }
                ++i;
                --j;
            }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
}