
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 

public class Oliver_and_the_Game{

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


public static int timer=0;

 public static void dfs(ArrayList<ArrayList<Integer>> arr,int node,int itime[],int otime[],boolean vst[]){
     vst[node]=true;
     itime[node]=timer++;
     for(int j:arr.get(node)){
         if(vst[j]!=true) dfs(arr,j,itime,otime,vst);
     }
     otime[node]=timer++;
     return;
 }   



 //checks if a is in the subtree of b
 public static boolean check(int itime[],int otime[],int a,int b){
     if(itime[b]<itime[a] && otime[b]>otime[a]) return true;
     return false;
 }


public static void main(String[] args){
    FastReader sc = new FastReader();
    // Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
     for(int i=0;i<=n;i++) arr.add(new ArrayList<>());
     for(int i=0;i<n-1;i++){
        int a=sc.nextInt(),b=sc.nextInt();
        arr.get(a).add(b);
        arr.get(b).add(a);
     }

   


   
    int itime[]=new int[n+1];
    int otime[]=new int[n+1];
    boolean vst[]=new boolean[n+1];
    vst[0]=true;
    for(int i=1;i<n+1;i++) if(vst[i]!=true) dfs(arr,i,itime,otime,vst);
 

    // for(int i=1;i<itime.length;i++) System.out.println(i+":"+itime[i]+" "+otime[i]);

     int k=sc.nextInt();
     for(int i=0;i<k;k++){

         int cond=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
         boolean ans=false;
        
        //  System.out.println(cond+" "+a+" "+b);
        //  System.out.println(itime[a]+" "+itime[b]);
        //  System.out.println(otime[a]+" "+otime[b]);

         if(cond==0){
           ans=check(itime,otime,b,a);  
         }else{
           ans=check(itime,otime,a,b);  
         } 

        if(ans) System.out.println("YES");
        else System.out.println("NO");  

     }


}
}



