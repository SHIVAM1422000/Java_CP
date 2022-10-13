import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class D_Masha_and_a_Beautiful_Tree {
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
                       int arr[]=new int[n];
                       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
                       ArrayList<Pair> fh=new ArrayList<>();
                       ArrayList<Pair> sh=new ArrayList<>();
                       int idx=0;
                       for(;idx<(n/2);idx+=2){
                         if(arr[idx]<arr[idx+1]){
                             fh.add(new Pair(arr[idx], arr[idx+1]));
                         }else{
                            fh.add(new Pair(arr[idx+1], arr[idx]));
                         }
                       }

                       for(;idx<n;idx+=2){
                        if(arr[idx]<arr[idx+1]){
                            sh.add(new Pair(arr[idx], arr[idx+1]));
                        }else{
                           sh.add(new Pair(arr[idx+1], arr[idx]));
                        }
                      }


                      Collections.sort(fh,new Comparator<Pair>(){
                        public int compare(Pair one,Pair two){
                            if(one.f<two.f) return -1;
                            else if(one.f>two.f) return 1;
                            else return one.s-two.s;
                        }
                      });

                      Collections.sort(sh,new Comparator<Pair>(){
                        public int compare(Pair one,Pair two){
                            if(one.f<two.f) return -1;
                            else if(one.f>two.f) return 1;
                            else return one.s-two.s;
                        }
                      });


                      boolean check[]=new boolean[n+1];


                      int last=-1;
                      boolean flag=true;
                      for(Pair p:fh){
                        if(last==-1 ||((p.f+1)==p.s && (last+1)==p.f)){
                             check[p.f]=check[p.s]=true;
                        }else{
                            flag=flag&false;
                             break;
                        }
                      }

                      last=-1;
                      flag=true;
                      for(Pair p:sh){
                        if(last==-1 ||((p.f+1)==p.s && (last+1)==p.f)){
                             check[p.f]=check[p.s]=true;
                        }else{
                            flag=flag&false;
                             break;
                        }
                      }

                      for(int i=1;i<=n;i++){
                        if(check[i]==false){
                            flag=flag&false;
                            break;
                        }
                      }

                      if(flag){
                         System.out.println(n/2);
                      }else{
                        System.out.println(-1);
                      }






               
                 } 
        
    }
}


class Pair{

 int f,s;

 public Pair(int f,int s){
    this.f=f;
    this.s=s;
 }

}