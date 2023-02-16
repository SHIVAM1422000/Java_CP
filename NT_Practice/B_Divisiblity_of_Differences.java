import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_Divisiblity_of_Differences {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();

                      
                       int n=sc.nextInt();
                       int k=sc.nextInt();
                       int m=sc.nextInt();
                       int arr[]=new int[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
               
                    ArrayList<ArrayList<Integer>> ma=new ArrayList<>();
                    for(int i=0;i<m;i++) ma.add(new ArrayList<Integer>());

                     for(int curr:arr){
                        int mod=curr%m;
                        ma.get(mod).add(curr);
                     }

                    boolean flag=false;
                     for(int i=0;i<m;i++){
                        if(ma.get(i).size()>=k){
                            flag=true;
                            System.out.println("Yes");
                            for(int j=0;j<k;j++){
                                System.out.print(ma.get(i).get(j)+" ");
                            }
                            break;
                        }
                     }

                     if(!flag) {
                        System.out.println("No");
                     }



        
    }
}
