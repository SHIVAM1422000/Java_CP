
// Working program with FastReader
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_Game_on_Ranges {
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
            rt arr[] = new rt[n + 1];
            boolean vst[] = new boolean[n + 1];

            for (int i = 0; i < n; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                arr[i] = new rt(l, r, i, -1);
                if (arr[i].l == arr[i].r) {
                    vst[arr[i].l] = true;
                    arr[i].ans = arr[i].l;
                }
            }

            System.out.println("Given");
            for (rt ttt : arr)
                System.out.println(ttt.l + " " + ttt.r + " " + ttt.i + " " + ttt.ans);
            System.out.println("Ans");
            Arrays.sort(arr, new Comparator<rt>() {
                public int compare(rt one, rt two) {
                    if (one.l < two.l)
                        return -1;
                    else if (one.l > two.l)
                        return 1;
                    else if (one.r < two.r)
                        return -1;
                    else
                        return 1;
                }
            });

            for (int i = 0; i < arr.length; i++) {
                rt curr = arr[i];
                if (curr.l == curr.r)
                    continue;
                for (int j = curr.l; j <= curr.r; j++) {
                    if (vst[j] != true) {
                        vst[j] = true;
                        arr[i].ans = j;
                        break;
                    }
                }
            }

            rt ans[] = new rt[n + 1];
            for (rt curr : arr) {
                arr[curr.i] = curr;
            }

            for (rt curr : ans)
                System.out.println(curr.l + " " + curr.r + " " + curr.ans);
            System.out.println();

        }

    }
}

class rt {
    public int l, r, i, ans;

    public rt(int l, int r, int i, int ans) {
        this.l = l;
        this.r = r;
        this.i = i;
        this.ans = ans;

    }
}