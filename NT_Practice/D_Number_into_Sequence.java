import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_Number_into_Sequence {
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

    static int n=100000;
    static boolean prime[] = new boolean[n+1];
    static ArrayList<Integer> arr=new ArrayList<>();
    static void sieve()
    {

        Arrays.fill(prime, true);
         
        for(int p = 2; p*p<=n; p++)
        {
            if(prime[p] == true)
            {
                arr.add(p);
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }

    static boolean isPrime(long n){
        long count=0;
        for(long j=1;j*j<=n;j++){
            if(n%j==0){
                long i=n/j;
                ++count;
                if(i!=j) ++count;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }

     static void solve(long n){

        long number=n;
        // System.out.println("Checking for : "  +  n );

        long h=-1,hf=-1;

        if(n%2==0){
            long f=0;
            while(n%2==0){
                ++f;
                n/=2;
            }
            if(f>hf){
                hf=f; h=2;
            }
        }


        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                long f=0;
                while(n%i==0){
                    ++f; n/=i; 
                }
                if(f>hf){
                    hf=f; h=i;
                }
            }
        }

        if(n!=1){
            if(1>hf){
                hf=1;
                h=n;
            }
        }


    

        // System.out.println("Highest: " + h + " Highest Freq: " + hf);

        System.out.println(hf);
        while(hf>1){
            System.out.print(h+" "); --hf; number/=h;
        }


        System.out.print(number);
        System.out.println();


     }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
                while(t-->0){
                    long n=sc.nextLong();
                    solve(n);   
                 } 
        
    }
}


class Pair{
    long a,b;
    public Pair(long a,long b){
        this.a=a;
        this.b=b;
    }
}