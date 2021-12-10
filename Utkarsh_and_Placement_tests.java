
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 

public class Utkarsh_and_Placement_tests{

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

public static void main(String[] args){
    FastReader sc = new FastReader();
     int t=sc.nextInt();
     while(t-->0){
          
        // String temp1=sc.next();
        // String temp2=sc.next();
        // String temp3=sc.next();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=3;i>0;i--) map.put(sc.next(),i);
        String temp4=sc.next();
        String temp5=sc.next();
        if(map.get(temp4)>map.get(temp5)) System.out.println(temp4);
        else System.out.println(temp5);
         
     }
}
}



// Scanner sc=new Scanner(System.in)