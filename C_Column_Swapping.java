import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C_Column_Swapping {
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


    public static int index(int arr[],int l,int h,int x){
        int index=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==x){
                 return mid;
            }else if(arr[mid]<x){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }

        return index;
    }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
                while(t-->0){
                      
                       int n=sc.nextInt();
                       int m=sc.nextInt();
                       int a[][]=new int[n][m];
                       int b[][]=new int[n][m];


                       for(int i=0;i<n;i++){
                         for(int j=0;j<m;j++){
                            int temp=sc.nextInt();
                            a[i][j]=temp;
                            b[i][j]=temp;
                        }   
                       }



                       for(int i=0;i<b.length;i++){
                           Arrays.sort(b[i]);
                       }



                  boolean ans=true,untwicked=true;

          
                  boolean vst[]=new boolean[m];


                    for(int i=0;i<n;i++){
                        if(i==0){
                           for(int j=0;j<m;j++){
                             if(a[i][j]!=b[i][j]){
                                untwicked=false;
                                 vst[j]=true;
                             }
                           }
                           
                        }else{
                            for(int j=0;j<m;j++){
                                if(a[i][j]!=b[i][j]){
                                    untwicked=false;
                                    if(vst[j]==false){
                                       
                                        ans=false;
                                        break;
                                    }

                                }
                              }
                        }
                        if(ans==false) break;

                    }

              System.out.println("New Case Answer");
                    if(ans){
                      
                           if(untwicked){
                               System.out.println(1+" "+1);
                           }else{
                               for(int i=0;i<m;i++){
                                if(a[0][i]!=b[0][i]){
                                    int idx=index(b[0], i , b.length, a[0][i]);
                                    System.out.println((i+1)+" "+(idx+1));
                                }
                            }
                           }

                            


                    }else{
                        System.out.println(-1);
                    }
                             




               
                 } 
        
    }
}

class Pair{
    int one,two;
    public Pair(int one,int two){
        this.one=one;
        this.two=two;
    }
}