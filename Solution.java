import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
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


    public static int getMinLength(List<Integer> arr){

        int n=arr.size();
        int i=n-1;
        while(i<arr.size() && i-1>=0){
            if(arr.get(i-1)==arr.get(i)){
                i--;
            }else{
                int temp=arr.get(i-1);
                arr.set(i-1,temp%arr.get(i));
                arr.remove(i);
            }
        }

        n=arr.size();
         i=n-1;
        while(i<arr.size() && i-1>=0){
              if(arr.get(i)==0){
                --i;
                continue;
              }

                int temp=arr.get(i-1);
                arr.set(i-1,temp%arr.get(i));
                arr.remove(i);
            
        }

        // for(int j:arr) System.out.print(j+" ");
        // System.out.println();

        return arr.size();


   }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
                while(t-->0){
                      
                       int n=sc.nextInt();
                       int arr[]=new int[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextInt();

                       List<Integer> li=new ArrayList<>();
                       for(int i:arr) li.add(i);
                       System.out.println(getMinLength(li)); 
               

                 } 
        
    }
}
