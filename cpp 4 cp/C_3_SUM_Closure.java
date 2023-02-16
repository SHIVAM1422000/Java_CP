import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class C_3_SUM_Closure {
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
        int t = sc.nextInt();
                while(t-->0){
                      
                       int n=sc.nextInt();
                       ArrayList<Integer> arr=new ArrayList<>();
                       Set<Integer> set=new HashSet<>();
                       int pos=0,neg=0,zero=0;
                       for(int i=0;i<n;i++){
                        int curr=sc.nextInt();


                        if(curr>0) ++pos;
                        else if(curr<0) ++neg;
                        else ++zero;
                        
                        set.add(curr);

                        if(curr==0 && zero<=2){
                            arr.add(0);
                            continue;
                        }

                            arr.add(curr);

                       }
                       
                    //    System.out.println("Current Array Size: " + arr.size()) ;

                    //    for(int i:arr) System.out.print(i+" ");
                    //    System.out.println();

                       
                       if(pos>2 || neg>2){
                         System.out.println("NO");
                         continue;
                       }

                       if(zero>2){
                        System.out.println("YES");
                        continue;
                       }

                       boolean flag=false;
                       int s=arr.size();
                       for(int i=0;i<s;i++){
                        if(flag) break;
                        for(int j=i+1;j<s;j++){
                            if(flag) break;
                            for(int k=j+1;k<s;k++){
                                int cs=arr.get(i)+arr.get(j)+arr.get(k);
                                // System.out.println("for i: " + i+" j:" + j+" k:" + k+" cs: " + cs);
                                if(set.contains(cs)){
                                    flag=true;
                                    break;
                                }
                            }
                        }
                       }


                       if(flag){
                        System.out.println("YES");
                       }else{
                        System.out.println("NO");
                       }


               
                 } 
        
    }
}
