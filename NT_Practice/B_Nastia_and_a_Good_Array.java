import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_Nastia_and_a_Good_Array {
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

    static int n=(int)Math.sqrt(1000000000);
    static ArrayList<Integer> primes=new ArrayList<>();
    static boolean prime[] = new boolean[n+1];

    static void sieve()
    {
      
       Arrays.fill(prime,true);
         
        for(int p = 2; p <=n; p++)
        {
            if(prime[p] == true)
            {
                primes.add(p);
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

    }

    static int gcd(int a, int b)
{
    if (a == 0)
        return b;
    return gcd(b % a, a);
}

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        sieve();
        int t = sc.nextInt();
                while(t-->0){
                      
                       int s=sc.nextInt();
                       int arr[]=new int[s];
                       for(int i=0;i<s;i++) arr[i]=sc.nextInt();
ArrayList<int[]> ans=new ArrayList<int[]>();

for(int i=1;i<s;i+=2){
    if(gcd(arr[i-1],arr[i])==1 && gcd(arr[i+1],arr[i])==1){
         continue;
        }
    else{

        for(int j:primes){
            if(j<Math.min(arr[i-1],arr[i])) continue;
        if(arr[i-1]%j!=0 && arr[i+1]%j!=0){
                if(arr[i-1]>arr[i]){
                    ans.add(new int[]{i-1+1,i+1,arr[i],j});
                    arr[i-1]=arr[i];
                }else{
                    ans.add(new int[]{i-1+1,i+1,arr[i-1],j});
                }

            }
            arr[i]=j;
            break;
        }

    }
}


System.out.println(ans.size());
for(int i[]:ans){
    for(int j:i) System.out.print(j+" ");
    System.out.println();
}


 /**
  * 
  System.out.println("final array");
  for(int i:arr) System.out.print(i+ " ");
  System.out.println();
  */




                 } 
        
    }
}
