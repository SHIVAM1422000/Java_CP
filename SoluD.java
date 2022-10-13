import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SoluD {
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
                       String str=sc.next();

                      pair a[]=new pair[n];
                      for(int i=0;i<n;i++) a[i]=new pair(arr[i], str.charAt(i));

                      Arrays.sort(a,new Comparator<pair>() {
                        public int compare(pair o,pair t){
                                if(o.c=='B') return -1;
                                else if(o.c=='R') return 1;
                                else {
                                    return o.n-t.n;
                                }
                        }
                      });

System.out.println("Arrray");
for(pair p:a) System.out.println(p.n+"," + p.c); 

                      boolean flag=true;

                      for(int i=1;i<=n;i++){
                        int curr=a[i-1].n;
                        char c=a[i-1].c;
                          if(curr>=i && c=='B'){
                             continue;
                          }else if(curr<=i && c=='R'){
                            continue;
                          }else{
                            System.out.println("Failed at index: " +i + " curr: " + curr + " c: " + c);
                             flag=false;
                             break;
                          }
                      }

                     
                   
                    if(flag) System.out.println("YES");
                    else System.out.println("NO");
               
                 } 
        
    }
}

class pair{

    int n;
    char c;

    public pair(int n,char c){
        this.n=n;
        this.c=c;
    }

}