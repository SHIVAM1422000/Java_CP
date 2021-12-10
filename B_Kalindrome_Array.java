
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 

public class B_Kalindrome_Array{

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


public static boolean check(int x,int arr[]){
    ArrayList<Integer> temp=new ArrayList<>();   
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=x) temp.add(arr[i]);
    }
    int i=0,j=temp.size()-1;
    while(i<=j){
        if(temp.get(i)!=temp.get(j)){
            return false;
        }else{
            ++i;
            --j;
        }
    }
    return true;
}

public static void main(String[] args){
    FastReader sc = new FastReader();
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        
         boolean ans=true;

         int i=0,j=n-1;
         while(i<=j){
             if(arr[i]==arr[j]){
                ++i;
                --j;
             }else{
                 ans=check(arr[i],arr) || check(arr[j],arr);
                 break; 
             }
         }
         
         if(ans==true) System.out.println("YES");
         else System.out.println("NO");
 
     }
}
}



