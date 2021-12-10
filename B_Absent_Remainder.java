import java.util.*;
import java.lang.*;



public class B_Absent_Remainder{

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
         int n=sc.nextInt();
         int min=Integer.MAX_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            min=Math.min(min,arr[i]);
        }

       int req=n/2,count=0;
       for(int i:arr){
           if(count>=req) break;
           if(i>min){
              System.out.println(i+" "+min);
              ++count;
           }
       }

      

        
     }
}

}





