import java.io.*;
import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;

public class C_Jatayu_s_Balanced_Bracket_Sequence {
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
                      
                       int nn=sc.nextInt();
                       String str=sc.next();
                       int n=str.length();
                       DSU dsu=new DSU(n);
                       Stack<Integer> stack=new Stack<>();
                       int last=1;
                       ArrayList<Pair> extra=new ArrayList<>();

                       for(int i=1;i<=n;i++){
                         char c=str.charAt(i-1);
                         if(c=='('){
                            stack.push(i);
                         }else{
                             if(!stack.isEmpty()){
                                 int curr=stack.pop();
                                 dsu.mu(curr,i);
                                 System.out.println("Making connection b/w: "  + curr +"," + i);
                             }
                         }


                            if(stack.isEmpty()){
                                System.out.println("Adding Pair :" + last + ", " + i);
                                 extra.add(new Pair(last,i));
                                 last=i+1;
                            }
                        }


 
                        for(int i=1;i<extra.size();i++){
                             dsu.mu(extra.get(i-1).p,extra.get(i).q);
                        }



                        int ans=0;
                        for(int i=1;i<dsu.arr.length;i++){
                             if(dsu.arr[i]==i) ++ans;
                        }

                       

                        // System.out.println("Total Extra:"  + extra + "   Extra Val:" + e);

                        System.out.println(ans);
                       

               
                 } 
        
    }
}
class DSU{
 

    int arr[];

    public DSU(int n){
         arr=new int[n+1];
         for(int i=1;i<=n;i++){
             arr[i]=i;
         }
    }


    public int gp(int x){
        if(arr[x]==x) return x;
        return arr[x]=gp(arr[x]);
    }

    public void mu(int a,int b){
         int pa=gp(a);
         int pb=gp(b);
         if(pa!=pb){
            arr[pb]=pa;
         }
    }


}

class Pair{
    int p , q;
    public Pair(int p,int q){
        this.p=p; this.q=q;
    }
}