import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class A_Compare_TShirt_Sizes {
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
                      
                    String a=sc.next();
                    String b=sc.next();

                     if(a.charAt(a.length()-1)==b.charAt(b.length()-1)){
                         if(a.charAt(a.length()-1)=='L'){
                            if(a.length()>b.length()){
                             System.out.println(">");
                         }else if(a.length()==b.length()){
                            System.out.println("=");
                         }else{
                            System.out.println("<");
                         }
                         }else{
                                if(a.length()>b.length()){
                                 System.out.println("<");
                             }else if(a.length()==b.length()){
                                System.out.println("=");
                             }else{
                                System.out.println(">");
                             }
                         
                     }}
                     else{
                        //    L S 
                        if(a.charAt(a.length()-1)=='L' && b.charAt(b.length()-1)=='S'){
                            System.out.println(">");
                        }
                        //    S L
                        if(a.charAt(a.length()-1)=='S' && b.charAt(b.length()-1)=='L'){
                            System.out.println("<");
                        }
                        // L M 
                        if(a.charAt(a.length()-1)=='L' && b.charAt(b.length()-1)=='M'){
                            System.out.println(">");
                        }
                        // M L 
                        if(a.charAt(a.length()-1)=='M' && b.charAt(b.length()-1)=='L'){
                            System.out.println("<");
                        }
                        // S M
                        if(a.charAt(a.length()-1)=='S' && b.charAt(b.length()-1)=='M'){
                            System.out.println("<");
                        }
                        // M s
                        if(a.charAt(a.length()-1)=='M' && b.charAt(b.length()-1)=='S'){
                            System.out.println(">");
                        }
                     }
               
                 } 
        
    }
}
