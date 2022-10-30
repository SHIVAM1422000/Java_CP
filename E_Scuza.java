import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import org.w3c.dom.html.HTMLAnchorElement;

public class E_Scuza {
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


    public static int bs(long arr[],long lim, long h[]){
          
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            long pow=(mid+1)*lim;
            if(arr[mid]>pow || h[mid]>lim){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        if(high==-1){
            return -1;
        }else{
            return (low-1);
        }

         
    }

    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
                while(t-->0){
                      
                       int n=sc.nextInt();
                       int q=sc.nextInt();
                       long arr[]=new long[n];
                       long a[]=new long[n];
                        long high[]=new long[n];
                       for(int i=0;i<n;i++){
                         long c=sc.nextLong();
                         a[i]=c;
                         if(i==0){
                            arr[i]=c;
                            high[i]=c;
                         }
                         else{ 
                            arr[i]=arr[i-1]+c;
                            high[i]=Math.max(high[i-1],c);
                        }
                       }

                    //    System.out.println("Prefix Array");
                    //    for(long l:arr) System.out.print(l+" ");
                    //    System.out.println();
                    //    System.out.println("Ans");
                       
                       while(q-->0){
                             
                            long lim=sc.nextLong();
                            int idx=bs(arr, lim , high);
                            if(idx==-1){
                                System.out.print(0+" ");
                            }else{
                                System.out.print(arr[idx]+" ");
                            }
                            // long ans=0;
                            // for(int i=0;i<n;i++){
                            //     if(a[i]<=lim){
                            //         ans+=a[i];
                            //     }else{
                            //         break;
                            //     }
                            // }
                            // System.out.print(ans+" ");
                            

                       }
               

                        System.out.println();

                 } 
        
    }
}
