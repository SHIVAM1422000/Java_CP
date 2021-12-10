import java.util.*;

// import javax.swing.plaf.synth.SynthSeparatorUI;

import java.lang.*;

public class C_Minimum_Extraction{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     long t=sc.nextLong();
     while(t-->0){
      // Scanner sc=new Scanner(System.in);
      // int t=sc.nextInt();
      // while(t-->0) {
        int n=sc.nextInt();
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++) {
          arr[i]=sc.nextInt();
        }
        Arrays.parallelSort(arr);
        // System.out.println("Given Array");
        // for(int i:arr){
        //   System.out.print(i+" ");
        // }
        int max=arr[0];
        for(int i=1;i<n;i++) {
          max=Math.max(max,arr[i]-arr[i-1]);
        }
        System.out.println(max);
      }
        
         
        }
}
// }
