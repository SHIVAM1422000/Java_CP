
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C_Inversion_Graph {
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

            DSU dsu = new DSU(n);
            Stack<Integer> stack = new Stack<Integer>();
            for (int i : arr) {
                while (!stack.isEmpty() && i < stack.peek()) {
                    dsu.mu(i, stack.pop());
                }
                stack.push(i);
            }

            System.out.println("Stack Size: " + stack.size());

            int ans = 0;
            for (int i : arr)
                if (dsu.gp(i) == i)
                    ++ans;

            // System.out.println(stack.size());
            System.out.println(ans);

        }

    }
}

class DSU {

    int parent[];

    public DSU(int n) {
        parent = new int[n + 1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    public int gp(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = gp(parent[x]);
    }

    public void mu(int a, int b) {
        int pa = gp(a);
        int pb = gp(b);
        parent[pb] = pa;
    }

}